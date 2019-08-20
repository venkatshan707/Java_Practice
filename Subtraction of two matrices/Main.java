import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no_of_rows=sc.nextInt();
		int no_of_cols=sc.nextInt();
		int matrix1 [] []=new int[no_of_rows] [no_of_cols];
			int matrix2 [] []=new int[no_of_rows] [no_of_cols];
				int resultent_mat [] []=new int[no_of_rows] [no_of_cols];
		for(int i=0;i<no_of_rows;i++)
		 {
		     for(int j=0;j<no_of_cols;j++)
		     {
		         matrix1 [i] [j]=sc.nextInt();
		     }
		 }
		 for(int i=0;i<no_of_rows;i++)
		 {
		     for(int j=0;j<no_of_cols;j++)
		     {
		         matrix2 [i] [j]=sc.nextInt();
		     }
		 }
		 for(int i=0;i<no_of_rows;i++)
		 {
		     for(int j=0;j<no_of_cols;j++)
		     {
		         resultent_mat [i] [j]=(matrix1 [i] [j]-matrix2[i] [j]);
		     }
		 }

	        for(int i=0;i<no_of_rows;i++)
	        {for(int j=0;j<no_of_cols;j++)
	        {
	           System.out.print(resultent_mat [i] [j]+" "); 
	        } 
	        System.out.println();
	        }
	
		 
	}
	
}


