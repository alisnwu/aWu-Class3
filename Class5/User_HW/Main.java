public class Main{
  public static void main(String[] args){
    Customer c1 = new Customer();
    c1.register();
    c1.setBalance(54321);
    if(c1.login() == true){
      c1.purchase();
    }
  }
}
