package String;

public class punctuation {

	public static void main(String[] args) {
		
		String s = " the, line, 'king' always ! be roar;";
		 int vcount=0;
		 int ccount=0;
		for(int i =0; i<=s.length(); i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='i'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u') 
			{
				vcount++;
				
				
			}
			else if(s.charAt(i) >= 'a' && s.charAt(i)<='z') 
			{
				ccount++;
				
			}
			
		}
		System.out.println(ccount);
		System.out.println(vcount);

	}

	
	
}
