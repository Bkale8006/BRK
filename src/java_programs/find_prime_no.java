package java_programs;

public class find_prime_no {
	public static void main(String [] args)
	{
	
		for(int i=1; i<=100; i++)
		{
			int temp=0;
			for(int j=2; j<=i-1; j++)
			{
				if(i%j==0)
				{
					temp=temp+1;
				}
				
			}
			if(temp==0)
			{
				System.out.print(" "+i);
			}
		}
	}
}


