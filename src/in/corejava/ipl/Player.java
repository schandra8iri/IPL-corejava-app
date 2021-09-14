package in.corejava.ipl;

public class Player {
	
	private String name;
	private int Age;
	private String place;
	public role primaryRole;
	private boolean isCaptain;
	private boolean isWicketKeeper;
	
	public enum role{
		BATSMAN, 
		BOWLER,
		ALLROUNDER,
	}
	
	
	public Player(String name, int age, String place, role primaryRole, boolean isCaptain, boolean isWicketKeeper) {
		super();
		this.name = name;
		Age = age;
		this.place = place;
		this.primaryRole = primaryRole;
		this.isCaptain = isCaptain;
		this.isWicketKeeper = isWicketKeeper;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
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
		
		
		String PlayerData =  " Name : " + getName()
				           + " Age : "  + getAge()
				           + " Place : " + getPlace()
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


