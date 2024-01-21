
public class DrunkenTest {
	public static void main(String[] args) {
		
		DrunkenMaster master = new DrunkenMaster();
		master.drinkAndFight();
		
		DrunkenDisciple disciple = new DrunkenDisciple();
		disciple.drinkAndFight();
	}
}

class BankException extends Exception { }

class MaturityException extends BankException {
	
}
class DateException extends BankException { }

abstract class SavingsAccount
{
	abstract void withdraw()  throws BankException;
	//{
	//	System.out.println("Master : witdhrawing.");
	//}
}
class FixedDeposit extends SavingsAccount
{
//Exception KnockDownException is not compatible with throws clause 
	//in DrunkenMaster.drinkAndFight()
	void deposit() throws MaturityException, DateException
	{
		System.out.println("Disciple : Drinking and Fighting..");

	}
}