
import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
     int org_num=num;
       while(num >= 100)
    {
        num = num / 10;
    }
    int secondDigit=num;
        
    System.out.println(secondDigit%10);
   }
   
}