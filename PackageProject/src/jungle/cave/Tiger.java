package jungle.cave;
//The declared package "jungle.cave" 
//does not match the expected package "jungle.farm"
public class Tiger {
	
	int defaultA=10;
	private int privateB=20;
	protected int protectedC=30;
	public int publicD=40;
	
	public Tiger() {
		System.out.println("Tiger ctor...");
	}
	
	public void printValues() {
		System.out.println("defaultA   : "+defaultA);
		System.out.println("privateB   : "+privateB);
		System.out.println("protectedC : "+protectedC);
		System.out.println("publicD    : "+publicD);
		
	}
}
