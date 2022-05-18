package br.com.lolstats.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lolstats.entities.Player;
import br.com.lolstats.repositories.PlayerRepository;

@RestController 
@RequestMapping(value = "/players")
public class PlayerResource {

	@Autowired
	private PlayerRepository playerRepository;

	@GetMapping // anotação que transforma o metodo para um endpoint que responda por uma
				// requisição get
	public ResponseEntity<List<Player>> findAll() {
		List<Player> players = playerRepository.findAll();
		return ResponseEntity.ok().body(players); // resposta padrão "bonitinha"
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Player> findById(@PathVariable Long id) {
		Player player = playerRepository.findById(id).get();
		return ResponseEntity.ok().body(player);
	}

}
