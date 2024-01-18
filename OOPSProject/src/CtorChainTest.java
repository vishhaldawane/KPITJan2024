
public class CtorChainTest {
	public static void main(String[] args) {
		//GrandFather gf = new GrandFather();
		//System.out.println("----------------");
		//Father f = new Father();
		//System.out.println("----------------");
		//Child c = new Child() ;
		
	}
}
class GrandFather {
	GrandFather(int i, int j, int k) {
		System.out.println("GrandFather()....");
	}
	GrandFather() { }
}
class Father extends GrandFather {
	Father() {
		super(10,20,30);
		System.out.println("Father()....");
	}
	
}
class Child extends Father {
	Child(int i) {
	
		System.out.println("Child()....");
		//Constructor call must be the first statement in a constructor

	}
	
}
