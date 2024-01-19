
public class FinalTest {
	public static void main(String[] args) {

		final float PI=3.14f; // 22/7
		
		System.out.println("PI "+PI);
		
		//PI=3.19f;
		
		System.out.println("PI "+PI);
		
		Chess chess = new Chess();
		chess.moveBishop();
		
		Chess gc = new GraphicalChess();
		gc.moveBishop();
	}
}

class Chess // developer : Gayathri
{
	final void moveBishop() {
		System.out.println("moving bishop diagonally...back/forward...");
	}
	void moveRook() {
		System.out.println("moving rook vetically/horizontally...back/forward...");
	}
	void isCheckMate() { }
}

class GraphicalChess extends Chess { // Developer : Shikha
	//Cannot override the final method from Chess
	void moveMyBishop() {
		System.out.println("moving bishop vertically...on a graphical screen.....back/forward...");
	}
	
	void moveRook() {
		System.out.println("moving rook L shape...back/forward...");
	}
}


