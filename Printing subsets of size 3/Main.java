import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int size_of_arr=sc.nextInt();
      int arr[]=new int[size_of_arr];
      for(int i=0;i<size_of_arr;i++)
      {
        arr[i]=sc.nextInt();
        
      }
      int arr_size=size_of_arr;
      
      for(int index1 = 0; index1 <= arr_size - 2; index1++)
        {
            for(int index2 = index1 + 1; index2 <= arr_size - 1; index2++)
            {
                for(int index3 = index2 + 1; index3 <= arr_size - 1; index3++)
                {
                    System.out.print("(" + arr[index1] + "," + " " + arr[index2] + "," + " " + arr[index3] + ")" + " ");
                }
            }
            System.out.println();
    }    }
}
