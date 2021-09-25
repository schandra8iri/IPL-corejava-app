package in.corejava.ipl;

import java.util.ArrayList;
import java.util.List;

public class Players {
	
	
public List<Player> playersList = new ArrayList<Player>();
	
	


	public Players(List<Player> playersList) {
	// TODO Auto-generated constructor stub#
		this.playersList = playersList;
}



	public Players() {
		// TODO Auto-generated constructor stub
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
		
		
		/*for (int i = 0 ; i <= playersList.size() ; i++) {
			try {
			System.out.println(playersList.get(i));
			}catch(IndexOutOfBoundsException e) {
				System.out.println("EXCEPTION :" + e + System.lineSeparator());
			}
			catch(Exception e){
			
				System.out.println("EXCEPTION :" + e + System.lineSeparator());
			}
		}*/
		
		
		  for(Player player : playersList) {
			  //System.out.println("from Players");
			  
			  //System.out.println(player.toString());
			 // System.out.println(player.getFullName());
			  ListOfPlayers =  ListOfPlayers.concat(player.toString());
			  ListOfPlayers =  ListOfPlayers.concat(System.lineSeparator());
			  
			
		}
		 // System.out.println(ListOfPlayers);
		  return ListOfPlayers;
	}

	

}
