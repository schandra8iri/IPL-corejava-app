package in.corejava.ipl;

import java.io.FileNotFoundException;

public class ReadMemberThread implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		DataInitializeServiceImpl dis = new DataInitializeServiceImpl();
		Members members = new Members();
		members = dis.readMembersDataFromFile();
		System.out.println(members.toString());
	}
}
