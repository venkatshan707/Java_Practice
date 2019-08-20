import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int list[] = new int[n];
    for (int i = 0; i < n; i++)
      {
	list[i] = sc.nextInt ();
      }
    int initial_three_num_sum = list[0] + list[1] + list[2];
    check_perfect_batch (list, n, initial_three_num_sum);
  }
  public static void check_perfect_batch (int list[], int n,
					  int initial_three_num_sum)
  {
      
    boolean is_perfectbatch = true;
    for (int index = 3; index < n; index = index + 3)
      {
	 int curr_three_num_sum =list[index] + list[index + 1] + list[index + 2];

	if (curr_three_num_sum != initial_three_num_sum)
	  {
	    is_perfectbatch = false;
	    
	  }

      }
    if (is_perfectbatch == true)
      System.out.println ("Perfect Batch");
    else
      System.out.println ("Not a Perfect Batch");
  }
}