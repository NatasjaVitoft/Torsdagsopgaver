// TaskOne

class TaskOne {


public static void main(String[] args) {
  boolean unsorted = true;
  int [] numbers =  {8, 9, 1, 5, 11, 13, 7, 4, 6, 3, 12, 10, 2};
  int l;


  while (unsorted) {
    l = sortMethod(numbers);
    if(l==numbers.length-1) {
      unsorted = false;
    }
  }

  for (int element: numbers) {
    System.out.println(element);
  }
}


public static int sortMethod(int [] numbers) {
  int k = 0;
  for (int i = 0; i < numbers.length-1; i++) {
    if(numbers[i] > numbers[i+1]) {
      int a = numbers[i];
      numbers[i] = numbers[i+1];
      numbers[i+1] = a;
    }
    else {
      k = k+1;
    }
  }
  return k;
}
}
