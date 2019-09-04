
public class Directemp extends Employee {
	double basic;
	double TA;
	double DA;
	
	public Directemp()
	{
		
	}
//	public String toString()
//	{
//		return "";
//	}
	
	public Directemp(String Name, int Id, double salary,double basic,double TA,double DA) {
		this.Name = Name;
		this.Id = Id;
		this.salary = salary;
		this.basic=basic;
		this.TA=TA;
		this.DA=DA;
		System.out.println("");
	}
	public void calDirEmpSalary()
	{
		 salary=salary+basic+DA+TA;
		 System.out.println("Employee "+Name+ " has a salary of total ");
		System.out.println(salary);
	}

	public static void main(String[] args) {
		
		Directemp e1=new Directemp("Sushil",146041,34000,3400,670.3,234);
		Directemp e2=new Directemp("Sumit",146044,3400,2323,5678,23434.4);
		e1.calDirEmpSalary();
		e2.calDirEmpSalary();
	}
}
