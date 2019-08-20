import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n_copy=n;
      
      int rem=0;
      int res=0;
      
      while(n>0)
      {rem=n%10;
       int fact_num=1;
        for(int i=1;i<=rem;i++)
     {
         fact_num=fact_num*i;
       }
       res=(int) (res+fact_num);
       n=n/10;
      }
     
      if(n_copy==res)
      {   System.out.println("Yes");
      }
      else
           System.out.println("No");
      }
	}
