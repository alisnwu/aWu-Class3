public class InsertionSort {
  public static int[] insertionSort(int[] arr) {
    int n=arr.length;
    for (int a=1;a<n;a++) {
      int temp=arr[a];
      int temp2=a-1;
      while (temp2>=0&&arr[temp2]>temp) {
        arr[temp2+1]=arr[temp2];
        temp2=temp2-1;
      }
      arr[temp2+1]=temp;
    }
    return arr;
  }
  public static void main(String[] args) {
    int[] sample={5,3,4,2,6,1,7};
    sample=insertionSort(sample);
    for(int n=0;n<sample.length;n++){
      System.out.println(sample[n]);
    }
  }
}
