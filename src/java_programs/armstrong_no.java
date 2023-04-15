package java_programs;

public class armstrong_no {

	public static void main(String[] args) {

		int no=153;
		int t1=no;
		int length=0;
		
	while(t1!=0)
		{
		
		length=length+1;
		
		t1=t1/10;
		}
	int t2=no;
	int arm=0;


	while(t2!=0)
	{
	
		int mul=1;
		int rem=0;
		rem=t2%10;
		for(int i=1; i<=length; i++)
		{
			mul=mul*rem;
		}
		arm=arm+mul;
		t2=t2/10; 
		}
	if(arm==no)
	{
		System.out.println("no is armstrong no");
	}
	else
	{
		System.out.println("no is not armstrong no");
	}
	
	
	
	}
	
}
