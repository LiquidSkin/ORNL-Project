import java.io.*;
import java.math.*;
import java.util.*;

/*
This is a Star class with the following properties represented as instance variables. All the properties are private for the purpose of demonstrating
Data Encapsulation in Java. We can access these variables by using the getter and setter methods provided within the class.C
*/
public class Star {
	private String name;
	private String constellation;
	private int luminosity;
	private long temperature;
	private double flux;
	private int radius;

	// get and set the name of the star
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.length() < 0) {
			throw new IllegalArgumentException();
		}

		this.name = name;
	}

	// get and set the radius of the star
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// get and set the name of the constellation where the star is
	public String getConstellation() {
		return constellation;
	}

	public void setConstellation(String constellation) {
		if (constellation == null || constellation.length() < 0) {
			throw new IllegalArgumentException();
		}
		this.constellation = constellation;
	}

	// get and set the lumosity of the star
	public int getLuminosity() {
		return luminosity;
	}

	public void setLuminosity(int luminosity) {
		this.luminosity = luminosity;
	}

	// get and set the temperature of the star
	public long getTemperature() {
		return temperature;
	}

	public void setTemperature(long temperature) {
		this.temperature = temperature;
	}

	// this is a method to calculate the flux of the star by using its radius and
	// lumosity
	public double calculateFlux() {
		setFlux(luminosity / (4 * radius * radius * Math.PI * Math.PI));
		return getFlux();

	}

	// driver function to set the properties of the star class
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Star s1 = new Star();
		System.out.println("Enter the constellation name");
		String constellation = sc.nextLine();
		s1.setConstellation(constellation);
		System.out.println("Enter the star name");
		String name = sc.nextLine();
		s1.setName(name);
		System.out.println("Enter the lumosity of the star");
		int l = sc.nextInt();
		s1.setLuminosity(l);
		System.out.println("Enter the temperature of the star");
		long temp = sc.nextLong();
		s1.setTemperature(temp);
		System.out.println("Enter the radius of the star");
		int radius = sc.nextInt();
		s1.setRadius(radius);
		System.out.println(s1.getName());
		System.out.println(s1.getConstellation());
		System.out.println(s1.getLuminosity());
		System.out.println(s1.getTemperature());
		System.out.println(s1.getRadius());
		System.out.println(s1.calculateFlux());

	}

	public double getFlux() {
		return flux;
	}

	public void setFlux(double flux) {
		this.flux = flux;
	}

}
