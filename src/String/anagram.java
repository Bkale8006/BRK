package String;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {

		String a = "Grab";
		String b= "Brag";
		
		
		a=a.toLowerCase();
		b=b.toLowerCase();
	
		
		char x[]= a.toCharArray();
		char y[]= b.toCharArray();
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		if(Arrays.equals(x,y))	
		
    {
    System.out.println("both Strings anagram");
    
    }
    else
    {
    	System.out.println("not");
    }
	
	}

}
