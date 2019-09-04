
public class NScounter {
	
	 int count;
	public NScounter(int count)
	{
		this.count=count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		NScounter ns=new NScounter(8);
//		System.out.println(ns.count);
		
	}

}
