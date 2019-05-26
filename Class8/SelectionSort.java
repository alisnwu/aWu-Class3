public class SelectionSort{
  public static int[] selectionSort(int[] arr){
    for(int i = 0; i < arr.length; i ++){
      int lowest = i;
      for(int j = i; j < arr.length; j ++){
        if(arr[j] < arr[lowest]){
          lowest = j;
        }
      }
      int n = arr[lowest];
      arr[lowest] = arr[i];
      arr[i] = n;
    }
    return arr;
  }
  public static void main(String[] args) {
    int[] barr = {5,3,4,2,6,1,7};
    barr = selectionSort(barr);
    for(int i = 0; i < barr.length; i ++){
      System.out.println(barr[i]);
    }
  }
}
