import java.util.Scanner;

/*This WhiteDwarf Class extends the Abstract Class and implements all the methods in the inherited abstract
 * class and provides the implementation of these methods. It also has two additional properties.
 */
public class WhiteDwarf extends DwarfStar {
	private double opacity;
	private long thermalConductivity;

	// getter and setter methods for these properties.
	public double getOpacity() {
		return opacity;
	}

	public void setOpacity(double opacity) {
		this.opacity = opacity;
	}

	public long getThermalConductivity() {
		return thermalConductivity;
	}

	public void setThermalConductivity(long thermalConductivity) {
		this.thermalConductivity = thermalConductivity;
	}

	// these two methods are the overriden methods which actually provide the
	// implementation of the methods in the abstract class
	@Override
	public int calculatePressure() {
		// TODO Auto-generated method stub
		return (getRadius() * getRadius());
	}

	@Override
	public void getDetails() {
		System.out.println("The Pressure of the WhiteDwarf Star is " + calculatePressure());
		System.out.println("The Constellation name of the WhiteDwarf Star is" + getConstellation());
		System.out.println("The radius of the WhiteDwarfStar is" + getRadius());
		System.out.println("The temperature of the star is " + getTemperature());
		System.out.println("The Fusion Rate of the WhiteDwarf Star is" + getFusionRate());

	}

	// driver function to test our class
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WhiteDwarf w = new WhiteDwarf();
		System.out.println("Enter constellation name");
		String c = sc.nextLine();
		w.setConstellation(c);
		System.out.println("Enter the fusion rate");
		double f = sc.nextDouble();
		w.setFusionRate(f);
		System.out.println("Enter the lumosity");
		int l = sc.nextInt();
		w.setLuminosity(l);
		System.out.println("enter the name of the blackhole");
		String n = sc.nextLine();
		w.setName(n);
		System.out.println("Enter the opacity of the blackhole");
		double o = sc.nextDouble();
		w.setOpacity(o);
		System.out.println("Enter the radius of the blackhole");
		int r = sc.nextInt();
		w.setRadius(r);
		System.out.println("Enter the temperature of the star");
		long t = sc.nextLong();
		w.setTemperature(t);
		System.out.println("Enter the thermal conductivity of the star");
		long tc = sc.nextLong();
		w.setThermalConductivity(tc);
		w.calculatePressure();
		w.getDetails();
		/*
		 * The below object is created with a parent class reference and a child class
		 * object. This is a good example of Java's run time polymorphism where the
		 * overriden methods are called at runtime. This is a good example of run time
		 * polymorphism which is a critical feature in object oriented programming.
		 * 
		 */
		DwarfStar w1 = new WhiteDwarf();
		System.out.println("Enter constellation name");
		String ct = sc.nextLine();
		w1.setConstellation(ct);
		System.out.println("Enter the fusion rate");
		double ft = sc.nextDouble();
		w1.setFusionRate(ft);
		System.out.println("Enter the lumosity");
		int lt= sc.nextInt();
		w1.setLuminosity(lt);
		System.out.println("enter the name of the blackhole");
		String nm = sc.nextLine();
		w1.setName(nm);
		w1.setRadius(29);
		w1.getDetails();
		
	}

}
