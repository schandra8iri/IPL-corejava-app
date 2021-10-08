package in.corejava.ipl;

import java.util.ArrayList;
import java.util.List;

public class CSKPlayers {
	
	
	public List<String> playerList = new ArrayList<String>();
	
	


	public List<String> getPlayerList() {
		return playerList;
	}



	public void setPlayerList(List<String> playerList) {
		this.playerList = playerList;
	}



	public CSKPlayers() {
		playerList.add(" >> CAPTAIN - MS Dhoni");
		playerList.add(">> WICKET KEEPER - MS Dhoni");
		playerList.add(">> BATSMAN - Ambatti Rayudu");
		playerList.add(">> BOWLER - Ravindra Jadeja");
	}



	public String[] getCSKPlayers() {
		return CSKPlayers;
	}



	public void setCSKPlayers(String[] cSKPlayers) {
		CSKPlayers = cSKPlayers;
	}



	
	public String [] CSKPlayers = {" >> CAPTAIN - MS Dhoni", 
			">> WICKET KEEPER - MS Dhoni", 
			">> BATSMAN - Ambatti Rayudu",
			">> BOWLER - Ravindra Jadeja"};
}
