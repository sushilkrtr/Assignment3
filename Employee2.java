import java.util.Scanner;

public class Employee2 extends Person{

	public void myProfession()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("This is "+name+" and my age is "+age+"and I am a Student");
	}
	
	public static void main(String[] args) {
		
		Teacher tc=new Teacher();
		tc.myProfession();
		Employee2 td=new Employee2();
		td.myProfession();
	}
}
