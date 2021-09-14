package in.corejava.ipl;

import java.util.List;

public class Teams {
	
	public String teamName = ">> IPL TEAM - ROYAL CHALLENGERS BANGALORE";
	public int totalSix = 266;
	public double netRunRate = 0.171;
	public boolean isKnockOut = false;
	private Players players;
	private Staff staff;
	
	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public String getTeamName() {
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

	
	
	public Teams(String teamName, int totalSix, double netRunRate, boolean isKnockOut, Players players, Staff staff) {
		super();
		this.teamName = teamName;
		this.totalSix = totalSix;
		this.netRunRate = netRunRate;
		this.isKnockOut = isKnockOut;
		this.players = players;
		this.staff = staff;
	}



	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTotalSix() {
		return totalSix;
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

}
