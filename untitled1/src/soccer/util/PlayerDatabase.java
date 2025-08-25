package soccer.util;

import soccer.Player;
import java.util.ArrayList;
import java.util.List;

public class PlayerDatabase {
    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) throws PlayerDatabaseException {
        if (player == null) {
            throw new PlayerDatabaseException("Player cannot be null");
        }
        players.add(player);
    }

    public List<Player> getPlayers() {
        return players;
    }
}
