package com.bahawi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bahawi.entities.Team;
@Repository
public interface TeamRepository extends CrudRepository<Team, Long>{

}
