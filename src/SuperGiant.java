import java.util.Scanner;

/* This is a supergiant star which extends the star class demonstrating inheritance in Java. This supergiant 
    class has an additional property surfaceGravity
*/
public class SuperGiant extends Star {
	private float surfaceGravity;

	// getter and setter methods for this additional property
	public float getSurfaceGravity() {
		return surfaceGravity;
	}

	public void setSurfaceGravity(float surfaceGravity) {
		this.surfaceGravity = surfaceGravity;
	}
	

	// driver function to set all the basic properties of a supergiant star
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SuperGiant sg1 = new SuperGiant();
		System.out.println("Enter the star name");
		String name = sc.nextLine();
		sg1.setName(name);
		System.out.println("Enter the constellation name");
		String constellation = sc.nextLine();
		sg1.setConstellation(constellation);
		System.out.println("Enter the lumosity of the star");
		int l = sc.nextInt();
		sg1.setLuminosity(l);
		System.out.println("Enter the radius of the star");
		int radius = sc.nextInt();
		sg1.setRadius(radius);
		System.out.println("Enter the temperature of the star");
		long temp = sc.nextLong();
		sg1.setTemperature(temp);
		System.out.println("Enter the surface gravity of the star");
		float sg = sc.nextFloat();
		sg1.setSurfaceGravity(sg);
		System.out.println(sg1.getSurfaceGravity());
		System.out.println(sg1.calculateFlux());
	}

}
