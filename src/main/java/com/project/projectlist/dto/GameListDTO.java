package com.project.projectlist.dto;

import org.springframework.beans.BeanUtils;

import com.project.projectlist.entities.GameList;

public class GameListDTO {

	public Long id;
	public String name;
	
	public GameListDTO() {
		
	}

	public GameListDTO(GameList entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
