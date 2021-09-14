package in.corejava.ipl;

public class Player extends Person {
	
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
		
		if(isCaptain()) {
			PlayerData = PlayerData.concat(" and CAPTAIN");
		}
		
		if(isWicketKeeper()) {
			PlayerData = PlayerData.concat(" and WicketKeeper");
		}
				           
		return PlayerData;
		
	
					
					
	}

	
	
	
	}


