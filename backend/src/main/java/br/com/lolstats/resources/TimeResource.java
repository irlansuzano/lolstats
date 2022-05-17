package br.com.lolstats.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lolstats.entities.Liga;
import br.com.lolstats.entities.Time;

@RestController
@RequestMapping(value = "/times")
public class TimeResource {

	@GetMapping //anotação que transforma o metodo para um endpoint que responda por uma requisição get
	public ResponseEntity<List<Time>> findAll(){
		List<Time> times = new ArrayList<>();
		times.add(new Time(1,"INTZ",45.5,50.0,50.0,70.0,4,"23:30:21",new Liga(1,"CBLOL"))); 
		times.add(new Time(1,"FLAMENGO",45.5,50.0,50.0,70.0,4,"23:30:21",new Liga(1,"CBLOL"))); 
		return ResponseEntity.ok().body(times); // resposta padrão "bonitinha"
	}
	
	
	

}
