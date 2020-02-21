import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

// This is a class written in Junit to do unit testing for some of the classes implemented
class Testcases {

	@Test
	/*
	 * This BlackHoleTest() method is a unit test to check the creation of a default
	 * BlackHole object with no values and then see whether the name and
	 * constellation name matches with the values assigned in the default
	 * constructor
	 * 
	 */
	public void BlackHoleTest() {
		Scanner sc = new Scanner(System.in);
		BlackHole bt = new BlackHole();
		assertEquals(bt.name, "MilkyWayBlackHole");
		assertEquals(bt.constellation, "Ursula");
	}

	@Test
	/*
	 * This method is to test a blackhole object creation and checking whether the
	 * input name matches with the name of the blackhole object already created.
	 * 
	 */
	public void BlackHoleTest2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of your blackhole");
		String name = sc.nextLine();
		BlackHole bt = new BlackHole(name);
		assertEquals(bt.name, name);
	}
	public void BlackHoleTest3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of your blackhole");
		String name = sc.nextLine();
		BlackHole bt = new BlackHole(name);
		assertEquals(bt.name, name);
	}


	@Test
	/*
	 * This test is used to create a white dwarf class object, assign a radius value
	 * to it and then find the pressure of the star using the radius and checking if
	 * the calculated pressure is equal to the formula
	 * 
	 */
	public void WhiteDwarfTest() {
		Scanner sc = new Scanner(System.in);
		WhiteDwarf w = new WhiteDwarf();
		System.out.println("Enter the radius of the white dwarf");
		int radius = sc.nextInt();
		w.setRadius(radius);
		assertEquals(w.calculatePressure(), w.getRadius() * w.getRadius());
		// assertEquals(w.calculatePressure(),w.getRadius() * w.getRadius() *
		// w.getRadius());
	}

	@Test
	/*
	 * Similar Test to WhiteDwarf but a star object is created and parameters like
	 * lumosity and radius are assigned and the test checks the flux of the star
	 * which is calculated using these parameters and compares with the actual
	 * formula
	 * 
	 */
	public void StarTest() {
		Scanner sc = new Scanner(System.in);
		Star s = new Star();
		System.out.println("Enter the lumosity of the star");
		int l = sc.nextInt();
		s.setLuminosity(l);
		System.out.println("Enter the radius of the star");
		int r = sc.nextInt();
		s.setRadius(r);
		assertEquals((int) s.calculateFlux(), (int) (l / (4 * r * r * Math.PI * Math.PI)));

	}

}
