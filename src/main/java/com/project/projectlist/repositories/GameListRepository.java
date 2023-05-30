package com.project.projectlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.projectlist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
