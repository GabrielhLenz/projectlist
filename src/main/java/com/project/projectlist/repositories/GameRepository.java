package com.project.projectlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.projectlist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
