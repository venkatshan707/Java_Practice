import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int [r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++)
		    {
		         arr[i][j]=sc.nextInt();
		    }
		}
       upper_triangle(r,c,arr);

	}   public static void upper_triangle(int r,int c,int matrix[][])
	{
	    int i,j,k;
		    for( k=0;k<c;k++)
		    {
		        for ( i=0,j=k;j<r;i++,j++)
		        {
		           { 
		            System.out.print(matrix [i][j]+" ");
		           }
		        }
		    }
		
}
}
