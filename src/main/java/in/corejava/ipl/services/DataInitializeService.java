package in.corejava.ipl.services;

import in.corejava.ipl.IPLDataObject;

public interface DataInitializeService {

	Teams initTeams();
	Players initPlayers();
	Members initMembers();
	IPLDataObject initIPLData();
	
}
