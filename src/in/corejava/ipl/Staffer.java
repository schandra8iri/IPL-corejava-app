package in.corejava.ipl;

public class Staffer {
	
	private String name;
	private int Age;
	private String place;
	private role role;
	
	public enum role{
		COACH,
		PHYSIO
	}
	

	public Staffer(String name, int age, String place, role role) {
		super();
		this.name = name;
		Age = age;
		this.place = place;
		this.role = role;
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




	public role getRole() {
		return role;
	}




	public void setRole(role role) {
		this.role = role;
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		
		String StaffData =  " Name : " + getName()
				           + " Age : "  + getAge()
				           + " Place : " + getPlace()
				           + " Role: " + getRole();
		

		return StaffData;
		
	
					
					
	}

	
	
	
	}


