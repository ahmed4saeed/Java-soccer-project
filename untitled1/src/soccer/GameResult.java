package soccer;

public class GameResult {
    private Team team;
    private int goals;

    public GameResult(Team team, int goals) {
        this.team = team;
        this.goals = goals;
    }

    public Team getTeam() {
        return team;
    }

    public int getGoals() {
        return goals;
    }

    @Override
    public String toString() {
        return team.getTeamName() + " scored " + goals + " goals";
    }
}
