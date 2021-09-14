package in.corejava.ipl;

import java.util.ArrayList;
import java.util.List;

public class Players {
	
	
public List<Player> playersList = new ArrayList<Player>();
	
	


	public Players(List<Player> playersList) {
	// TODO Auto-generated constructor stub#
		this.playersList = playersList;
}



	public List<Player> getPlayerList() {
		return playersList;
	}



	public void setPlayerList(List<Player> playersList) {
		this.playersList = playersList;
	}


}
