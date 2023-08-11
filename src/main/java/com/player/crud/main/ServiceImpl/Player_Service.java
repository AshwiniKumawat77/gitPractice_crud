package com.player.crud.main.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.player.crud.main.Model.Player;
import com.player.crud.main.Repository.Player_Repository;
import com.player.crud.main.ServiceI.ServiceInterface;

@Service
public class Player_Service implements ServiceInterface{
	
	@Autowired
	Player_Repository r;

	@Override
	public void savePlayer(Player player) {
	r.save(player);
	}

	@Override
	public Iterable<Player> getPlayer() {
		// TODO Auto-generated method stub
		return r.findAll();
	}

	@Override
	public void deletePlayer(int id){
		r.deleteById(id);
		
	}

}
