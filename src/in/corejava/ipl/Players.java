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



	@Override
	public String toString() {
		
		String ListOfPlayers = "" ;
		
		  for(Player player : playersList) {
			  //System.out.println("from Players");
			  
			  //System.out.println(player.toString());
			  ListOfPlayers =  ListOfPlayers.concat(player.toString());
			  ListOfPlayers =  ListOfPlayers.concat(System.lineSeparator());
			  
			
		}
		 // System.out.println(ListOfPlayers);
		  return ListOfPlayers;
	}

	

}
