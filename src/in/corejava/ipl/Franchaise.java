package in.corejava.ipl;

enum Franchaise {


	RCB("RCB", "**Royal Challengers Bangalore**", "Bangalore"),
	CSK("CSK", "**Chennai Super Kings**", "chennai");
	
	String shortName;
	String name;
	String city;
	
	private Franchaise(String shortName, String name, String city) {

		this.name = name;
		this.shortName = shortName;
		this.city=city;
	}
	
	
	
}
