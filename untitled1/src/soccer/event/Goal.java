package soccer.event;

public class Goal extends GameEvent {

    @Override
    public boolean isGoal() {
        return true;
    }

    @Override
    public String toString() {
        return "GOAL!";
    }
}
