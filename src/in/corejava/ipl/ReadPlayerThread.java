package in.corejava.ipl;

import java.io.FileNotFoundException;

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