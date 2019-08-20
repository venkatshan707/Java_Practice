import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no_of_ele_1=sc.nextInt();
			
		int arr_1[]=new int[no_of_ele_1];
			
		
		for(int i=0;i<no_of_ele_1;i++)
		{
		    arr_1[i]=sc.nextInt();
		}
	  int  k_value=sc.nextInt();
	
		sort_array(arr_1,no_of_ele_1);

		int k_th_index=(no_of_ele_1)-k_value;
		System.out.println(arr_1[k_th_index]);
	
	

	}
		 	
	
		
	    public static  void sort_array (int arr[],int no_of_ele){
	   
	   	int temp=0;
	for(int i=0;i<(no_of_ele-1);i++)
	{
	    for(int idx=0;idx<(no_of_ele-1-i);idx++)
	    {
	        if(arr[idx]>arr[idx+1])
	         {
	             temp=arr[idx];
	             arr[idx]=arr[idx+1];
	             arr[idx+1]=temp;
	         }
	    }
	}
	    }
	
}
