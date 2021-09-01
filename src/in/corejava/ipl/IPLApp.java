package in.corejava.ipl;

public class IPLApp {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		

		System.out.println("************* IPL 2021 *************");
		
		

		Teams teamRCB = new Teams("ROYAL CHALLENGERS BANGALORE", 266, 0.171, false);
		Teams teamCSK = new Teams("CHENNAI SUPER KINGS", 251, 0.181, false);

		//teams.printTeams();
		
		System.out.println(teamRCB.getTeamName());
		
		System.out.println("RCB PLAYERS:");
		
		String[] RCBPlayers = teamRCB.getRCBPlayers();
		
		System.out.println(RCBPlayers[0]);
		System.out.println(RCBPlayers[1]);
		System.out.println(RCBPlayers[2]);
		System.out.println(RCBPlayers[3]);
		
		System.out.println("RCS's Total number of Six is :" + teamRCB.getTotalSix());
		
		System.out.println("RCS's Net run rate is :" + teamRCB.getNetRunRate());
		
		System.out.println(" has RCB Knocked out :" + teamRCB.isKnockOut());
		
		System.out.println("change sixez and NRR");
		
		//******************************************
		
		System.out.println(teamCSK.getTeamName());
		
		System.out.println("CSK PLAYERS:");
		
		String[] CSKPlayers = teamCSK.getCSKPlayers();
		
		System.out.println(CSKPlayers[0]);
		System.out.println(CSKPlayers[1]);
		System.out.println(CSKPlayers[2]);
		System.out.println(CSKPlayers[3]);
		
		System.out.println("CSK's Total number of Six is :" + teamCSK.getTotalSix());
		
		System.out.println("CSK's Net run rate is :" + teamCSK.getNetRunRate());
		
		System.out.println(" has CSK Knocked out :" + teamCSK.isKnockOut());
		
		System.out.println("change sixez and NRR");
		
		



	
	}

}
