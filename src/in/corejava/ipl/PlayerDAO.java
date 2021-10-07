package in.corejava.ipl;

import java.util.List;

public interface PlayerDAO {

	void addPlayer(Player player);
	void updatePlayer(Player player);
	void deletePlayer(Player player);
	Player getPlayer(String fname, String lname, String team);
	Player getPlayerByID(int id);
	List<Player> getPlayersByTeam(String team);
	List<Player> getBowlersByTeam(String team);
	List<Player> getBatsmanByTeam(String team);

}
