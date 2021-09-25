package in.corejava.ipl;

public class Staffer extends Person{
	
	private role role;
	private Franchaise frachaise;
	
	public Franchaise getFrachaise() {
		return frachaise;
	}



	public void setFrachaise(Franchaise frachaise) {
		this.frachaise = frachaise;
	}




	public enum role{
		COACH,
		PHYSIO
	}
	

	public Staffer(String fname, String sname, int age, String place, Gender gender, role role, Franchaise frachaise) {
		super(fname, sname, age, place, gender);
		this.role = role;
		this.frachaise = frachaise;
	}



	public Staffer() {
		// TODO Auto-generated constructor stub
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


