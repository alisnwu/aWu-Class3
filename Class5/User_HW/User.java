import java.util.Scanner;
public class User{
  String userId;
  private String password;
  String registerDate;
  public void setUser(String id){
    userId = id;
  }
  public void setPassword(String pw){
    password = pw;
  }
  public boolean login(){
    Scanner login = new Scanner(System.in);
    System.out.println("Username: ");
    String inpUser = login.nextLine();
    System.out.println("Password: ");
    String inpPass = login.nextLine();
    if(inpUser.equals(userId) && inpPass.equals(password)){
        System.out.println("Login successful.");
        return true;
    }
    else{
        System.out.println("Login unseccessful. Check the user ID and password and try again.");
    }
    return false;
  }
}

class Customer extends User{
  String name;
  String address;
  String email;
  String customerId;
  private static double accountBalance = 0;
  public void register(){
    Scanner register = new Scanner(System.in);
    System.out.println("Name: ");
    name = register.nextLine();
		System.out.println("Address: ");
		address = register.nextLine();
		System.out.println("Email: ");
		email = register.nextLine();
    System.out.println("Set username: ");
    super.setUser(register.nextLine());
		System.out.println("Set password: ");
		super.setPassword(register.nextLine());
  }
  public void setBalance(int x){
    accountBalance = x;
  }
  public static void purchase(){
    Order.placeOrder();
    Scanner ask = new Scanner(System.in);
    System.out.println("Confirm purchase? [y/n]");
    String confirm = ask.nextLine();
    if(confirm.equals("y") && accountBalance > OrderDetails.total){
      accountBalance -= OrderDetails.total;
      System.out.println("Purchase successful. New balance:" + accountBalance);
    }
    else if(confirm.equals("n")){
      System.out.println("Order successfully cancelled.");
    }
    else{
      System.out.println("Insufficient balance: " + accountBalance);
    }
  }
}

class Administrator extends User{
  String name;
  String email;
  public void setAdmin(String name, String email){
    this.name = name;
    this.email = email;
  }
  public void updateProducts(){
    System.out.println("Products updated by " + name);
  }
}
