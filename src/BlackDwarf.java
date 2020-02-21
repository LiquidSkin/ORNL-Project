import java.util.Scanner;

/* This Blackhole class is just to demonstrate the implementation of extending the abstract parent class
   and implementing all its abstract methods
*/
public class BlackDwarf extends DwarfStar {

	@Override
	public int calculatePressure() {
		return (int) (getRadius() * getRadius());
	}

	@Override
	public void getDetails() {
		System.out.println("The Pressure of the WhiteDwarf Star is " + calculatePressure());
		System.out.println("The Constellation name of the WhiteDwarf Star is" + getConstellation());
		System.out.println("The radius of the WhiteDwarfStar is" + getRadius());
		System.out.println("The temperature of the star is " + getTemperature());
		System.out.println("The Fusion Rate of the WhiteDwarf Star is" + getFusionRate());

	}

	public static void main(String[] args) {
		DwarfStar bd = new BlackDwarf();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the constellation name");
		String constellation = sc.nextLine();
		bd.setConstellation(constellation);
		System.out.println("Enter the radius");
		int r = sc.nextInt();
		bd.setRadius(r);
		System.out.println("Enter the fusionrate");
		double fusionRate = sc.nextDouble();
		bd.setFusionRate(fusionRate);
		System.out.println("Enter the temperature");
		long temperature = sc.nextLong();
		bd.setTemperature(temperature);
		bd.getDetails();
		bd.calculatePressure();

	}

}
