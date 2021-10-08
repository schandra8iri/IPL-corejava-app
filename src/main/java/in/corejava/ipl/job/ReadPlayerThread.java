package in.corejava.ipl.job;

import java.io.FileNotFoundException;

import in.corejava.ipl.services.Players;
import in.corejava.ipl.services.impl.DataInitializeServiceImpl;

public class ReadPlayerThread implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		DataInitializeServiceImpl dis = new DataInitializeServiceImpl();
		Players p = new Players();
		p = dis.readPlayerDataFromFile();
		System.out.println(p.toString());
	}
}
