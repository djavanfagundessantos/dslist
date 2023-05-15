package com.codeone.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeone.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
