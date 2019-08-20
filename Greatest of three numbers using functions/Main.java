import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  
	   Scanner input = new Scanner (System.in);
int num1 = input.nextInt ();
int num2 = input.nextInt ();
int num3 = input.nextInt ();
      int res=find_greatest(num1,num2,num3);
	System.out.println(res);                   }
  	public static int find_greatest (int n1,int n2,int n3)
    {
      if (n1>n2&&n1>n3)
     return n1;
     else if (n2>n1&&n2>n3)
      return n2;
     else
      return n3;

	}
}