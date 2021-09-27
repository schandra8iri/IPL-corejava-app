package in.corejava.ipl;

import java.io.FileNotFoundException;

public class ReadStaffThread implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		DataInitializeServiceImpl dis = new DataInitializeServiceImpl();
		Staff s = new Staff();
		try {
			s = dis.readStaffDataFromFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s.toString());
	}
}
