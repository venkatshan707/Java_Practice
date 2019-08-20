
import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
     int org_num=num;
    int remainder=0;
       
    
    while(num!=0)
    {
        remainder+=num%10;
        num=num/10;
        
        
        
    }
    int sum=remainder;
        
    System.out.println(sum);
   }}