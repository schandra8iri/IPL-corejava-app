package in.corejava.ipl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sun.net.ftp.FtpDirEntry.Permission;

public class DataInitializeServiceImpl implements DataInitializeService {

	List<Player> playerList = new ArrayList<Player>();
	List<Staffer> staffList = new ArrayList<Staffer>();
	Players Players = new Players();
	Staff staff = new Staff();
	Teams teamRCB;
	Teams teamCSK;
	IPLDataObject IPLDO;
	
	final String PLAYERFILE = "resource/Players.txt";
	final String STAFFFILE = "resource/Staff.txt";
	final String COMMADELIMITER = ",";

	@Override
	public Teams initTeams() {
		// TODO Auto-generated method stub

		//teamRCB = new Teams(Franchaise.RCB.name, 0, 0.171, false, rcbPlayers, cskStaff);
		//teamCSK = new Teams(Franchaise.CSK.name, 251, 0.181, false, cskPlayers, rcbStaff);

		return teamRCB;
	}

	@Override
	public Players initPlayers() {
		// TODO Auto-generated method stub

		

		/*PlayerList.add(new Player("Mahendra Singh", "Dhoni", 35, Person.Gender.MALE, "Ranchi", Player.role.BATSMAN,
				true, true,Franchaise.CSK));
		PlayerList.add(
				new Player("Ambatti", "Rayudu", 30, Person.Gender.MALE, "Guntur", Player.role.BATSMAN, false, false,Franchaise.CSK));
		PlayerList.add(new Player("Ravindra", "Jadeja", 30, Person.Gender.MALE, "Navagam", Player.role.ALLROUNDER,
				false, false,Franchaise.CSK));
		PlayerList.add(new Player("Ravichandran", " Ashwin", 32, Person.Gender.MALE, "Chenni", Player.role.BOWLER,
				false, false,Franchaise.CSK));

		PlayerList
				.add(new Player("Virat", "Koli", 30, Person.Gender.MALE, "Delhi", Player.role.BATSMAN, true, false,Franchaise.RCB));
		PlayerList.add(
				new Player("Ab", "de villers", 30, Person.Gender.MALE, "Bela-Bela", Player.role.BATSMAN, false, true,Franchaise.RCB));
		PlayerList.add(new Player("DevDUtt", " Padikal", 25, Person.Gender.MALE, "Bangalore", Player.role.BATSMAN,
				false, false,Franchaise.RCB));
		PlayerList.add(
				new Player("Yuzvendra", "Chahal", 32, Person.Gender.MALE, "Jind", Player.role.BOWLER, false, false,Franchaise.RCB));

		Players = new Players(PlayerList);*/
		

		return Players;
	}

	@Override
	public Staff initStaff() {
		// TODO Auto-generated method stub

		List<Staffer> cskStaffList = new ArrayList<Staffer>();

		cskStaffList.add(new Staffer("Stephen", "Fleming", 40, "NZ", Person.Gender.MALE, Staffer.role.COACH,Franchaise.CSK));
		cskStaffList.add(new Staffer("Tommy", "Simsek", 45, "NZ", Person.Gender.MALE, Staffer.role.PHYSIO, Franchaise.CSK));

		List<Staffer> rcbStaffList = new ArrayList<Staffer>();
		rcbStaffList.add(new Staffer("Mike", "Hesson", 50, "NZ", Person.Gender.MALE, Staffer.role.COACH,Franchaise.RCB));
		rcbStaffList.add(new Staffer("Navnita", "Gautam", 30, "Punjab", Person.Gender.FEMALE, Staffer.role.PHYSIO,Franchaise.RCB));

		//cskStaff = new Staff(cskStaffList);
		//rcbStaff = new Staff(rcbStaffList);

		return null;
	}

	@Override
	public IPLDataObject initIPLData() {
		// TODO Auto-generated method stub//

		initPlayers();
		initStaff();
		initTeams();
		IPLDO = new IPLDataObject();
		IPLDO.getIPLTeams().add(initTeams());
		return IPLDO;
	}
	
	public Players readPlayerDataFromFile() throws FileNotFoundException {
		File file = new File(PLAYERFILE);
		Scanner scan = new Scanner(file);
		
	while(scan.hasNextLine()) {
		//System.out.println(scan.nextLine());
		
		playerList.add(addPlayerToList(scan.nextLine()));
		
	}
	
	Players.setPlayerList(playerList);
	
	return Players;
	}

	private Player addPlayerToList(String playerRecord) {
		// TODO Auto-generated method stub
		
		Player player = new Player();
		String playerRecordArray[] = playerRecord.split(COMMADELIMITER);
		
		player.setFirstName(playerRecordArray[0]);
		player.setSecondName(playerRecordArray[1]);
		player.setAge(Integer.parseInt(playerRecordArray[2].trim()));
		
		if(Person.Gender.MALE.toString().equalsIgnoreCase(playerRecordArray[3])) {
			player.setGender(Person.Gender.MALE);
		}else {
			player.setGender(Person.Gender.FEMALE);
		}
		
		player.setPlace(playerRecordArray[4]);
		
		switch (playerRecordArray[5].trim()) {
		case "BATSMAN":
			player.setPrimaryRole(Player.role.BATSMAN);
			break;
		case "ALLROUNDER":
			player.setPrimaryRole(Player.role.ALLROUNDER);
		case "BOWLER":
			player.setPrimaryRole(Player.role.BOWLER);
		default:
			break;
		}
		
		player.setCaptain(Boolean.parseBoolean(playerRecordArray[6].trim()));
		player.setWicketKeeper(Boolean.parseBoolean(playerRecordArray[7].trim()));

		
		player.setFrachaise(Franchaise.getFranchaiseByShortName(playerRecordArray[8]));
		
		return player;
		
	}
	public Staff readStaffDataFromFile() throws FileNotFoundException {
		File file = new File(STAFFFILE);
		Scanner scan = new Scanner(file);
		
	while(scan.hasNextLine()) {
		//System.out.println(scan.nextLine());
		
		staffList.add(addStafferToList(scan.nextLine()));
		
	}
	
	staff.setStaffList(staffList);
	
	return staff;
	}
	
	private Staffer addStafferToList(String staffRecord) {
		// TODO Auto-generated method stub
		
		Staffer staffer = new Staffer();
		String stafferRecordArray[] = staffRecord.split(COMMADELIMITER);
		
		staffer.setFirstName(stafferRecordArray[0]);
		staffer.setSecondName(stafferRecordArray[1]);
		staffer.setAge(Integer.parseInt(stafferRecordArray[2].trim()));
		
		if(Person.Gender.MALE.toString().equalsIgnoreCase(stafferRecordArray[3])) {
			staffer.setGender(Person.Gender.MALE);
		}else {
			staffer.setGender(Person.Gender.FEMALE);
		}
		
		
		switch (stafferRecordArray[4].trim()) {
		case "COACH":
			staffer.setRole(Staffer.role.COACH);
			break;
		case "PHYSIO":
			staffer.setRole(Staffer.role.PHYSIO);
		default:
			break;
		}		
		staffer.setFrachaise(Franchaise.getFranchaiseByShortName(stafferRecordArray[5]));
		
		return staffer;
		
	}
}
