package br.com.lolstats.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lolstats.entities.Liga;
import br.com.lolstats.entities.Player;
import br.com.lolstats.repositories.LigaRepository;

@RestController 
@RequestMapping(value = "/ligas")
public class LigaResource {

	@Autowired
	private LigaRepository ligaRepository;

	@GetMapping // anotação que transforma o metodo para um endpoint que responda por uma
				// requisição get
	public ResponseEntity<List<Liga>> findAll() {
		List<Liga> ligas = ligaRepository.findAll();
		return ResponseEntity.ok().body(ligas); // resposta padrão "bonitinha"
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Liga> findById(@PathVariable Long id) {
		Liga liga = ligaRepository.findById(id).get();
		return ResponseEntity.ok().body(liga);
	}

}
