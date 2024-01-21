import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {

		//Glass
		ArrayList<Kite> kiteList = new ArrayList<Kite>();
		System.out.println("Container is ready....");

		//Content
		kiteList.add(new Kite("Cyan", "Ramesh", 255));
		kiteList.add(new Kite("LightGreen", "Haresh", 155));
		kiteList.add(new Kite("LightRed", "Jayesh", 255));
		kiteList.add(new Kite("LightPurple", "Rajesh", 355));
		kiteList.add(new Kite("Magenta", "Ritesh", 455));
		kiteList.add(new Kite("Blue", "Paresh", 555));
		kiteList.add(new Kite("Blue", "Paresh", 555));
		kiteList.add(new Kite("Blue", "Paresh", 555));

		System.out.println("Content is added to the Container...");
		
		System.out.println("Iterating the container...");
		
		
		Iterator<Kite> kiteIterator = kiteList.iterator(); //STRAW
		
		while(kiteIterator.hasNext()) {
			Kite theKite = kiteIterator.next();
			System.out.println("Kite : "+theKite);
		}
		
		System.out.println("----adding 3 mote kites-----");
		kiteList.add(new Kite("LightBlue", "Sumesh", 355));
		kiteList.add(new Kite("LightBlue", "Sumesh", 355));

		kiteList.add(new Kite("LightGreen", "Janmesh", 555));
		kiteList.add(new Kite("LightMagenta", "Prathamesh", 755));
		kiteList.add(new Kite("LightBlue", "Sumesh", 355));

		kiteIterator = kiteList.iterator(); //STRAW
		
		while(kiteIterator.hasNext()) {
			Kite theKite = kiteIterator.next();
			System.out.println("Kite : "+theKite);
		}
		
	}
}
