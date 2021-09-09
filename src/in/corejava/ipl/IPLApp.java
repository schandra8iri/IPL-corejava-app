package in.corejava.ipl;

public class IPLApp {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		

		System.out.println("************* IPL 2021 *************");
		
		CSKPlayers csk = new CSKPlayers();
		RCBPlayer rcb = new RCBPlayer();

		//Teams teamRCB = new Teams("ROYAL CHALLENGERS BANGALORE", 266, 0.171, false, rcb.getRCBPlayers());
		//Teams teamCSK = new Teams("CHENNAI SUPER KINGS", 251, 0.181, false, csk.getCSKPlayers());
		
		Teams teamRCB = new Teams("ROYAL CHALLENGERS BANGALORE", 266, 0.171, false, rcb.getPlayersList());
		Teams teamCSK = new Teams("CHENNAI SUPER KINGS", 251, 0.181, false, csk.getPlayerList());

		//teams.printTeams();
		
		display(teamRCB.getTeamName());
		
		display("RCB PLAYERS:");
		
		//String[] RCBPlayers = teamRCB.getPlayers();
		
		/*display(RCBPlayers[0]);
		display(RCBPlayers[1]);
		display(RCBPlayers[2]);
		display(RCBPlayers[3]);*/
		
		display(teamRCB.getPlayersList().toString());
		
		display("RCS's Total number of Six is :" + teamRCB.getTotalSix());
		
		display("RCS's Net run rate is :" + teamRCB.getNetRunRate());
		
		display(" has RCB Knocked out :" + teamRCB.isKnockOut());
		
		display("change sixez and NRR");
		
		//******************************************
		
		display(teamCSK.getTeamName());
		
		display("CSK PLAYERS:");
		
/*		String[] CSKPlayers = teamCSK.getPlayers();
		
		display(CSKPlayers[0]);
		display(CSKPlayers[1]);
		display(CSKPlayers[2]);
		display(CSKPlayers[3]);*/
		
		display(teamCSK.getPlayersList().toString());
		
		display("CSK's Total number of Six is :" + teamCSK.getTotalSix());
		
		display("CSK's Net run rate is :" + teamCSK.getNetRunRate());
		
		display(" has CSK Knocked out :" + teamCSK.isKnockOut());
		
		display("change sixez and NRR");
		
		



	
	}
	
	public static void display(String message) {
		
		System.out.println(message);
		
	}

}
