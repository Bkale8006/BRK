package java_programs;

public class Palendrom_no {
	
	public static void main(String []args)
	{
		int no= 123;
		int temp=no;
		int rem;
		int rev=0;
		
		while(temp!=0)
		{
			rem= temp%10;
			temp=temp/10;
			rev=rev*10+rem;
		}
		if(no==rev)
		{
			System.out.println("no is pelendrom");
		}
		else
		{
			System.out.println("no is not palendrom");
		}
	}
}
