import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    int count=0;
      int num=n;
      int org_num=n;
      int rem=0;
      int res=0;
      
      while(n>0)
      {n=n/10;
       ++count;
      }
      while(num>0)
      {
        rem=num%10;
        res=(int) (res+Math.pow(rem,count));
        num=num/10;
      }
      if(org_num==res)
        System.out.println("Armstrong Number");
      else
           System.out.println("Not a Armstrong Number");
      
	}
}