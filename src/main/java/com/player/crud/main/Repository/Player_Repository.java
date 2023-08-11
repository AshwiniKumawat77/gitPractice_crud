package com.player.crud.main.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.player.crud.main.Model.Player;

@Repository
public interface Player_Repository extends CrudRepository<Player, Integer>{

}
