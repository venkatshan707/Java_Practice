import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no_of_ele_1=sc.nextInt();
			
		int arr_1[]=new int[no_of_ele_1];
			 int  k_value=sc.nextInt();
		
		for(int i=0;i<no_of_ele_1;i++)
		{
		    arr_1[i]=sc.nextInt();
		}
	 
	
		sort_array(arr_1,no_of_ele_1);
		int occurence_arr[]=new int[(k_value+1)];
       for(int i=0;i<=k_value;i++)
       {
          occurence_arr[i]=0;
       }
       for(int j=0;j<no_of_ele_1;j++)
       {
           int freq=arr_1[j];
           if(freq<=k_value)
           {
               ++occurence_arr[freq];
           }
       }
       for(int k=1;k<=k_value;k++)
       {
           System.out.println(k+" "+occurence_arr[k]);
       }

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
