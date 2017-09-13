package server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


@RestController
@SpringBootApplication
public class PlayerServer {
    String fileNameDefined = "players.csv";
    BufferedReader br = null;

    private ArrayList<Player> readCsvFile() {
        ArrayList<Player> players = new ArrayList<>();

        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource(fileNameDefined).getFile());
            br = new BufferedReader(new FileReader(file));
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {

                String[] entries = line.split(",");

                Player player = new Player(entries[0],
                        entries[1],
                        entries[2],
                        entries[3],
                        entries[4],
                        entries[5],
                        entries[6],
                        entries[7],
                        entries[8],
                        entries[9],
                        entries[10],
                        entries[11],
                        Boolean.parseBoolean(entries[12]),
                        Boolean.parseBoolean(entries[13]),
                        entries[14],
                        entries[15],
                        entries[16],
                        entries[17],
                        entries[18],
                        entries[19],
                        entries[20],
                        entries[21],
                        entries[22],
                        entries[23],
                        entries[24],
                        entries[25],
                        entries[26],
                        entries[27],
                        entries[28],
                        entries[29],
                        entries[30],
                        entries[31],
                        entries[32],
                        Boolean.parseBoolean(entries[33]),
                        entries[34],
                        entries[35]);

                players.add(player);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return players;
    }

    private ArrayList<PlayerCredentials> getPlayerCredential(){
        ArrayList<PlayerCredentials> players = new ArrayList<>();
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource(fileNameDefined).getFile());
            br = new BufferedReader(new FileReader(file));
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {

                String[] entries = line.split(",");

                PlayerCredentials player = new PlayerCredentials(
                        entries[11],
                        entries[32]);

                players.add(player);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return players;
    }

    @RequestMapping(value = "/api/players")
    public ArrayList<PlayerCredentials> getAllPlayers() {
        return getPlayerCredential();
    }

    @RequestMapping(value = "/api/players/{playerId}")
    public Player getSinglePlayer(@PathVariable String playerId) {
    ArrayList<Player> players = readCsvFile();
    for(Player player : players) {
        if(player.getPlayerId().equals(playerId)) {
            return player;
        }
    }

    return null;
    }

    public static void main(String[] args) {
        SpringApplication.run(PlayerServer.class, args);
    }
}
