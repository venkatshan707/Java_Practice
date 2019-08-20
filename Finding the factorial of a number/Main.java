import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
     fact(n);
	}
	static int fact_res=1;
	public static void fact(int num)
	{if(num==0)
	{	System.out.println(fact_res);
	    return ;
	}
	    
	    fact_res=fact_res*num;
	    fact(--num);
	    
	}
}
