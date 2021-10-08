package in.corejava.ipl.services;

import java.util.ArrayList;
import java.util.List;

import in.corejava.ipl.model.Team;

public class Teams {
	
	
public List<Team> teamsList = new ArrayList<Team>();
	
	


	public Teams(List<Team> teamsList) {
	// TODO Auto-generated constructor stub#
		this.teamsList = teamsList;
}



	public Teams() {
		// TODO Auto-generated constructor stub
	}



	public List<Team> getTeamList() {
		return teamsList;
	}



	public void setTeamList(List<Team> teamsList) {
		this.teamsList = teamsList;
	}



	@Override
	public String toString() {
		
		String ListOfTeams = "" ;
		
	
		
		  for(Team team : teamsList) {
			  //System.out.println("from Players");
			  
			  //System.out.println(player.toString());
			 // System.out.println(player.getFullName());
			  ListOfTeams =  ListOfTeams.concat(team.toString());
			  ListOfTeams =  ListOfTeams.concat(System.lineSeparator());
			  
			
		}
		 // System.out.println(ListOfPlayers);
		  return ListOfTeams;
	}

	

}
