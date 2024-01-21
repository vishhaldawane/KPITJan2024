
public class GossipTest {
	public static void main(String[] args) {
		
		Human human1 = new Human("Rajesh");
		human1.selfTalk();
		
		Human human2 = new Human("Seema");
		
		human1.talkWith(human2);
		
		Human human3 = new Human("Reeta");
		
		human1.discuss(human2,human3);


	}
}

class Human implements Comparable<Human>
{
	String name;
	
	Human(String s) {
		name = s;
	}
	
	void selfTalk() {
		System.out.println(name+" is having selftalk....");
	}
	
	void talkWith(Human x) {
		System.out.println(name+" is talking with "+x.name);
	}
	
	void discuss(Human x, Human y) {
		System.out.println(name+" is discussing with "+x.name+ " and "+y.name);
	}

	@Override
	public int compareTo(Human o) { //kite1.compareTo(kite2)
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
