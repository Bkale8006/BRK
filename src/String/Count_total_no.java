package String;

public class Count_total_no {

	public static void main(String[] args) {
		
		String s =" balkrushna raosaeb kale";
		String a= "raosaheb";
		System.out.println(s.length());
		//System.out.print("   "+ a.length());
		
		  String rev=" ";
		 
		  for(int i=s.length()-1; i>=0; i--) 
		  {
			  rev=rev+s.charAt(i);
		 
		 }
		  System.out.println(rev);
		 
	}

}
