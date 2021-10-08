package in.corejava.ipl.job;

import java.io.FileNotFoundException;

import in.corejava.ipl.services.Members;
import in.corejava.ipl.services.impl.DataInitializeServiceImpl;

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
