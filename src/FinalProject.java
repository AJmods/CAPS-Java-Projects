import com.company.TableGenerator;
import javafx.scene.control.Tab;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FinalProject {

    static List<RoboticsTeam> teams = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true)
        {
            System.out.println("Choose Option");
            System.out.println("1. add team");
            System.out.println("2. print teams");
            int choice = input.nextInt();
            if (choice == 1) addTeam();
            else if (choice == 2) printTeams();
        }

    }
    static void addTeam()
    {
        Scanner input = new Scanner(System.in);
        RoboticsTeam team = new RoboticsTeam();
        System.out.println("Enter Team number");
        team.setNumber(input.nextInt());
        System.out.println("Enter Team Name");
        team.setName(input.next());
        System.out.println("Enter Team School/Affiliation");
        team.setSchool(input.next());
        System.out.println("Enter Team City");
        team.setCity(input.next());
        System.out.println("Enter Team State");
        team.setState(input.next());
        System.out.println("Enter Average Team RP");
        team.setRp(input.nextInt());
        System.out.println("Enter Average Team TBP");
        team.setTbp(input.nextInt());
        System.out.println("Enter Current matches played");
        team.setMatches(input.nextInt());
        System.out.println("Enter Highest score");
        team.setHighest(input.nextInt());
        teams.add(team);
    }
    static void printTeams()
    {
        //Table Generator class from https://stackoverflow.com/questions/2745206/output-in-a-table-format-in-javas-system-out
        TableGenerator tableGenerator = new TableGenerator();

        Field[] fields = RoboticsTeam.class.getFields();

        List<String> headerList = new ArrayList<>();

        for (Field field : fields)
        {
            headerList.add(field.getName());
        }

        List<List<String>> rowList = new ArrayList<>();

        for (int i = 0; i <teams.size(); i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < fields.length; j++) {
                row.add(teams.get(i).getStat(j));
            }
            rowList.add(row);
        }
        System.out.println(tableGenerator.generateTable(headerList,rowList));
    }
}
