package soccer.event;

import soccer.Player;

public abstract class GameEvent {
    private Player thePlayer;
    private double theTime;

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    public double getTheTime() {
        return theTime;
    }

    public void setTheTime(double theTime) {
        this.theTime = theTime;
    }

    public abstract boolean isGoal();
}