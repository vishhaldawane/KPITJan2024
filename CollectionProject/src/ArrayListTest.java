import java.util.*;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {

		//Glass
//		ArrayList<Kite> kiteList = new ArrayList<Kite>();
//		LinkedList<Kite> kiteList = new LinkedList<Kite>();
		TreeSet<Kite> kiteList = new TreeSet<Kite>();

//		HashSet<Kite> kiteList = new HashSet<Kite>();

		System.out.println("Container is ready....");

		//Content
		System.out.println("adding 1st Kite");
		kiteList.add(new Kite("Cyan", "Ramesh", 50));
		
		System.out.println("adding 2nd Kite");
		kiteList.add(new Kite("LightGreen", "Haresh", 30));
		
		System.out.println("adding 3rd Kite");
		kiteList.add(new Kite("LightRed", "Jayesh", 70));
		
		System.out.println("adding 4th Kite");	
		kiteList.add(new Kite("LightPurple", "Rajesh", 10));
		
		System.out.println("adding 5th Kite");		
		kiteList.add(new Kite("Magenta", "Ritesh", 40));
		
		System.out.println("adding 6th Kite");		
		kiteList.add(new Kite("Blue", "Paresh", 60));
		
		
		System.out.println("adding 7th Kite");		
		kiteList.add(new Kite("Blue", "Paresh", 80));
		
		System.out.println("adding 8th Kite");		
		kiteList.add(new Kite("Blue", "Paresh", 5));

		System.out.println("Content is added to the Container...");
		
		System.out.println("Iterating the container...");
		
		
		Iterator<Kite> kiteIterator = kiteList.iterator(); //STRAW
		
		while(kiteIterator.hasNext()) {
			Kite theKite = kiteIterator.next();
			System.out.println("Kite : "+theKite);
		}
		
		
		
	}
}
