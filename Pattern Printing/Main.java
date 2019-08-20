import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n1=sc.nextInt();
	     int n2=sc.nextInt();
	    
	    
		for(int i=n1;i>=1;i--)
		{
		    	for(int j=n2;j>=1;j--)
		    	{
		    	    int p=((i>j)? i:j);
		    	    System.out.print(p);
		    	}System.out.println();
		}
	}
}
