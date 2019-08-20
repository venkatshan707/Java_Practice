import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
       String str2 = scan.nextLine();
    int str_len1 = str1.length();
    int str_len2 = str2.length();
  int count=0;
    for(int idx=0;idx<((str_len1-str_len2)+1);idx++)
    {boolean is_matching=true;
        for(int j=0;j<str_len2;j++)
        {  
            if(str1.charAt(idx+j) !=str2.charAt(j))
            {
                is_matching=false;
            }
        }
        if(is_matching==true)
        {
            ++count;
        }
    }  
    System.out.println(count);
  }
    }

