import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
     fact(n);
	}
	static int sum_res=0;
	public static void fact(int num)
	{if(num==0)
	{	System.out.println(sum_res);
	    return ;
	}
	    
	    sum_res=sum_res+(num);
	    fact(--num);
	    
	}
}
