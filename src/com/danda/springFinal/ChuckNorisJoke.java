package com.danda.springFinal;

public class ChuckNorisJoke {

    private String joke="";
    private int rating=0;
    private boolean isGood=false;

    public ChuckNorisJoke(String joke, int rating) {
        this.joke = joke;
        this.rating = rating;
    }
    public ChuckNorisJoke(String joke) {
        this.joke = joke;
        rating = 0;
    }
    public ChuckNorisJoke() {}

    public String getJoke() {
        return joke;
    }
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    public boolean isGoodJoke() {
        return getRating() > 5;
    }

    @Override
    public String toString() {
        return "ChuckNorisJoke{" +
                "joke='" + joke + '\'' +
                ", rating=" + rating +
                '}';
    }
}
