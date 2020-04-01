package a_Zadania.a_Dzien_1.b_Metody;


public class Main10 {

    public static void main(String[] args) {
        System.out.println(whoWon(2, 3, 4, 5));
    }


    public static String whoWon(int firstTeamGoalsHome, int firstTeamGoalsAway, int secondTeamGoalsHome, int secondTeamGoalsAway) {
        if ((firstTeamGoalsHome + firstTeamGoalsAway) > (secondTeamGoalsAway + secondTeamGoalsHome)) {
            return "First team won!";
        } else if (((firstTeamGoalsHome + firstTeamGoalsAway) < (secondTeamGoalsAway + secondTeamGoalsHome))) {
            return "Second team won!";
        } else if ((firstTeamGoalsAway + firstTeamGoalsAway) == (secondTeamGoalsAway + secondTeamGoalsHome)) {
            if (firstTeamGoalsAway > secondTeamGoalsAway) {
                return "First team won!";
            } else if (firstTeamGoalsAway < secondTeamGoalsAway) {
                return "Second team won!";
            }

        }
        return "extra time or penalties are needed";
    }
}