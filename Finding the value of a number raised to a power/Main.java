
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int base=sc.nextInt();
int exp=sc.nextInt();
 int out=1;

while(exp >0)

{
     out = out*base;
     --exp;
     
}
System.out.println(out);
}
}