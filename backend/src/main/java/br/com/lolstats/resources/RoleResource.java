package br.com.lolstats.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lolstats.entities.Player;
import br.com.lolstats.entities.Role;
import br.com.lolstats.repositories.RoleRepository;

@RestController 
@RequestMapping(value = "/roles")
public class RoleResource {

	@Autowired
	private RoleRepository roleRepository;

	@GetMapping // anotação que transforma o metodo para um endpoint que responda por uma
				// requisição get
	public ResponseEntity<List<Role>> findAll() {
		List<Role> roles= roleRepository.findAll();
		return ResponseEntity.ok().body(roles); // resposta padrão "bonitinha"
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Role> findById(@PathVariable Long id) {
		Role role = roleRepository.findById(id).get();
		return ResponseEntity.ok().body(role);
	}

}
