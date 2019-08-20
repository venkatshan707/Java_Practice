import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int first=num/100;
      int third=num%10;
      int sum=first+third;
      System.out.println(sum);
    }
}
	
