
public class ArrayTest {
	public static void main(String[] args) {
		
		
		int num=10;
		
		System.out.println("num "+num);
		
		
		int score[]= {
				10,
				20,
				30,
				40,
				50
		}; //no width mentioned,
		
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("score : "+score[i]);
		}
		
		System.out.println("-------------");
		
		int team[] = new int[10]; // width is 10
		
		team[0]=120;
		team[2]=220;
		team[5]=320;
		team[7]=420;
		team[9]=520;
		
		for (int i = 0; i < team.length; i++) {
			System.out.println("team : "+team[i]);

		}
		
		Kite kitesArray[] = new Kite[5];
		
		kitesArray[0] = new Kite("Red","Jack",50);
		kitesArray[1] = new Kite("Green","Jane",60);
		kitesArray[2] = new Kite("Blue","Jim",70);
		kitesArray[3] = new Kite("Black","Jill",80);
		kitesArray[4] = new Kite("White","Julie",90);

		for (int i = 0; i < kitesArray.length; i++) {
			System.out.println("Kite is : "+kitesArray[i]);
		}
		
		//System.out.println("setting new kite...6th one...");
		//kitesArray[5] = new Kite("Purple","Julia",190);

		System.out.println("---------");
		
		Kite kites[] = {
				new Kite("Cyan","Ramesh",255),
				new Kite("LightGreen","Haresh",155),
				new Kite("LightRed","Jayesh",255),
				new Kite("LightPurple","Rajesh",355),
				new Kite("Magenta","Ritesh",455),
				new Kite("Blue","Paresh",555),
		};
		for (int i = 0; i < kites.length; i++) {
			System.out.println("Kite is : "+kites[i]);
		}
		

	}
}

class Kite implements Comparable<Kite> // struct Kite { }
{
	String color;
	String owner;
	int length;
	
	public Kite(String color, String owner, int length) {
		super();
		this.color = color;
		this.owner = owner;
		this.length = length;
	}
	@Override
	public String toString() {
		return "Kite [color=" + color + ", owner=" + owner + ", length=" + length + "]";
	}
	
	
	public int compareTo(Kite o) {
		System.out.println("Comparing "+length+ " with "+o.length);
		return Integer.compare(length, o.length);
	}
	
	
}





