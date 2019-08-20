
import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
     int org_num=num;
       while(num >= 10)
    {
        num = num / 10;
    }
    int firstDigit=num;
        int lastdigit=org_num%10;
    System.out.println(firstDigit+lastdigit);
   }
   
}