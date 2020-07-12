package  learnOOD;
/*
javac GearCalculatorV5.java -d ClassFiles
java -cp ClassFiles learnOOD.GearCalculatorV5
*/
import java.lang.Math.*;
class Gear {
	private int chainring;
	private int cog;
	private Wheel wheel;
	Gear(int chainring, int cog, Wheel wheel)
	{
		this.chainring = chainring;
		this.cog = cog;
		this.wheel = wheel;
	}
	public double getRatio() {
		double ratio = (double)chainring / cog;
		return ratio;
	}

	public double getGearInches() {
		double gearInches = getRatio() * wheel.getDiameter();
		return gearInches;
	}
}

// import java.lang.Math.*;
class Wheel {

	private int rim;
	private double tire;
	Wheel(int rim, double tire)
	{
		this.rim = rim;
		this.tire = tire;
	}

	public double getDiameter() {
		double diameter = rim + (tire * 2);
		return diameter;
	}

	public double getCircumference() {
		double circumference = getDiameter() * Math.PI;
		return circumference;
	}
}

public class GearCalculatorV5 {
	public static void main(String[] args) {
		Wheel w1 = new Wheel(26,1.5);
		Gear g1 = new Gear(52, 11, w1);
		System.out.println(w1.getCircumference() ); // 91.106186954104
		System.out.println(g1.getRatio() ); // 4.7272727272727275
		System.out.println(g1.getGearInches() ); // 137.0909090909091
	}
}