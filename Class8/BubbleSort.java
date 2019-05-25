public class BubbleSort{
  static int swaps = 0;
  public static int[] loop(int[] arr){
    swaps = 0;
    for(int i = 0; i < arr.length - 1; i ++){
      if(arr[i] > arr[i+1]){
        int swapped = arr[i];
        arr[i] = arr[i+1];
        arr[i + 1] = swapped;
        swaps ++;
      }
    }
    return arr;
  }
  public static int[] bubblesort(int[] arr){
    for(;;){
      arr = loop(arr);
      if(swaps == 0){
        break;
      }
    }
    return arr;
  }
  public static void main(String[] args) {
    int[] barr = {1, 65, 3, 1, 7, 7, 5};
    barr = bubblesort(barr);
    for(int i = 0; i < barr.length; i ++){
      System.out.println(barr[i] );
    }
  }
}
