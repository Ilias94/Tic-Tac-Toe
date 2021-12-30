// write your answer here 

import java.util.Scanner;

class Task {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int maximum = 0;
        while (scanner.hasNext()) {
            int mumber = scanner.nextInt();
            if (isDivisibleBy4(mumber) && mumber > maximum) {
                maximum = mumber;
            }
        }
        System.out.println(maximum);
    }

    private static boolean isDivisibleBy4(int mumber) {
        return mumber % 4 == 0;
    }
}
