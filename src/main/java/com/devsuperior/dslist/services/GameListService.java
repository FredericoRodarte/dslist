package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository GameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		  //List<>Game result = gameRepository.findAll();	
		  var result = GameListRepository.findAll();
		  return result.stream().map(  x -> new GameListDTO(x)  ).toList();
		  
		}	
	
}
