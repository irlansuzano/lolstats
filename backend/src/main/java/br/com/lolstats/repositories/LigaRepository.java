package br.com.lolstats.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.lolstats.entities.Liga;
import br.com.lolstats.entities.Player;

@Component
public class LigaRepository {  
 
	private Map<Long, Liga> ligas = new HashMap<>();

	public void save(Liga liga) {
		ligas.put(liga.getId(), liga);
	}

	public Liga findById(Long id) {
		return ligas.get(id);
	}

	public List<Liga> findAll() {

		return new ArrayList<Liga>(ligas.values());
	}
}