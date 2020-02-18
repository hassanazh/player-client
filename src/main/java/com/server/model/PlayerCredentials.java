package com.server.model;

import lombok.Data;

@Data
public class PlayerCredentials {
    public String playerName;
    public String playerId;

    public PlayerCredentials(String playerId, String playerName) {
        this.playerName = playerName;
        this.playerId = playerId;
    }
}
