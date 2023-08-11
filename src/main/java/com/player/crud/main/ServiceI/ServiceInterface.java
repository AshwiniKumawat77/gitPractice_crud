package com.player.crud.main.ServiceI;

import com.player.crud.main.Model.Player;

public interface ServiceInterface {

	void savePlayer(Player player);

	Iterable<Player> getPlayer();

	void deletePlayer(int id);

}
