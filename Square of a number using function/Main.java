import java.util.Scanner;

class Main
{
	public static void main (String[] args)
    {
	 Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     int  res=square(n);
      System.out.println(res);
	} public static int square(int num)
    {int res1=num*num; 
    
    return res1;
    }
  
}