import java.util.Scanner;
class Main{
    public static void main(String args[]){
    


    
Scanner sc = new Scanner (System.in);
    
int n = sc.nextInt ();
    
int arr[] = new int[5];
    
int ele1_find = 0;
    
int ele2_find = 0;
int loc1=0;
int loc2=0;

    
for (int idx = 0; idx <= n - 1; idx++)
      
arr[idx] = sc.nextInt ();
    
int first_ele = sc.nextInt ();
    
int sec_ele = sc.nextInt ();
    
for (int idx = 0; idx <= n - 1; idx++)
      
      {
	
if (arr[idx] == first_ele)
	  
	  {
	    ele1_find = 1;
	   loc1=idx; 
break;
	  
 
}
      
}
    
if (ele1_find == 1)
      
System.out.println (loc1);
    
    else
      
System.out.println ("-1");
    
 
for (int idx = 0; idx <= n - 1; idx++)
      
      {
	
if (arr[idx] == sec_ele)
	  
	  {
	    ele2_find = 1;
	    loc2=idx;
break;
	  }
      
}
    
if (ele2_find == 1)
      
 
System.out.println (loc2);
    
    else
      
System.out.println ("-1");
  
 
}

}

    
