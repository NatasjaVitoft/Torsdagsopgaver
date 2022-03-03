import java.util.Arrays;

class TaskThree {

public static void main(String[] args) {

  int[] myArray = { 1, 6423, 64, 6, 3, 123, 61, 6, 36, 1236, 347, 3, 1326, 246, 4 };

  System.out.printf("Original Array : %s", Arrays.toString(myArray));

  Arrays.sort(myArray);

  System.out.printf("\n\nSorted Array : %s", Arrays.toString(myArray));

}

}
