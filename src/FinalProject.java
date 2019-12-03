import java.util.List;
import java.util.Scanner;

public class FinalProject {

    List<RoboticsTeam> teams;
    public static void main(String[] args) {

    }
    void printOutput
    void addTeam()
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
        System.out.println("Enter Current Team RP");
        team.setRp(input.nextInt());
        System.out.println("Enter Current Team TBP");
        team.setTbp(input.nextInt());
        System.out.println("Enter Current matches played");
        team.setMatches(input.nextInt());
        System.out.println("Enter Highest score");
        team.setHighest(input.nextInt());
        teams.add(team);
    }
}
