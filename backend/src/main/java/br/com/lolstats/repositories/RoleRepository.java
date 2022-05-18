package br.com.lolstats.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lolstats.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{    
 

}