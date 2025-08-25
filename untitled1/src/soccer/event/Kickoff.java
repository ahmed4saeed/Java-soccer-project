package soccer.event;

public class Kickoff extends GameEvent {

    @Override
    public boolean isGoal() {
        return false;
    }

    @Override
    public String toString() {
        return "Kickoff";
    }
}
