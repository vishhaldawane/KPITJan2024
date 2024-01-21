
public class GenericTest {
	public static void main(String[] args) {

		int i=10;
		int j=20;
		System.out.println("i "+i);
		System.out.println("j "+j);
		
		swap(i,j);
		
		System.out.println("i "+i);
		System.out.println("j "+j);
		
	}
	public static void swap(int i, int j) { //function called by value
		System.out.println("swapping...");
		int temp = i;
		i = j;
		j = temp;
		System.out.println("swapped....");
	}
}


