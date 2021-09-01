package in.corejava.ipl;

public class Teams {
	
	public String teamName = ">> IPL TEAM - ROYAL CHALLENGERS BANGALORE";
	public int totalSix = 266;
	public double netRunRate = 0.171;
	public boolean isKnockOut = false;
	
	public String getTeamName() {
		return teamName;
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

	public String[] getPlayers() {
		return players;
	}

	public void setPlayers(String[] players) {
		this.players = players;
	}

	public String [] players = {" >> CAPTAIN - Virat Koli", 
			">> WICKET KEEPER - AB de villers", 
			">> BATSMAN - DevDUtt Padikal",
			">> BOWLER - Yuzvendra Chahal"};
	
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
