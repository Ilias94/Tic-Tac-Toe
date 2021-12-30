// write your answer here 

import java.util.Scanner;

class Task {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i && counter < n; j++) {
                System.out.print(i + " ");
                counter++;
            }
        }
    }
}
