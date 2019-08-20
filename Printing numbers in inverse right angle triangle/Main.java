import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=n;i>0;i--)
      { int cur_no=i;  
        for(int j=1;j<=i;j++)
        
      {
        System.out.print(cur_no);
          --cur_no;
      }
        System.out.println();
      }
      
	}
}