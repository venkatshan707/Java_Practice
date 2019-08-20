import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int first=num/10;
      int second=num%10;
      int sum=first+second;
      System.out.println(sum);
    }

	
}