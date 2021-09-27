package in.corejava.ipl;

import java.io.FileNotFoundException;

public class ReadPlayerThread implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		DataInitializeServiceImpl dis = new DataInitializeServiceImpl();
		Players p = new Players();
		try {
			p = dis.readPlayerDataFromFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p.toString());
	}
}
