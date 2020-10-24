package pl.pjatk.gameplay.service;

import org.springframework.stereotype.Service;
import pl.pjatk.gameplay.model.Player;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    public List<Player> findAll() {
        List<Player> playerList = new ArrayList<Player>();
        Player player1 = new Player(1,"Player one", 10, 100);
        Player player2 = new Player(2, "Player two", 10, 100);
        playerList.add(player1);
        playerList.add(player2);
        return playerList;
    }
}
