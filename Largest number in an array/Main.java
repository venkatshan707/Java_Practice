import java.util.Scanner;
class Main{
    public static void main(String args[]){
    

   int temp=0; 
Scanner sc = new Scanner (System.in);
    
int n = sc.nextInt ();
    
int a[] = new int[n];
for(int idx=0;idx<n;idx++)
     a[idx]=sc.nextInt();
  
   int max=a[0];  
for(int i=0;i<n;i++)
{
   
    {if(a[i]>max)
    max=a[i];
        
     
    }
}
System.out.println(max);
}

}

    