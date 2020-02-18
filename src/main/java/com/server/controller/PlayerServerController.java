package com.server.controller;

import com.server.service.PlayerServerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.server.model.Player;
import com.server.model.PlayerCredentials;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/players")
public class PlayerServerController {
    @Autowired
    PlayerServerService playerServerService;

    @GetMapping
    public List<PlayerCredentials> getAllPlayers() {
        return playerServerService.getPlayerCredential();
    }

    @GetMapping(value = "/{playerId}")
    public Player getSinglePlayer(@PathVariable String playerId) {
        return playerServerService.getSinglePlayer(playerId);
    }
}


