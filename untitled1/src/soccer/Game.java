package soccer;

import soccer.event.GameEvent;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private List<GameEvent> events = new ArrayList<>();

    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public void addEvent(GameEvent event) {
        events.add(event);
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public List<GameEvent> getEvents() {
        return events;
    }
}
