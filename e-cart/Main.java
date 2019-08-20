import java.util.*;

class Item
{
  private static int price;
  
  public void setPrice(int p)
  {
      this.price=p;
      
      
 }
 public int getPrice()
 {   
     return this.price;
 }
}
   
class Customer 
{
  private String product;
  private static int quantity;
  public void setCoustomerprod( String product,int quantity)
  {
      this.product=product;
      this.quantity=quantity;
  }
  public int getQuantity()
  {
      return this.quantity;
  }
}

class Bill 
{ 
    

    public int getTotalAmount()
    {Item obj4=new Item();
    Customer obj5=new Customer();
    int totalAmount=(obj4.getPrice())*(obj5.getQuantity());
       
        return totalAmount;
    }
    
  
}
class Main
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      String product=sc.nextLine();
      int price=sc.nextInt();
      int quantity=sc.nextInt();
      Item obj1=new Item ();
      Customer obj2=new Customer();
      Bill obj3=new Bill();
      obj1.setPrice(price);
      obj2.setCoustomerprod( product,quantity);

    System.out.println("Total Price is : "+obj3.getTotalAmount());
    

  }
}