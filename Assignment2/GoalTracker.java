package Assignment2;
import Assignment2.NumberOfGoals;
public class GoalTracker {

    public static void main(String[] args) {

        NumberOfGoals team1 = new NumberOfGoals();
        NumberOfGoals team2 = new NumberOfGoals();

        System.out.println(team1.getGoal());

        team2.setGoal();

        System.out.println(team2.getGoal());

        team1.setGoal();
        team1.setGoal();
        team1.setGoal();

        System.out.println(team1.getGoal());

    }
}