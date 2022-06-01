package br.com.lolstats.resources;

import br.com.lolstats.entities.Liga;
import br.com.lolstats.repositories.LigaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/ligas")
public class LigaResource {

    @Autowired
    private LigaRepository ligaRepository;

    @GetMapping(value ="/")
    public List<Liga>   findAll() {
        List<Liga> ligas = ligaRepository.findAll();
        return ligas.stream().map(Liga::converter).collect(Collectors.toList());
    }

    @GetMapping(value = "/{id}")
    public Liga findById(@PathVariable Long id) {
        Liga liga = ligaRepository.findById(id).get();
        return Liga.converter(liga);
    }

}
