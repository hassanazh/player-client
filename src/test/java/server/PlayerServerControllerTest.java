package server;

import static org.junit.Assert.*;

import com.server.model.Player;
import com.server.service.PlayerServerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PlayerServerControllerTest {

    @InjectMocks
    private PlayerServerService playerServerService;

    @Test
    public void recordsSizeTest() {
        assertEquals(playerServerService.getPlayerCredential().size(), 20);
    }

    @Test
    public void sizeOfAPlayerRecordTest() {
        assertEquals(playerServerService.getPlayerCredential().get(0).playerId, "11119");
        assertEquals(playerServerService.getPlayerCredential().get(0).playerName, "Lionel Messi");
    }

    @Test
    public void singlePlayerTest() {
        Player player = playerServerService.getSinglePlayer("11119");
        assertEquals(player.getLastName(), "Messi");
        assertEquals(player.getPlayerId(), "11119");
        assertEquals(player.getAge(), "27");
        assertEquals(player.getApps(), "24");
        assertEquals(player.getAerialWonPerGame(), "0.2916666667");
        assertEquals(player.getName(), "Lionel Messi");
    }
}
