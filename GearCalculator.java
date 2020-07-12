package  learnOOD;
/*
javac GearCalculator.java -d ClassFiles
java -cp ClassFiles learnOOD.GearCalculator
*/
class Gear {
	private int chainring;
	private int cog;
	Gear(int chaining, int cog)
	{
		this.chainring = chainring;
		this.cog = cog;
	}
	public double getRatio() {
		double ratio = (double)chainring / cog;
		return ratio;
	}

}
public class GearCalculator {
	public static void main(String[] args) {
		Gear g1 = new Gear(52, 11);
		Gear g2 = new Gear(30, 27);
		System.out.println(g1.getRatio() ); //4.7272727272727275
		System.out.println(g2.getRatio() ); //1.1111111111111112
	}
}