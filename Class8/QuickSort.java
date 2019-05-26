public class QuickSort {
  public static int[] quickSort(int[] arr, int low, int high) {
		int mid=(low+high) / 2;
		int left=low;
		int right=high;
		int pivot=arr[mid];
		while (left <= right) {
			while (arr[left]<pivot)
				left++;
			while (arr[right]>pivot)
				right--;
			if (left<=right) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		}
		if (low<right) {
      quickSort(arr, low, right);
    }
		if (left<high) {
      quickSort(arr, left, high);
    }
    return arr;
	}
  public static void main(String[] args) {
    int[] sample={5,3,4,2,6,1,7};
    sample=quickSort(sample,0,6);
    for(int n=0;n<sample.length;n++){
      System.out.println(sample[n]);
    }
  }
}
