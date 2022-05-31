package br.com.lolstats.resources;

import br.com.lolstats.entities.Usuario;
import br.com.lolstats.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController 
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping // anotação que transforma o metodo para um endpoint que responda por uma
				// requisição get
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		return ResponseEntity.ok().body(usuarios); // resposta padrão "bonitinha"
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Long id) {
		Usuario usuarios = usuarioRepository.findById(id).get();
		return ResponseEntity.ok().body(usuarios);
	}

}
