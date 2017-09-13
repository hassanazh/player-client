package server;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerServerTest {

    private PlayerServer playerServer = new PlayerServer();

    @Test
    public void recordsSizeTest() {
        assertEquals(playerServer.getAllPlayers().size(), 20);
    }

    @Test
    public void sizeOfAPlayerRecordTest() {
        assertEquals(playerServer.getAllPlayers().get(0).playerId, "11119");
        assertEquals(playerServer.getAllPlayers().get(0).playerName, "Lionel Messi");
    }

    @Test
    public void singlePlayerTest() {
        Player player = playerServer.getSinglePlayer("11119");
        assertEquals(player.getLastName(), "Messi");
        assertEquals(player.getPlayerId(), "11119");
        assertEquals(player.getAge(), "27");
        assertEquals(player.getApps(), "24");
        assertEquals(player.getAerialWonPerGame(), "0.2916666667");
        assertEquals(player.getName(), "Lionel Messi");
    }
}
