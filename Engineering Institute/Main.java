import java.util.*;

class Faculty
{static int cseBaseSalary;static int itBaseSalary;static int eceBaseSalary;
  public void salary(int baseSalary)
  {
   cseBaseSalary=baseSalary;
     itBaseSalary=baseSalary;
      eceBaseSalary=baseSalary;
    
  }
  
  
}
class CSE extends Faculty
{
  public int salary()
  {
 
    int cseFacultyTotalSalary=(cseBaseSalary+3000);
    return cseFacultyTotalSalary;
  }
}
class IT extends Faculty
{
  public int salary()
  {
    int itFacultyTotalSalary=(itBaseSalary+5000);
    return itFacultyTotalSalary;
  }
}
class ECE extends Faculty
{
  public int salary()
  {
    int eceFacultyTotalSalary=(eceBaseSalary+4500);
    return eceFacultyTotalSalary;
  }
}

class Main
{
  public static void main(String[] args)
  { Scanner sc=new Scanner(System.in);
   int baseSalary=sc.nextInt();
   
   Faculty obj=new Faculty();
   obj.salary( baseSalary);
    CSE obj1= new CSE();
     IT obj2 =new IT();
     ECE obj3 = new ECE();
   System.out.println("Base Salary: "+baseSalary);
   System.out.println("CSE Faculty: "+obj1.salary());
     System.out.println("IT Faculty: "+obj2.salary());
     System.out.println("ECE Faculty: "+obj3.salary());
   
  }
}