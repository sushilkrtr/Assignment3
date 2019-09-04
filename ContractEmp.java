
public class ContractEmp extends Directemp {

	double perday;
	

	public ContractEmp(String Name, int Id, double salary,double basic,double TA,double DA,double perday) 
	{
		this.Name = Name;
		this.Id = Id;
		this.salary = salary;
		this.basic=basic;
		this.TA=TA;
		this.DA=DA;
		this.perday=perday;
		System.out.println("");
	}
	public void calContEmpSalary()
	{
		 salary=salary+basic+DA+TA+(perday*50);
		 System.out.println("Employee "+Name+ " worked for "+perday+" days and has a salary of total ");
		System.out.println(salary);
	}
	
public static void main(String[] args) {
	
	ContractEmp e5=new ContractEmp("Saurabh",146048,340000,345,456,234,200);
	ContractEmp e6=new ContractEmp("Amit",146049,5600,4867,987,456,250);
    e5.calContEmpSalary();
		
		
	}
	
}
