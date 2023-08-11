package com.player.crud.main.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.player.crud.main.Model.Player;
import com.player.crud.main.Model.PlayerRecord;
import com.player.crud.main.ServiceI.ServiceInterface;

@CrossOrigin
@RestController
public class Player_Controller {
	@Autowired
	ServiceInterface s;
	
	@GetMapping("/getplay")
	public List<Player> play(){
		
		PlayerRecord rec = new PlayerRecord();
		rec.setId(1);
		rec.setToatalWickets(31);
		rec.setTotalRun(5454);
		rec.setTotalSix(85);
		rec.setTotalFour(55);
		
		Player p = new Player();
		p.setId(1);
		p.setPlayerName("ashwini");
		p.setPlayerAge(21);
		p.setPlayerState("MH");
		p.setPlayerContactno(545225);
		p.setPlayerEmail("ajnkjni");
		p.setPlayerRecord(rec);
		
		List<Player> list = new ArrayList<>();
		list.add(p);
		return list;
		
	}
	
	@PostMapping("/setPlayer")
	public void savePlayer(@RequestBody Player player) {
		s.savePlayer(player);
		//return "data save successfully";
	}

	@GetMapping("/getPlayer")
	public Iterable<Player> getPlayer(){
		return s.getPlayer();
	}
	
	@PutMapping("/editPlayer/{id}")
	public Iterable<Player> editPlayer(@RequestBody Player player,@PathVariable("id") int id){
		s.savePlayer(player);
		return s.getPlayer();
	}
	
	@DeleteMapping("deletePlayer/{id}")
	public void deltePlayer(@PathVariable("id") int id){
		s.deletePlayer(id);
		
	}
}
