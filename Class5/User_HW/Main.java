public class Main{
  public static void main(String[] args){
    OrderDetails d1 = new OrderDetails();
    d1.setProduct("pen", 3, 2);
    Order o1 = new Order();
    o1.setOrder("12345abc", "4/20/2018");
    Customer c1 = new Customer();
    c1.register();
    c1.setBalance(54321);
    if(c1.login() == true){
      c1.purchase();
    }
  }
}
