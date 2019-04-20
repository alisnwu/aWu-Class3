public class Order{
  static String orderId;
  static String date;
  static String costumerId;
  static String costumerName;
  public void setOrder(String id, String d){
    orderId = id;
    date = d;
  }
  public static void placeOrder(){
    OrderDetails.calculateTotal();
    System.out.println(orderId + " " + date + " " + OrderDetails.quantity + " " + OrderDetails.productName + " Total: " + OrderDetails.total);
  }
}

class OrderDetails{
  static String orderId;
  static String productId;
  static String productName;
  public static int quantity;
  public static double unitCost;
  public static double total;
  public void setProduct(String name, int quantity, int cost){
    productName = name;
    this.quantity = quantity;
    unitCost = cost;
  }
  public static void calculateTotal(){
    total = quantity * unitCost;
  }
}
