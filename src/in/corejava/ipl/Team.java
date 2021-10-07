package in.corejava.ipl;

import java.util.List;

public class Team implements ITeam{
	
	public Franchaise teamName =null;
	public int totalSix = 0;
	public double netRunRate = 0.171;
	public boolean isKnockOut = false;
	private Players players;
	private Members members;
	
	public Members getStaff() {
		return members;
	}

	public void setMembers(Members members) {
		this.members = members;
	}

	public Franchaise getTeamName() {
		return teamName;
	}
	
	//public String[] players;
	
	//public List<String> playersList;
	
	



	/*public List<String> getPlayersList() {
		return playersList;
	}



	public void setPlayersList(List<String> playersList) {
		this.playersList = playersList;
	}*/



	public Players getPlayers() {
		return players;
	}



	public void setPlayers(Players players) {
		this.players = players;
	}

	
	
	public Team(Franchaise teamName, int totalSix, double netRunRate, boolean isKnockOut, Players players, Members members) {
		super();
		this.teamName = teamName;
		this.totalSix = totalSix;
		this.netRunRate = netRunRate;
		this.isKnockOut = isKnockOut;
		this.players = players;
		this.members = members;
	}



	public Team() {
		// TODO Auto-generated constructor stub
	}

	public void setTeamName(Franchaise teamName) {
		this.teamName = teamName;
	}


	public void setTotalSix(int totalSix) {
		this.totalSix = totalSix;
	}

	public double getNetRunRate() {
		return netRunRate;
	}

	public void setNetRunRate(double netRunRate) {
		this.netRunRate = netRunRate;
	}

	public boolean isKnockOut() {
		return isKnockOut;
	}

	public void setKnockOut(boolean isKnockOut) {
		this.isKnockOut = isKnockOut;
	}



	public void printTeams() {
		
		/*System.out.println(teamName);
		
		System.out.println("PLAYERS:");
		
		System.out.println(players[0]);
		System.out.println(players[1]);
		System.out.println(players[2]);
		System.out.println(players[3]);
		
		System.out.println("RCS's Total number of Six is :" + totalSix);
		
		System.out.println("RCS's Net run rate is :" + netRunRate);
		
		System.out.println(" has RCB Knocked out :" + isKnockOut);*/

	}

	@Override
	public String getTotalMatchs() {
		// TODO Auto-generated method stub
		return "Total Matches";
	}

	@Override
	public String getTotalWins() {
		// TODO Auto-generated method stub
		return "Total wins";
	}

	@Override
	public String getTotalSix() {
		// TODO Auto-generated method stub
		//return "Total Six";
		
		if(totalSix>0) {
			return "" + totalSix;
		}else {
			throw new ZeroSixException("ZERO SIX EXCEPTION");
		}
	}

	@Override
	public String getNetRUnRate() {
		// TODO Auto-generated method stub
		return "Total run rate";
	}

}
