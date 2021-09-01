package in.corejava.ipl;

public class IPLApp {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("************* IPL 2021 *************");

		Teams teams = new Teams();
		//teams.printTeams();
		
		System.out.println(teams.getTeamName());
		
		System.out.println("PLAYERS:");
		
		String[] teamPlayers = teams.getPlayers();
		
		System.out.println(teamPlayers[0]);
		System.out.println(teamPlayers[1]);
		System.out.println(teamPlayers[2]);
		System.out.println(teamPlayers[3]);
		
		System.out.println("RCS's Total number of Six is :" + teams.getTotalSix());
		
		System.out.println("RCS's Net run rate is :" + teams.getNetRunRate());
		
		System.out.println(" has RCB Knocked out :" + teams.isKnockOut());
		
		System.out.println("change sixez and NRR");
		
		teams.setNetRunRate(0.871);
		teams.setTotalSix(299);
		
		System.out.println("RCS's Total number of Six is :" + teams.getTotalSix());
		
		System.out.println("RCS's Net run rate is :" + teams.getNetRunRate());


	
	}

}
