public class Hw{
  public static void main(String[] args){
    Account a1 = new Account(1234, 18.5);
    System.out.println(a1.getAccount());
    System.out.println(a1.getBalance());
    a1.credit(1.5);
    a1.debit(10.5);
    a1.debit(25);
    System.out.println(a1);
  }
}
class Account{
  private int accountNumber;
  private double balance;
  private double amount;
  public Account(int accountNumber, double balance){
    this.accountNumber = accountNumber;
    this.balance = balance;
  }
  public Account(int accountNumber){
    this.accountNumber = accountNumber;
  }
  public int getAccount(){
    return accountNumber;
  }
  public double getBalance(){
    return balance;
  }
  public void setBalance(double balance){
    this.balance = balance;
  }
  public void credit(double amount){
    System.out.println("credit: " + (balance + amount));
  }
  public void debit(double amount){
    if (balance >= amount){
      System.out.println("debit: " + (balance - amount));
    }
    else{
      System.out.println("Amount withdrawn exceeds the current balance");
    }
  }
  public String toString(){
    return "A/C no: " + accountNumber + ", Balance = $" + balance;
  }
}
