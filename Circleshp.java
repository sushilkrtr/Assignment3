import java.util.Scanner;

public class Circleshp extends Shape{

	double radius;

	
	public void calculateCirclearea()
	{
		System.out.println("Area of Circle is :");
		double area;
		area=3.14*radius*radius;
		System.out.println(+area);
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Circleshp cp=new Circleshp();
		cp.dispShape("Circle");
		cp.radius=sc.nextDouble();
		cp.calculateCirclearea();
		
	}
}
