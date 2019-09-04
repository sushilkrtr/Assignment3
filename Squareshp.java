import java.util.Scanner;

public class Squareshp extends Shape {

	double length;
	
	public void calsquarearea(String name)
	{
		this.name=name;
		System.out.println("Area of "+name+"is:");
		double area;
		area=0.5*length*length;
		System.out.println(+area);
	}
	public static void main(String[] args) {
		Squareshp ssp=new Squareshp();
		ssp.dispShape("Rectanle");
		System.out.println("Enter length of Rectangle");
		Scanner sc=new Scanner(System.in);
		ssp.length=sc.nextDouble();
		ssp.calsquarearea("Rectangle");		
	}
}
