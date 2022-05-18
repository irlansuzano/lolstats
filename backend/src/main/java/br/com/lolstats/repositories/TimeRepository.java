package br.com.lolstats.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.lolstats.entities.Time;

@Component
public class TimeRepository {

	private Map<Long, Time> times = new HashMap<>();

	public void save(Time time) {
		times.put(time.getIdTime(), time);
	}

	public Time findById(Long id) {
		return times.get(id);
	}

	public List<Time> findAll() {

		return new ArrayList<Time>(times.values());
	}
}