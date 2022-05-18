package br.com.lolstats.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.lolstats.entities.Player;

@Component
public class PlayerRepository {
 
	private Map<Long, Player> players = new HashMap<>();

	public void save(Player player) {
		players.put(player.getId(), player);
	}

	public Player findById(Long id) {
		return players.get(id);
	}

	public List<Player> findAll() {

		return new ArrayList<Player>(players.values());
	}
}