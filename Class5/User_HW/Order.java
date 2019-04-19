public class Order implements Customer{
  private String orderId;
  private Date date;
  private String customerName;
  private String customerId;
  public placeOrder(){
    
  }
}
public class OrderDetails implements Order{
  private String orderId;
  private String productId;
  private String productName;
  private int quantity;
  private double unitCost;
  private double total;
  public calculateTotal(){

  }
}
