package String;

import java.util.Arrays;

public class dublicate_String {
	
	public static void main(String [] args)
	{
		String s= "balkrushna raosaheb kale";
		
		char [] a = s.toCharArray();
		
		for(int i=0; i<s.length();  i++)
		{
			for(int j=i+1; j<s.length(); j++)
			{
				if(a[i]==a[j])
				{
					
					System.out.print(" "+a[j]);
					break;
					
				}
				
			}
			
		}
		
	}

}
String s = "Balkrushna Raosaheb Kale";
s=s.toLowerCase();
char a[] = s.toCharArray();
Arrays.sort(a);

for(int i=0; i<s.length(); i++)
{
	//int count = 1;
	for(int j= i+1; j<s.length(); j++)
	{
		if(a[i]==a[j] )
		{
			//count++;
			//a[j]='0';
			System.out.print(a[j]);
			break;
		}
	}
	/*
	if(count>1 && a[i]!='0')
	{
		System.out.print(" "+a[i]);
	}
}*/



	}	
	}
}
	
