import java.util.*;
public class Main
{
  public static void main(String args[])
  {  Scanner sc=new Scanner(System.in);
  int n1=sc.nextInt();
   int n2=sc.nextInt();
   int res=pow(n1,n2);
   System.out.println(res);
  } 


    public static int pow(int base,int exponent) {

       
        int result =(int) (Math.pow(base, exponent));

        return result;
    }
}
