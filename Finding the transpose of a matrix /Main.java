import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no_of_rows=sc.nextInt();
		int no_of_cols=sc.nextInt();
		int matrix [] []=new int[no_of_rows] [no_of_cols];
      	int t_matrix [] []=new int[no_of_cols] [no_of_rows];
		for(int i=0;i<no_of_rows;i++)
		 {
		     for(int j=0;j<no_of_cols;j++)
		     {
		         matrix[i] [j]=sc.nextInt();
		     }
		 }
      for(int i=0;i<no_of_rows;i++)
		 {
		     for(int j=0;j<no_of_cols;j++)
		     {
		         t_matrix[j] [i]=matrix [i] [j];
		     }
		 }

	
	        for(int i=0;i<no_of_rows;i++)
	        {for(int j=0;j<no_of_cols;j++)
	        {
	           System.out.print(t_matrix[i][j]+" "); 
	        } 
	        System.out.println();
	        }
	       
		 
	}
	
}

