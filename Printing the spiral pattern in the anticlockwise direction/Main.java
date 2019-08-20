import java.util.*;
public class Main{
  public static void main( String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int spiral[][]=new int[n][n];
    value_to_spiral(spiral,n);
      for(int i=0;i<n;i++)
      {for(int j=0;j<n;j++)
      {System.out.print(spiral[i][j]+" ");
       
      }System.out.println();
      }
  }
   public static void value_to_spiral(int spiral[][],int n)
   {int val=1;
    int r_min=0;
    int r_max=n-1;
    int c_min=0;
    int c_max=n-1;
    while(c_min<=c_max&&r_min<=r_max)
    {
    for(int i=c_max;i>=c_min;i--)
    {
        spiral[r_min][i]=val++;
          }
      for(int j = r_min+1 ;j<=r_max;j++)
      {
          spiral[j][c_min]=val++;
      }
       for(int k=c_min+1;k<=c_max;k++)
      {
          spiral[r_max][k]=val++;
      }
       for(int l=(r_max-1);l>=(r_min+1);l--)
      {
          spiral[l][c_max]=val++;
      }
      c_min++;
      c_max--;
      r_min++;
      r_max--;
    }
}}