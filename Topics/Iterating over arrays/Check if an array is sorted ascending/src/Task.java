// write your answer here 

import java.util.Arrays;
import java.util.Scanner;

class Task {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int[] copyArray = array.clone();
        Arrays.sort(copyArray);

        System.out.println(Arrays.equals(array, copyArray));
    }
}
