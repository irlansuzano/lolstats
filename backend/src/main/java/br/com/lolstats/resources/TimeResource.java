package br.com.lolstats.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lolstats.entities.Time;
import br.com.lolstats.repositories.TimeRepository;

@RestController
@RequestMapping(value = "/times")
public class TimeResource {

	@Autowired
	private TimeRepository timeRepository;

	@GetMapping // anotação que transforma o metodo para um endpoint que responda por uma
				// requisição get
	public ResponseEntity<List<Time>> findAll() {
		List<Time> times = timeRepository.findAll();
		return ResponseEntity.ok().body(times); // resposta padrão "bonitinha"
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Time> findById(@PathVariable Long id) {
		Time time = timeRepository.findById(id);
		return ResponseEntity.ok().body(time);
	}

}
