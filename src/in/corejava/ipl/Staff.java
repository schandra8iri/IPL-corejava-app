package in.corejava.ipl;

import java.util.ArrayList;
import java.util.List;

public class Staff {
	

	
public List<Staffer> staffList = new ArrayList<Staffer>();
	
	


	public List<Staffer> getStaffList() {
	return staffList;
}



public void setStaffList(List<Staffer> staffList) {
	this.staffList = staffList;
}



	public Staff(List<Staffer> staffList) {
	// TODO Auto-generated constructor stub#
		this.staffList = staffList;
}



	public Staff() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		
		String ListOfStaff = "" ;
		
		  for(Staffer staffer : staffList) {
			  //System.out.println("from Players");
			  
			  //System.out.println(player.toString());
			//  System.out.println(staffer.getFullName());

			  ListOfStaff =  ListOfStaff.concat(staffer.toString());
			  ListOfStaff =  ListOfStaff.concat(System.lineSeparator());
			
		}
		 // System.out.println(ListOfPlayers);
		  return ListOfStaff;
	}

	
	
	}


