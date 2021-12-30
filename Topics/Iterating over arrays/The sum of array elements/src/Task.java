// write your answer here 

import java.util.Scanner;

class Task {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int number : array) {
            sum += number;
        }
        System.out.println(sum);
    }
}
