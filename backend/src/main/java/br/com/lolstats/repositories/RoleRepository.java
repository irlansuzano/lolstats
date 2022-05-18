package br.com.lolstats.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.lolstats.entities.Role;

@Component
public class RoleRepository {    
 
	private Map<Long, Role> roles = new HashMap<>();

	public void save(Role role) {
		roles.put(role.getId(), role);
	}

	public Role findById(Long id) {
		return roles.get(id);
	}

	public List<Role> findAll() {

		return new ArrayList<Role>(roles.values());
	}
}