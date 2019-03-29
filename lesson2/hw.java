public class hw {
  public static void main(String[] args){
    //1
    reverseArray(new int[]{1,2,3,4,5,6,7,8,9,});
    //2
    int[][] grid = new int[][]{
      {1,2,3,4},
      {5,6,7,8},
      {9,10,11,12}
    };
    doubleArray(grid);
    //3
    int num = 133;
    decBinary(num);
    //4
    median(new int[]{2,4,34,27,15});
    //5
    boolean[] lockers = new boolean[100];
    for (int student = 1; student <= 100; student++) {
      shuffle(lockers, student);
    }
    display(lockers);
  }
  public static void reverseArray(int[] arr){
    int temp;
    for (int i = 0; i < arr.length/2; i++){
      temp = arr[i];
      arr[i] = arr[arr.length-1-i];
      arr[arr.length-1-i] = temp;
    }
    for (int b = 0; b < arr.length; b++){
      System.out.println(arr[b]);
    }
  }
  public static void doubleArray(int[][] grid){
    for (int row = 0; row < grid.length; row++){
      for (int col = 0; col < grid[row].length; col++)
        System.out.print(grid[row][col] + " ");
      System.out.println();
    }
  }
  public static void decBinary(int num){
    int[] binary = new int[40];
    int index = 0;
    while (num > 0){
      binary[index++] = num % 2;
      num = num / 2;
    }
    for (int g = index-1; g >= 0; g--)
      System.out.print(binary[g]);
    System.out.println();
  }
  public static void median(int[] m) {
    for (int x = 0; x < m.length; x++) {
      for (int y = 0; y < m.length; y++) {
        if (m[x] < m[y]) {
            int temp = m[x];
            m[x] = m[y];
            m[y] = temp;
        }
      }
    }
    System.out.println(m[m.length/2]);
  }
  public static void shuffle(boolean[] lockersOpen, int start){
    int nextLocker = start;
    for (int a = start - 1; a < lockersOpen.length; a += nextLocker){
      lockersOpen[a] = !lockersOpen[a];
    }
  }
  public static void display(boolean[] lockers){
    int lockerCount = 0;
    for (int b = 0; b < lockers.length; b++) {
      if (lockers[b]) {
        System.out.print((b + 1) + " ");
        lockerCount++;
        if (lockerCount % 10 == 0)
            System.out.println("");
      }
    }
  }
}
