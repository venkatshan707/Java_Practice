import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int size_of_arr=sc.nextInt();
      int arr[]=new int[size_of_arr];
      int zero_count=0;
      int with_out_zero_index=0;
      int temp=0;
      int arr_copy[]=new int[size_of_arr];
      for(int i=0;i<size_of_arr;i++)
      {
        arr[i]=sc.nextInt();
        
      }
        for(int i=0;i<size_of_arr;i++)
      {
        if((arr[i])==0)
        {zero_count++;
        }
        else{
          temp=arr[i];
          arr_copy[with_out_zero_index]=temp;
          with_out_zero_index++;
        }
      }
      for(int i=1;i<=zero_count;i++)
      {
        arr_copy[with_out_zero_index]=0;
         with_out_zero_index++;
        
      }
      for(int i=0;i<size_of_arr;i++)
      {
        System.out.print(arr_copy[i]+" ");
      }
      
    }
}