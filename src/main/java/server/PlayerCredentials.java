package server;

public class PlayerCredentials {
    String playerName;
    String playerId;

    public PlayerCredentials(String playerId, String playerName) {
        this.playerName = playerName;
        this.playerId = playerId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }
}
