package java_programs;

public class no_is_primr_or_not {

	public static void main(String[] args) 
	{
	int a=8;
	int temp = 0;
	for( int i=2; i<=a-1; i++)
	{
		if(a%i==0)
		{
			temp=temp+1;
		}
	}
	
	if(temp==0)
	{
	System.out.println("no is prime");
	
	}
	else
	{
		System.out.println("no is not prime");
	}

}
}
