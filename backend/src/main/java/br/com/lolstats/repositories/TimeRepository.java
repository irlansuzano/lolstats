package br.com.lolstats.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lolstats.entities.Time;

@Repository
public interface TimeRepository extends JpaRepository<Time,Long>{

}