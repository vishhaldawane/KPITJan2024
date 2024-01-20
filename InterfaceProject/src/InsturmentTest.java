
public class InsturmentTest {
	public static void main(String[] args) {
		/*StringBasedMusicalInstrument i = new Guitar();
		i.use();
		i.play();
		i.tuneStrings();
		i.pluck();*/
		
		Guitar g = new Guitar();
		Violin v = new Violin();
		
		SurgicalCutter cutter = new SurgicalCutter();
		
		MusicalEvent.performance5(cutter);
	}
}

class MusicalEvent
{
	static void performance1(Guitar g) {
		g.use();
		g.tuneStrings();
		g.play();
		g.pluck();
		//g.bow();
	}
	static void performance2(Violin v) {
		v.use();
		v.tuneStrings();
		v.play();
		v.bow();
		//v.pluck();
	
	}
	static void performance3(StringBasedMusicalInstrument s) {
		s.use();
		s.tuneStrings();
		s.play();		
		//s.pluck();
		//s.bow();
	
	}
	
	static void performance4(MusicalInstrument s) {
		s.use();
		s.play();
		//s.tuneStrings();
		//s.pluck();
		//s.bow();
	
	}
	
	static void performance5(Instrument s) {
		s.use();
		//s.play();
		//s.tuneStrings();
		//s.pluck();
		//s.bow();
	
	}
	
}







//if(s instanceof Violin) {//dynamic method dispatch
//	Violin v = (Violin) s;
//	v.bow();
//}


interface Instrument
{
	void use();
}

abstract class MusicalInstrument implements Instrument {
	abstract void play();
}

abstract class MedicalInstrument implements Instrument {
	abstract void diagnose();
}


abstract class StringBasedMusicalInstrument extends MusicalInstrument
{

	abstract void tuneStrings();
	
}
abstract class SurgicalMedicalInstrument extends MedicalInstrument
{

	abstract void sterilize();
	
}

class Guitar extends StringBasedMusicalInstrument {

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using the Guitar");
	}

	@Override
	void tuneStrings() {
		// TODO Auto-generated method stub
		System.out.println("tuning the Guitar");

	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing the Guitar");

	}
	
	void pluck() {
		System.out.println("Plucking the Guitar....");
	}
	
}

class Violin extends StringBasedMusicalInstrument {

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using the Violin");
	}

	@Override
	void tuneStrings() {
		// TODO Auto-generated method stub
		System.out.println("tuning the Violin");

	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing the Violin");

	}
	
	void bow() {
		System.out.println("Bowing the Violin....");
	}
	
}


class SurgicalCutter extends SurgicalMedicalInstrument {

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using the Surgical Cutter");
	}

	@Override
	void diagnose() {
		// TODO Auto-generated method stub
		System.out.println("diagnosing the Surgical Cutter");

	}

	@Override
	void sterilize() {
		// TODO Auto-generated method stub
		System.out.println("Sterilizing the Surgical Cutter");

	}
	
	void cut() {
		System.out.println("Cutting via the Surgical Cutter....");
	}
	
}

class SurgicalNeedle extends SurgicalMedicalInstrument {

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using the SurgicalNeedle");
	}

	@Override
	void diagnose() {
		// TODO Auto-generated method stub
		System.out.println("diagnosing the SurgicalNeedle");

	}

	@Override
	void sterilize() {
		// TODO Auto-generated method stub
		System.out.println("Sterilizing the SurgicalNeedle");

	}
	
	void stitch() {
		System.out.println("Stitching via the SurgicalNeedle....");
	}
	
}


