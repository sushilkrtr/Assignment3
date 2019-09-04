
public class Current extends Account{

	public Current(String name,int acc_no,String acc_type,double balance)
	{
		this.cust_name=name;
		this.acc_no=acc_no;
		this.acc_type=acc_type;
		this.balance=balance;
	}
	public void overDraft()
	{
		if(balance>2000)
		{
			System.out.println("You can withdraw amount");
		}
		else
		{
			System.out.println("Minimum balance not available,cannot do withdraw");
		}
	}
	public void calInterest()
	{
		System.out.println("This is a current account with No interest");
	}
	
	public static void main(String[] args)                                          
	{
		Saving sv=new Saving("Manoj", 12345678, "Savings",34098376);
		Current ct=new Current("Swami",345432343,"Current",1500);
		sv.calInterest();
		ct.overDraft();
		ct.calInterest();
	}
}
