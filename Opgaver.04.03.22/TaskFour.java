//TaskFour

import java.util.Random;

class TaskFour {

public static void main(String[] args) {

System.out.println("4.a:");
intMethod(5);
System.out.println("Random number:");
selectRandom();
System.out.println("Recursion:");
takeInt(10);
System.out.println("Fibonacci:");
fib(0, 1);

}

  public static void intMethod(int number) {
    for (int i = 0; i < 100; i++) {
      if (i%number==0) {
        System.out.println(i + " ");
      }
    }
  }

  public static void selectRandom() {
    int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
    Random r = new Random();
    int randomNumber = r.nextInt(arr.length);
    System.out.println(arr[randomNumber]);
  }

  public static void takeInt(int a) {
    for (int i = 0; a > i; a--) {
      if(a == a) {
        System.out.println(a);
      }
      else if (a > i) {
        System.out.println(a-1);
      }
    }
  }

  public static void fib(int a, int b) {
    for (int i = 0; i < 1000; i++) {
      if (a < 10000 && b < 10000) {
        int sum = a+b;
        System.out.println(sum);
        a = b;
        b = sum;
      }
    }
  }
}
