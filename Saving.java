
public class Saving extends Account{

	double interest;
	public Saving(String name,int acc_no,String acc_type,double balance)
	{
		this.cust_name=name;
		this.acc_no=acc_no;
		this.acc_type=acc_type;
		this.balance=balance;
	}
	public void calInterest()
	{
		interest=balance*10.5/100;
		System.out.println(interest);
	}
	
}
