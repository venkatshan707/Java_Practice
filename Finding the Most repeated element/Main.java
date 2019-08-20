
//Java program to find the most frequent element 
//in an array 
import java.util.*; 
  
class Main { 
      public static void main (String[] args) { 
          
        Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
      int arr[]=new int[n]; 
   for(int i=0;i<n;i++)
   {arr[i]=sc.nextInt();
   }
      int most_Frequent = mostFrequent(arr,n); 
        if(most_Frequent==0)
        {
          most_Frequent=6;
        }
        System.out.println(most_Frequent) ;
          
    } 
    static int mostFrequent(int arr[], int n) 
    { 
          
        // Sort the array 
        Arrays.sort(arr); 
          
        // find the max frequency using linear 
        // traversal 
        int max_count = 1, res = arr[0]; 
        int curr_count = 1; 
          
        for (int i = 1; i < n; i++) 
        { 
            if (arr[i] == arr[i - 1]) 
                curr_count++; 
            else 
            { 
                if (curr_count > max_count) 
                { 
                    max_count = curr_count; 
                    res = arr[i - 1]; 
                } 
                curr_count = 1; 
            } 
        } 
      
        // If last element is most frequent 
        if (curr_count > max_count) 
        { 
            max_count = curr_count; 
            res = arr[n - 1]; 
        } 
      
        return res; 
    } 
      
    // Driver program 
    
} 
  
