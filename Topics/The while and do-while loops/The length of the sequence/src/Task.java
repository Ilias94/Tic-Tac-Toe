// write your answer here 

import java.util.Scanner;

class Task {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sequenceLength = 0;
        while (scanner.nextInt() != 0) {
            sequenceLength++;
        }
        System.out.println(sequenceLength);
    }
}
