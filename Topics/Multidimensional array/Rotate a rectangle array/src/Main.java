import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] table = new int[n][m];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = scanner.nextInt();
            }
        }

        int[][] rotateTable = new int[m][n];
        for (int col = 0; col < rotateTable.length; col++) {
            for (int row = n - 1; row >= 0; row--) {
                System.out.print(table[row][col] + " ");
            }
            System.out.println();
        }
    }
}