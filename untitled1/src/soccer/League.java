package soccer;

import java.util.ArrayList;
import java.util.List;

public class League {
    private String name;
    private List<Team> teams = new ArrayList<>();
    private List<Game> games = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public List<Team> getTeams() {
        return teams;
    }

    public List<Game> getGames() {
        return games;
    }
}