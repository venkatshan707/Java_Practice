import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      int key_dec=sc.nextInt();
      if(ch>='a'&&ch<='z')
      {
       int offset=ch-'a';
        offset=(int) (((offset-key_dec)+26)%26);
        ch=(char)(offset+'a');
      }
      if(ch>='A'&&ch<='Z')
      {
       int offset=ch-'A';
        offset=(int) (((offset-key_dec)+26)%26);
        ch=(char)(offset+'A');
      }
      System.out.println(ch);
    }
}