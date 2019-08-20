import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int size_of_arr=sc.nextInt();
          int j=0;
      int arr[]=new int[size_of_arr];
      for(int i=0;i<size_of_arr;i++)
      {
        arr[i]=sc.nextInt();
      }
           int value=sc.nextInt();
           int resultant_value=0;
      for(int i=0;i<size_of_arr;i++)
      {
          for( j=i+1;j<size_of_arr;j++)
          {
              resultant_value=arr[i]+arr[j];
              
             if(resultant_value==value)
             {
                 System.out.println(arr[i]+", "+arr[j]);}
          }
          
      }
      
    }
}
