
public class Circle {

	double radius=1.0;
	String color="red";
	int cc;

	public Circle()
	{
		
	}
	
	public Circle(double radius)
	{
		this.radius = radius;
	}

	public Circle(double radius,String color)
	{
		this.radius=radius;
		this.color=color;
		
	}
	
	public void getRadius() {
		System.out.println("Radius is "+radius);
		System.out.println("Colour is "+color);
//		return color.getBytes();
	}
	
	public void getArea() {
		double area=3.14*radius*radius;
		System.out.println("Area is"+area);
		System.out.println("Colour is "+color);
//		return color.getBytes();
	}
	
	public void displayCircle(int cc)
	{
		this.cc=cc;
		System.out.println("Details of the "+cc+"circle is ");
		
	}
	public static void main(String[] args) {
		
		Circle c=new Circle();
		Circle c1=new Circle(13,"Green");
		Circle c2=new Circle(16);
		
		c.displayCircle(1);
		c.getRadius();
		c.getArea();
		
		
		c1.displayCircle(2);
		c1.getRadius();
		c1.getArea();
		
		c2.displayCircle(3);
		c2.getRadius();
		c2.getArea();
	}
}
