package in.corejava.ipl;

public class Staffer extends Person{
	
	private role role;
	
	public enum role{
		COACH,
		PHYSIO
	}
	

	public Staffer(String fname, String sname, int age, String place, Gender gender, role role) {
		super(fname, sname, age, place, gender);
		this.role = role;
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
		
		
		return super.toString()  + " Role: " + getRole();
				
	
					
					
	}

	
	
	
	}


