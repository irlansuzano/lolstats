package br.com.lolstats.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lolstats.entities.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long>{
 
}