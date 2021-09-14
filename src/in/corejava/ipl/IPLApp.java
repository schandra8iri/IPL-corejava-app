package in.corejava.ipl;

import java.util.ArrayList;
import java.util.List;

public class IPLApp {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		

		System.out.println("************* IPL 2021 *************");
		
		//CSKPlayers csk = new CSKPlayers();
		//RCBPlayer rcb = new RCBPlayer();
		
	    List<Player> cskPlayerList = new ArrayList<Player>();
	    cskPlayerList.add(new Player("MS Dhoni", 35,"Ranchi","Batsman",true,true));
	    cskPlayerList.add(new Player("Ambatti Rayudu", 30,"Guntur","Batsman",false,false));
	    cskPlayerList.add(new Player("Ravindra Jadeja", 30,"Navagam","AllRounder",false,false));
	    cskPlayerList.add(new Player("Ravichandran Ashwin", 32,"Chenni","Bowler",false,false));		
		
		List<Player> rcbPlayerList = new ArrayList<Player>();
		
		
		rcbPlayerList.add(new Player("Virat Koli", 30,"Delhi","Batsman",true,false));
		rcbPlayerList.add(new Player("Ab de villers", 30,"Bela-Bela","Batsman",false,true));
		rcbPlayerList.add(new Player("DevDUtt Padikal", 25,"Bangalore","AllRounder",false,false));
		rcbPlayerList.add(new Player("Yuzvendra Chahal", 32,"Jind","Bowler",false,false));		
		
		Players cskPlayers = new Players(cskPlayerList);
		Players rcbPlayers = new Players(rcbPlayerList);

		//Teams teamRCB = new Teams("ROYAL CHALLENGERS BANGALORE", 266, 0.171, false, rcb.getRCBPlayers());
		//Teams teamCSK = new Teams("CHENNAI SUPER KINGS", 251, 0.181, false, csk.getCSKPlayers());
		
		Teams teamRCB = new Teams("ROYAL CHALLENGERS BANGALORE", 266, 0.171, false, rcbPlayers);
		Teams teamCSK = new Teams("CHENNAI SUPER KINGS", 251, 0.181, false, cskPlayers);

		//teams.printTeams();
		
		display(teamRCB.getTeamName());
		
		display("RCB PLAYERS:");
		display(teamRCB.getPlayers().toString());

		
		//String[] RCBPlayers = teamRCB.getPlayers();
		
		/*display(RCBPlayers[0]);
		display(RCBPlayers[1]);
		display(RCBPlayers[2]);
		display(RCBPlayers[3]);*/
		
		
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
		
		display(teamCSK.getPlayers().toString());
		
		
		display("CSK's Total number of Six is :" + teamCSK.getTotalSix());
		
		display("CSK's Net run rate is :" + teamCSK.getNetRunRate());
		
		display(" has CSK Knocked out :" + teamCSK.isKnockOut());
		
		display("change sixez and NRR");
		
		



	
	}
	
	public static void display(String message) {
		
		System.out.println(message);
		
	}

}
