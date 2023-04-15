package String;

public class rev {
	
	public static void main(String[]arg)
	{
		String s= "balkrushna";
		String rev =" ";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev = rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}

}

String s= "balkrushnab raosaheb kale";

char [] a = s.toCharArray();

for(int i=0; i<s.length();  i++)
{
int	count =1;
	for(int j=i+1; j<s.length(); j++)
	{
		if(a[i]==a[j] && a[i]!=0 )
		{
			count++;
			a[j]='0';
			
		}
	}
	if(count>1 && a[i]!='0')
	{
		System.out.println(a[i]);
	}
}

}

}
