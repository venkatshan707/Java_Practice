import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int no_of_rows=sc.nextInt();
    int no_of_column=sc.nextInt();
    int arr[][]=new int [no_of_rows][no_of_column];
    for(int i=0;i<no_of_rows;i++)
    {
        for(int j=0;j<no_of_column;j++)
        {
         arr[i][j]=sc.nextInt();   
        }
    }
	
	for(int i=(no_of_rows-1);i>=0;i--)
	{
	    for(int j=0;j<no_of_column;j++)
	    {
	        System.out.print(arr[j][i]+" ");
	    }System.out.println();
	}
}

}
