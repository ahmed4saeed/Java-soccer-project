package soccer.event;

public class Possession extends GameEvent {

    @Override
    public boolean isGoal() {
        return false;
    }

    @Override
    public String toString() {
        return "Possession";
    }
}
