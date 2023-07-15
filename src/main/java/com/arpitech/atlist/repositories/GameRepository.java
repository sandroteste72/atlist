package com.arpitech.atlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arpitech.atlist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
