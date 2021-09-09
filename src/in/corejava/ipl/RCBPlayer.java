package in.corejava.ipl;

import java.util.ArrayList;
import java.util.List;

public class RCBPlayer {

	
	public List<String> playersList = new ArrayList<String>();
	
	
	public RCBPlayer() {
		playersList.add(" >> CAPTAIN - Virat Koli");
		playersList.add(">> WICKET KEEPER - AB de villers");
		playersList.add(">> BATSMAN - DevDUtt Padikal");
		playersList.add(">> BOWLER - Yuzvendra Chahal");

	}
	
	
	public List<String> getPlayersList() {
		return playersList;
	}


	public void setPlayersList(List<String> playersList) {
		this.playersList = playersList;
	}


	public String[] getRCBPlayers() {
		return RCBPlayers;
	}



	public void setRCBPlayers(String[] rCBPlayers) {
		RCBPlayers = rCBPlayers;
	}
	
	public String [] RCBPlayers = {" >> CAPTAIN - Virat Koli", 
			">> WICKET KEEPER - AB de villers", 
			">> BATSMAN - DevDUtt Padikal",
			">> BOWLER - Yuzvendra Chahal"};

}
