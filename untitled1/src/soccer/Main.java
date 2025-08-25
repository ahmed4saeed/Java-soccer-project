package soccer;

import soccer.event.*;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player("Messi");
        Player p2 = new Player("Ronaldo");

        Team team1 = new Team("Team A");
        Team team2 = new Team("Team B");

        team1.addPlayer(p1);
        team2.addPlayer(p2);

        Game game = new Game(team1, team2);

        game.addEvent(new Kickoff());
        game.addEvent(new Goal());
        game.addEvent(new Possession());
        game.addEvent(new Goal());

        System.out.println("Match Events:");
        for (var event : game.getEvents()) {
            System.out.println(event);
        }

        GameResult result1 = new GameResult(team1, 2);
        GameResult result2 = new GameResult(team2, 1);

        System.out.println("\nFinal Score:");
        System.out.println(result1);
        System.out.println(result2);
    }
}