// Sorting

/*
int arr = [6,3,5,8,3,1,7];
sortedarr <- [1,3,3,5,6,7,8]
*/

public static void bubbleSort(int[] array) {
    boolean sorted = false;
    int temp;
    while(!sorted) {
        sorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (a[i] > a[i+1]) {
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                sorted = false;
            }
        }
    }
}


// 2 for loops, i which starts from 0 to length, the other starting from i to length.





/*
Big O Notation

We are interested in how quickly an algorithm runs relative to the input of the problem.
Generally, we think of N as the input size (a list with N elements), but N could be the actual
input (such as when calculating the Nth term of a series, or the Nth prime.)

We do not care about an exact number of seconds. Instead, think along the lines:
"How MUCH LONGER does it take when we double N? And when we double N again?"

If the time stays the same, we say it runs in constant time.


If the time increases by a constant factor (double triple or something similar),
we say it runs in linear time. The constant (slope of the line) is not important.


We care about very large input sizes, we want to know how the algorithm behaves
as N gets "arbitrarily large."


O(n) <- linear time
O(n^2) <- quadratic
*/


// Constant time O(1)
public int foo(int [] ary){
    return ary[0];
}

// ary <= [1,2,3,4,5]
// for (int i : ary), i takes on the values of the ary.
// Linear time O(n)
public int foo2(int [] ary){
    int total = 0;
    for( int i : ary){
      total += i;
    }
    return total;
}

//quadratic time O(n^2)
public int foo3(int [] ary){
    int total = 0;
    for( int i = 0; i < ary.length - 1; i++){
        for( int j = 0 ; j < ary.length; j++){
          total+=i+j+5;
        }
    }
    return total;
}


// qudartic time O(n^2)
// (n -1) + (n-2) + ... (1)  <- (n-1)(n)/2 <- (n^2 - n )/ 2

public int foo4(int [] ary){
    int total = 0;
    for( int i = 0; i < ary.length - 1; i++){
        for( int j = i+1 ; j < ary.length; j++){
          total+=i+j+5;
        }
    }
    return total;
}


// linear time O(n)
public int foo4(int [] ary){
    int total = 0;
    for( int i : ary){
      total += i;
    }
    for( int i : ary){
      total += i;
    }
    return total;
}

/*
These are all O(N)
2N+5
3N+200
N + 10000


Similarly:
4N^2
N^2 + 5N
2N^2 + 10N + 20
Are all considered to be just O(N^2)


Worst Case:
Sometimes the algorithms we write can stop early. This is great!
 Except we tend to consider the worst case scenario.


*/
// if length is 8 -> 3 tiems
// if length is 16 -> 4 times
// O(log n)
public static function1(int[]a){
    index = a.length() - 1;
    while(index > 0){
        System.out.println(a[index]);
        index = a.length/2;
    }
}



public static void printAllNumbersThenAllPairSums(int[] numbers) {

  System.out.println("these are the numbers:");
  for (int number : numbers) {
      System.out.println(number);
  }

  System.out.println("and these are their sums:");
  for (int firstNumber : numbers) {
      for (int secondNumber : numbers) {
          System.out.println(firstNumber + secondNumber);
      }
  }

}


public static boolean contains(int[] haystack, int needle) {

  // does the haystack contain the needle?
  for (int n : haystack) {
      if (n == needle) {
          return true;
      }
  }

  return false;
}



public int Fibonacci(int number)
{
    if (number <= 1) return number;
    return Fibonacci(number - 2) + Fibonacci(number - 1);
}


for (int i = 1; i <= n; i++){
    for(int j = 1; j < n; j = j * 2) {
        System.out.println("Hey - I'm busy looking at: " + i + " and " + j + " 2.");
    }
}
