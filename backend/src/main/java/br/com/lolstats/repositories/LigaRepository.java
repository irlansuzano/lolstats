package br.com.lolstats.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lolstats.entities.Liga;

@Repository
public interface LigaRepository extends JpaRepository<Liga , Long> {  
 
}