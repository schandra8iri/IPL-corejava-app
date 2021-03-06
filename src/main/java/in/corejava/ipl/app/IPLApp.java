package in.corejava.ipl.app;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import in.corejava.ipl.dao.imp.PlayerDAOImpl;
import in.corejava.ipl.dbaccess.JDBCAccessImp;
import in.corejava.ipl.job.ReadMemberThread;
import in.corejava.ipl.job.ReadPlayerThread;
import in.corejava.ipl.model.Player;
import in.corejava.ipl.model.Person;
import in.corejava.ipl.utils.Franchaise;
import in.corejava.ipl.services.Members;
import in.corejava.ipl.services.Players;
import in.corejava.ipl.services.impl.DataInitializeServiceImpl;

public class IPLApp {
	
	


	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub	
		
		
		
		JDBCAccessImp jdbc = new JDBCAccessImp();
		Connection c = jdbc.getConnection();
		UUID uuid = new UUID(1, 2);
		System.out.println(uuid.randomUUID());
		System.out.println(uuid.randomUUID().getLeastSignificantBits());
		
		PlayerDAOImpl playerdao = new PlayerDAOImpl();
		Player pl = new Player("Ambatti", "Rayudu", 30,Person.Gender.MALE, "Guntur",Player.role.BATSMAN,false,false,Franchaise.CSK);
				playerdao.addPlayer(pl);
		

		System.out.println("************* IPL 2021 *************");
		
		//CSKPlayers csk = new CSKPlayers();
		//RCBPlayer rcb = new RCBPlayer();
		
	/*    List<Player> cskPlayerList = new ArrayList<Player>();
	 
	    
	    cskPlayerList.add(new Player("Mahendra Singh", "Dhoni", 35, Person.Gender.MALE, "Ranchi", Player.role.BATSMAN, true,true));
	    cskPlayerList.add(new Player("Ambatti", "Rayudu", 30,Person.Gender.MALE, "Guntur",Player.role.BATSMAN,false,false));
	    cskPlayerList.add(new Player("Ravindra", "Jadeja", 30,Person.Gender.MALE, "Navagam",Player.role.ALLROUNDER,false,false));
	    cskPlayerList.add(new Player("Ravichandran"," Ashwin", 32,Person.Gender.MALE, "Chenni",Player.role.BOWLER,false,false));		
		
	    List<Staffer> cskStaffList = new ArrayList<Staffer>();
	    
	    cskStaffList.add(new Staffer("Stephen", "Fleming", 40, "NZ", Person.Gender.MALE,Staffer.role.COACH));
	    cskStaffList.add(new Staffer("Tommy", "Simsek", 45, "NZ", Person.Gender.MALE,Staffer.role.PHYSIO));

	    List<Player> rcbPlayerList = new ArrayList<Player>();
		
		
		rcbPlayerList.add(new Player("Virat", "Koli", 30,Person.Gender.MALE,"Delhi",Player.role.BATSMAN,true,false));
		rcbPlayerList.add(new Player("Ab", "de villers", 30,Person.Gender.MALE,"Bela-Bela",Player.role.BATSMAN,false,true));
		rcbPlayerList.add(new Player("DevDUtt", " Padikal", 25,Person.Gender.MALE,"Bangalore",Player.role.BATSMAN,false,false));
		rcbPlayerList.add(new Player("Yuzvendra", "Chahal", 32,Person.Gender.MALE,"Jind",Player.role.BOWLER,false,false));	
		
	    List<Staffer> rcbStaffList = new ArrayList<Staffer>();
	    rcbStaffList.add(new Staffer("Mike", "Hesson", 50, "NZ", Person.Gender.MALE, Staffer.role.COACH));
	    rcbStaffList.add(new Staffer("Navnita", "Gautam", 30, "Punjab", Person.Gender.FEMALE, Staffer.role.PHYSIO));

	    

		
		Players cskPlayers = new Players(cskPlayerList);
		Players rcbPlayers = new Players(rcbPlayerList);
		Staff cskStaff = new Staff(cskStaffList);
		Staff rcbStaff = new Staff(rcbStaffList);

		//Teams teamRCB = new Teams("ROYAL CHALLENGERS BANGALORE", 266, 0.171, false, rcb.getRCBPlayers());
		//Teams teamCSK = new Teams("CHENNAI SUPER KINGS", 251, 0.181, false, csk.getCSKPlayers());
		
		Teams teamRCB = new Teams(Franchaise.RCB.name, 0, 0.171, false, rcbPlayers, cskStaff);
		Teams teamCSK = new Teams(Franchaise.CSK.name, 251, 0.181, false, cskPlayers,rcbStaff);

		//teams.printTeams();
*/		
		
		
		DataInitializeServiceImpl dis = new DataInitializeServiceImpl();
		Players players = new Players();
		players = dis.readPlayerDataFromFile();
		System.out.println(players.toString());
		Members members = new Members();
		//members =dis.readMembersDataFromFile();
		System.out.println(members.toString());
		
		
		
		
		Thread t = Thread.currentThread();
		System.out.println("Thread : " + t.getId() + " "+t.getName());
		ReadPlayerThread playeThread = new ReadPlayerThread();
		Thread t1 = new Thread(playeThread, "Player Thread");
		System.out.println();
		System.out.println("Thread : " + t1.getId() + " "+t1.getName());

		//t1.start();
		
		ReadMemberThread staffThread = new ReadMemberThread();
		Thread t2 = new Thread(staffThread, "Staff Thread");
		System.out.println("Thread : " + t2.getId() + " " + t2.getName());

		//t2.start();
		
		
		
		
		/*display(teamRCB.getTeamName());
		
		display("RCB PLAYERS:");
		display(teamRCB.getPlayers().toString());
		
		display("RCB STAFF:");
		display(teamRCB.getStaff().toString());

		
		//String[] RCBPlayers = teamRCB.getPlayers();
		
		display(RCBPlayers[0]);
		display(RCBPlayers[1]);
		display(RCBPlayers[2]);
		display(RCBPlayers[3]);
		
		
		try {
			display("RCS's Total number of Six is :" + teamRCB.getTotalSix());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		display("RCS's Net run rate is :" + teamRCB.getNetRunRate());
		
		display(" has RCB Knocked out :" + teamRCB.isKnockOut());
		
		display("change sixez and NRR");
		
		//******************************************
		
		display(teamCSK.getTeamName());
		
		display("CSK PLAYERS:");
		
		String[] CSKPlayers = teamCSK.getPlayers();
		
		display(CSKPlayers[0]);
		display(CSKPlayers[1]);
		display(CSKPlayers[2]);
		display(CSKPlayers[3]);
		
		display(teamCSK.getPlayers().toString());
		
		display("CSK STAFF:");
		
		display(teamCSK.getStaff().toString());
		
		display("CSK's Total number of Six is :" + teamCSK.getTotalSix());
		
		display("CSK's Net run rate is :" + teamCSK.getNetRunRate());
		
		display(" has CSK Knocked out :" + teamCSK.isKnockOut());
		
		display("change sixez and NRR");
		*/
		



	
	}
	
	public static void display(String message) {
		
		System.out.println(message);
		
	}

}
