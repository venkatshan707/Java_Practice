import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    String str1 = sc.nextLine ();
        String str2 = sc.nextLine ();
          String concat_str=(str1.concat(str1));
          
          if(concat_str.contains(str2))
              {
                  System.out.println("Yes");
              }
              else{
                  System.out.println("No");
              }
  }
    
}
