package in.corejava.ipl;

import java.util.ArrayList;

import java.util.List;

public class IPLDataObject {

	List<Teams> IPLTeams = new ArrayList<Teams>() ;

	public List<Teams> getIPLTeams() {
		return IPLTeams;
	}

	public void setIPLTeams(List<Teams> iPLTeams) {
		IPLTeams = iPLTeams;
	}
}
