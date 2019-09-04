
public class SCounter {
	
	static double count;
	public SCounter(int count)
	{
		this.count=count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		
		SCounter sc=new SCounter(5);
		
	}

}
