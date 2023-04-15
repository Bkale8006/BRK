package array;

public class lengthofarray {

	public static void main(String[] args) {
		
		
		
int x []= {1,2,3,4,5,5,4};
int [] temp= new int[x.length];
int j=0;
for(int i=0; i<x.length-1; i++)
{
	if(x[i]!=x[i+1])
	{
		temp[j]=x[i];
				j++;
	}
	System.out.print(temp[i]);
}

}
}
