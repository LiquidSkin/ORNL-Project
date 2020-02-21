import java.util.*;
import java.io.*;

/* This is a stand alone class separate from other star classes to demonstrate some features of Object Oriented 
 Programming like Overloading.
*/
public class BlackHole {
	public String name;
	public double mass;
	public String constellation;
	public String variableType;

	/*
	 * There are 3 implementations of the BlackHole constructor which demonstrate
	 * Constructor Overloading. The first implementation is a default constructor
	 * with default values which would be assigned whenever a new object is created
	 * without any properties assigned. The second constructor is a parameterized
	 * constructor which would set all the properties of the constructor with the
	 * values inputed by the user. The third implementation is a partially
	 * parameterized constructor with one value which can be given as input by the
	 * user and the other values which would be set automatically by the constructor
	 * 
	 */

	BlackHole() {
		name = "MilkyWayBlackHole";
		mass = 200000;
		constellation = "Ursula";
		variableType = "M";
	}

	BlackHole(String name, double mass, String constellation, String variableType) {
		this.name = name;
		this.mass = mass;
		this.constellation = constellation;
		this.variableType = variableType;
	}

	BlackHole(String name) {
		this.name = name;
		mass = 150000;
		constellation = "Canis";
		variableType = "S";
	}

	/*
	 * This is a function which calculates the Schwarzchild radius of the blackhole.
	 * It is not accurate but it demonstrates the use of instance variables and
	 * accomplishes a useful calculation with all the properties which we have
	 * defined in our class.
	 */
	public double calculateSchwarzchildRadius(double mass) {
		long speed = 300000000;
		double universalGravitationalConstant = 0.00000000000667048;
		double radius = (2 * universalGravitationalConstant * mass) / (speed * speed);
		return radius;
	}

	/*
	 * We are overriding the hashcode() and equals() method here because this is an
	 * important part of both Object Oriented Programming in Java and for the proper
	 * functioning of the working of DataStructures which use Hashing. Overriding
	 * the hashcode method provides the same hashcode for the same objects and
	 * overriding the equals method will compare the same objects and set them to be
	 * equal whenever they are equal. If we do not override hashcode and equals
	 * methods, two same objects would be considered different.
	 * 
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((constellation == null) ? 0 : constellation.hashCode());
		long temp;
		temp = Double.doubleToLongBits(mass);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((variableType == null) ? 0 : variableType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BlackHole other = (BlackHole) obj;
		if (constellation == null) {
			if (other.constellation != null)
				return false;
		} else if (!constellation.equals(other.constellation))
			return false;
		if (Double.doubleToLongBits(mass) != Double.doubleToLongBits(other.mass))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (variableType == null) {
			if (other.variableType != null)
				return false;
		} else if (!variableType.equals(other.variableType))
			return false;
		return true;
	}

	// Driver class to test our BlackHole class.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Creating a set of objects and we store all our objects in a set
		Set<BlackHole> set = new HashSet<BlackHole>();
		// This will just create a BlackHole with the default properties mentioned in
		// the default constructor.
		set.add(new BlackHole());
		/*
		 * Creating two objects with the same values deliberately to demonstrate our
		 * hashcode() and equals method works. Since both the methods are overridden.
		 * Only one instance of the object would be added to the set even though we
		 * create two objects with the same values.
		 */
		System.out.println("Enter blackhole name");
		String b = sc.nextLine();
		System.out.println("Enter blackhole mass");
		double m = sc.nextDouble();
		System.out.println("Enter blackhole constellation");
		String c = sc.nextLine();
		System.out.println("Enter blackhole variableType");
		String t = sc.nextLine();
		set.add(new BlackHole(b, m, c, t));
		set.add(new BlackHole(b, m, c, t));
		// A for each loop to demonstrate understanding of loops and I/O. Printing all
		// blackhole objects in the set
		for (BlackHole bh : set) {
			System.out.println("The Name of the BlackHole is" + " " + bh.name);
			System.out.println("The mass of the BlackHole is" + " " + bh.mass);
			System.out.println("The constellation of the BlackHole is" + " " + bh.constellation);
			System.out.println("The variableType of the BlackHole is" + " " + bh.variableType);
			System.out.println("The schwarzschild radius of the BlackHole is ");
			System.out.println(bh.calculateSchwarzchildRadius(bh.mass));
		}
		// The set size would be 2 even though we added 3 objects because 2 objects are
		// the same and hashcode() and equals() methods are overridden.
		System.out.println("The size of the Hashset is" + " " + set.size());

	}
}
