package com.server.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.springframework.stereotype.Service;
import com.server.model.Player;
import com.server.model.PlayerCredentials;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Objects;

@Slf4j
@Service
public class PlayerServerService {
    String fileNameDefined = "players.csv";
    BufferedReader br = null;

    private ArrayList<Player> readCsvFile() {
        ArrayList<Player> players = new ArrayList<>();

        try {
            readPlayerRecords()
                    .forEach(record -> {
                        Player player = new Player(
                                record.get("ranking"),
                                record.get("seasonId"),
                                record.get("seasonName"),
                                record.get("tournamentId"),
                                record.get("tournamentRegionId"),
                                record.get("tournamentRegionCode"),
                                record.get("regionCode"),
                                record.get("tournamentName"),
                                record.get("tournamentShortName"),
                                record.get("firstName"),
                                record.get("lastName"),
                                record.get("playerId"),
                                Boolean.parseBoolean(record.get("isActive")),
                                Boolean.parseBoolean(record.get("isOpta")),
                                record.get("teamId"),
                                record.get("teamName"),
                                record.get("playedPositions"),
                                record.get("age"),
                                record.get("height"),
                                record.get("weight"),
                                record.get("positionText"),
                                record.get("apps"),
                                record.get("subOn"),
                                record.get("minsPlayed"),
                                record.get("rating"),
                                record.get("goal"),
                                record.get("assistTotal"),
                                record.get("yellowCard"),
                                record.get("redCard"),
                                record.get("shotsPerGame"),
                                record.get("aerialWonPerGame"),
                                record.get("manOfTheMatch"),
                                record.get("name"),
                                Boolean.parseBoolean(record.get("isManOfTheMatch")),
                                record.get("playedPositionsShort"),
                                record.get("passSuccess"));

                        players.add(player);
                    });
        } catch (IOException e) {
            log.error("Error in reading file: {}", e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    log.error("Error in closing file buffer: {}", e.getMessage());
                }
            }
        }

        return players;
    }

    private CSVParser readPlayerRecords() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(Objects.requireNonNull(classLoader.getResource(fileNameDefined)).getFile());

        return CSVFormat.RFC4180.withFirstRecordAsHeader().parse(Files.newBufferedReader(file.toPath()));
    }

    public ArrayList<PlayerCredentials> getPlayerCredential() {
        ArrayList<PlayerCredentials> players = new ArrayList<>();
        try {
            readPlayerRecords()
                    .forEach(record -> {
                        PlayerCredentials player = new PlayerCredentials(
                                record.get("playerId"),
                                record.get("name"));
                        players.add(player);
                    });
        } catch (IOException e) {
            log.error("Error while reading CSV: {}", e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    log.error("Failed to close the buffer: {}", e.getMessage());
                }
            }
        }

        return players;
    }

    public Player getSinglePlayer(String playerId) {
        return readCsvFile()
                .stream()
                .filter(player -> player.getPlayerId().equals(playerId))
                .findFirst().orElse(null);
    }
}
