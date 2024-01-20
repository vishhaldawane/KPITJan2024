package jungle.tree;

public class Monkey {
	
	int defaultA=10;
	private int privateB=20;
	protected int protectedC=30;
	public int publicD=40;
	
	
	
	public void jumping() {
		
		System.out.println("defaultA   : "+defaultA);
		System.out.println("privateB   : "+privateB);
		System.out.println("protectedC : "+protectedC);
		System.out.println("publicD    : "+publicD);
		
	}
}
