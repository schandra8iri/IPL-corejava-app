package in.corejava.ipl;

public class Player extends Person implements IPlayer{
	
	public role primaryRole;
	private boolean isCaptain;
	private boolean isWicketKeeper;
	
	public enum role{
		BATSMAN, 
		BOWLER,
		ALLROUNDER,
	}
	
	
	public Player(String fname, String sname, int age, Gender gender, String place, role primaryRole, boolean isCaptain, boolean isWicketKeeper) {
		super(fname, sname, age, place, gender);
		this.primaryRole = primaryRole;
		this.isCaptain = isCaptain;
		this.isWicketKeeper = isWicketKeeper;
	}

	public role getPrimaryRole() {
		return primaryRole;
	}
	public void setPrimaryRole(role primaryRole) {
		this.primaryRole = primaryRole;
	}
	public boolean isCaptain() {
		return isCaptain;
	}
	public void setCaptain(boolean isCaptain) {
		this.isCaptain = isCaptain;
	}
	public boolean isWicketKeeper() {
		return isWicketKeeper;
	}
	public void setWicketKeeper(boolean isWicketKeeper) {
		this.isWicketKeeper = isWicketKeeper;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		
		String PlayerData =  super.toString()
				           + " PrimryRole: " + getPrimaryRole();
		
switch(primaryRole) {

case BATSMAN: PlayerData = PlayerData.concat(getTotalRuns());
case BOWLER: PlayerData = PlayerData.concat(getBestBowling());
case ALLROUNDER: PlayerData = PlayerData.concat(getTotalCatcher());
}
		if(isCaptain()) {
			PlayerData = PlayerData.concat(" and CAPTAIN");
		}
		
		if(isWicketKeeper()) {
			PlayerData = PlayerData.concat(" and WicketKeeper");
		}
				           
		return PlayerData;
		
	
					
					
	}

	@Override
	public String getHighestRUns() {
		// TODO Auto-generated method stub
		return "Heights Runs";
	}

	@Override
	public String getBestBowling() {
		// TODO Auto-generated method stub
		return "Best Bowling";
	}

	@Override
	public String getTotalRuns() {
		// TODO Auto-generated method stub
		return "Total RUns";
	}

	@Override
	public String getTotalWickets() {
		// TODO Auto-generated method stub
		return "Total wickets";
	}

	@Override
	public String getTotalCatcher() {
		// TODO Auto-generated method stub
		return "Total catches";
	}

	
	
	
	}


