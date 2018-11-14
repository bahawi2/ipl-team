package com.bahawi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bahawi.entities.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long>{

}
