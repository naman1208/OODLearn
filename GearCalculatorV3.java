package  learnOOD;
/*
javac GearCalculatorV3.java -d ClassFiles
java -cp ClassFiles learnOOD.GearCalculatorV3
*/
class Gear {
	private int chainring;
	private int cog;
	private int rim;
	private double tire;
	Gear(int chainring, int cog, int rim, double tire)
	{
		this.chainring = chainring;
		this.cog = cog;
		this.rim = rim;
		this.tire = tire;
	}
	public double getRatio() {
		double ratio = (double)chainring / cog;
		return ratio;
	}

	public double getDiameter() {
		double diameter = rim + (tire * 2);
		return diameter;
	}

	public double getGearInches() {
		double gearInches = getRatio() * getDiameter();
		return gearInches;
	}
}
public class GearCalculatorV3 {
	public static void main(String[] args) {
		Gear g1 = new Gear(52, 11, 26, 1.5);
		Gear g2 = new Gear(52, 11, 24, 1.25);
		System.out.println(g1.getGearInches() ); //137.0909090909091
		System.out.println(g2.getGearInches() ); //125.27272727272728
	}
}