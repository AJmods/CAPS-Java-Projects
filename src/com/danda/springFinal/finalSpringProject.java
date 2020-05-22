package com.danda.springFinal;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class finalSpringProject {

    int[] jokeRatingCount = {0,0,0,0,0,0,0,0,0,0};
    
    //readall() and readJsonFromUrl() are from https://stackoverflow.com/questions/4308554/simplest-way-to-read-json-from-a-url-in-java

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    public static void main(String[] args) throws IOException, JSONException {
        Scanner scanner = new Scanner(System.in);
        double accept = 0;
        JSONObject chuckJokes;
        do {
            System.out.println("Enter Search term");
            String term = scanner.next();
            scanner = new Scanner(System.in); //prevents error
            chuckJokes = readJsonFromUrl("https://api.chucknorris.io/jokes/search?query=" + term);
            int results = (int) chuckJokes.get("total");
            System.out.println("This term got " + results + " results");
            if (results>0) {
                System.out.println("Is this okay, enter 0 for no and 1 for yes");
                accept = scanner.nextDouble();
            } else {
                System.out.println("Please Enter another search term that has results this time");
                accept = 0;
            }

        } while (accept != 1);

        JSONArray jokeArray = (JSONArray) chuckJokes.get("result");

        ChuckNorisJoke[] jokes = extractJokes(jokeArray);

        int rating = 0;
        System.out.println("Please rate this jokes from a scale from 1-10.  Enter -1 to give up on this");
        for (int i = 0; i < jokes.length && rating!=-1; i++) {
            System.out.println("Please rate Joke " + (i+1) + ":");
            System.out.println(jokes[i].getJoke());
            //int rating = 0;
            do {
                rating = scanner.nextInt();
                if ((rating <=0 || rating > 10) && rating!=-1) System.out.println("Enter a valid rating between 1 and 10");
                else if (rating != -1) {
                    jokes[i].setRating(rating);
                }
            } while ((rating <=0 || rating > 10) && rating!=-1); //run until valid rating
        }
        evaluateAndSaveJokes(jokes);
        //System.out.println(jokes);
    }
    public static void evaluateAndSaveJokes(ChuckNorisJoke[] jokes, String filePath)
    {
        StringBuilder sb = new StringBuilder();
        List<ChuckNorisJoke>[] jokeRatingCount = new ArrayList[11]; //1-10 is rating, 0 is unrated
        for (int i = 0; i < jokeRatingCount.length; i++) jokeRatingCount[i] = new ArrayList<>();
        for (ChuckNorisJoke joke : jokes)
        {
            jokeRatingCount[joke.getRating()].add(joke);
        }
        for (int i = 10; i >= 0; i--) {
            if (jokeRatingCount[i].size() != 0)
            switch (i) {
                case 10:
                    sb.append("--------------------------------\n").append("AMAZING JOKES").append("\n--------------------------------");
                    break;
                case 9:
                    sb.append("--------------------------------\n").append("GREAT JOKES").append("\n--------------------------------");
                    break;
                case 8:
                    sb.append("--------------------------------\n").append("GOOD JOKES").append("\n--------------------------------");
                    break;
                case 7:
                    sb.append("--------------------------------\n").append("DECENT JOKES").append("\n--------------------------------");
                    break;
                case 6:
                    sb.append("--------------------------------\n").append("OKAY JOKES").append("\n--------------------------------");
                    break;
                case 5:
                    sb.append("--------------------------------\n").append("HORRIBLE JOKES").append("\n--------------------------------");
                    break;
                case 0:
                    sb.append("--------------------------------\n").append("NOT RATED JOKES").append("\n--------------------------------");
                    break;
            }
            sb.append("\n");
            for (ChuckNorisJoke joke : jokeRatingCount[i])
            {
                sb.append(joke.getJoke()).append(", rating = ").append(joke.getRating()).append("\n");
            }
        }

        try {
            FileWriter fileWriter = new FileWriter(filePath+"jokes.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(sb.toString());
            printWriter.close();
            fileWriter.close();
            System.out.println("JOKES WRITEN");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static void evaluateAndSaveJokes(ChuckNorisJoke[] jokes) { evaluateAndSaveJokes(jokes, "");}
    public static ChuckNorisJoke[] extractJokes(JSONArray jsonArray)
    {
        ChuckNorisJoke[] jokes = new ChuckNorisJoke[jsonArray.length()];
        for (int i = 0; i < jokes.length; i++)
        {
            jokes[i] = new ChuckNorisJoke((String) jsonArray.getJSONObject(i).get("value"));
        }
        return jokes;
    }
}
