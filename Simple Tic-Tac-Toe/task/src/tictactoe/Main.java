package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] gameGrid = new char[3][3];
        for (int i = 0; i < gameGrid.length; i++) {
            for (int j = 0; j < gameGrid[i].length; j++) {
                gameGrid[i][j] = ' ';
            }
        }

        displayGameGrid(gameGrid);
        int row;
        int column;
        int XorO = 2;
        do {
            System.out.println("Enter the coordinates:");
            String inputCoordinates = scanner.nextLine();
            try {
                String[] pieces = inputCoordinates.split(" ");
                row = Integer.parseInt(pieces[0]);
                column = Integer.parseInt(pieces[1]);

            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
                continue;
            }
            if (row > 3 || row < 1 || column > 3 || column < 1) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }
            if (gameGrid[row - 1][column - 1] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            } else {
                if (XorO % 2 == 0) {
                    gameGrid[row - 1][column - 1] = 'X';
                    XorO++;
                    displayGameGrid(gameGrid);
                } else {
                    gameGrid[row - 1][column - 1] = 'O';
                    XorO++;
                    displayGameGrid(gameGrid);
                }
                if (isWinner('X', gameGrid)) {
                    System.out.println("X wins");
                    break;
                } else if (isWinner('O', gameGrid)) {
                    System.out.println("O wins");
                    break;
                } else if (!contains_(gameGrid)) {
                    System.out.println("Draw");
                    break;
                }
            }
        } while (true);
    }

    private static boolean contains_(char[][] gameGird) {
        for (int i = 0; i < gameGird.length; i++) {
            for (int j = 0; j < gameGird[i].length; j++) {
                if (gameGird[i][j] == ' ') {
                    return true;
                }
            }
        }
        return false;
    }

    private static void displayGameGrid(char[][] gameGrid) {
        System.out.println("---------");
        System.out.println("| " + gameGrid[0][0] + " " + gameGrid[0][1] + " " + gameGrid[0][2] + " |");
        System.out.println("| " + gameGrid[1][0] + " " + gameGrid[1][1] + " " + gameGrid[1][2] + " |");
        System.out.println("| " + gameGrid[2][0] + " " + gameGrid[2][1] + " " + gameGrid[2][2] + " |");
        System.out.println("---------");
    }


    public static boolean isWinner(char player, char[][] gameGrid) {
        if (isFirstRow(player, gameGrid)) {
            return true;
        } else if (isSecondRow(player, gameGrid)) {
            return true;
        } else if (isThirdRow(player, gameGrid)) {
            return true;
        } else if (isFirstColumn(player, gameGrid)) {
            return true;
        } else if (isSecondColumn(player, gameGrid)) {
            return true;
        } else if (isThirdColumn(player, gameGrid)) {
            return true;
        } else if (isFirstDiagonal(player, gameGrid)) {
            return true;
        } else if (isSecondDiagonal(player, gameGrid)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isSecondDiagonal(char player, char[][] gameGrid) {
        return gameGrid[2][0] == player && gameGrid[1][1] == player && gameGrid[0][2] == player;
    }

    private static boolean isFirstDiagonal(char player, char[][] gameGrid) {
        return gameGrid[0][0] == player && gameGrid[1][1] == player && gameGrid[2][2] == player;
    }

    private static boolean isThirdColumn(char player, char[][] gameGrid) {
        return gameGrid[0][2] == player && gameGrid[1][2] == player && gameGrid[2][2] == player;
    }

    private static boolean isSecondColumn(char player, char[][] gameGrid) {
        return gameGrid[0][1] == player && gameGrid[1][1] == player && gameGrid[2][1] == player;
    }

    private static boolean isFirstColumn(char player, char[][] gameGrid) {
        return gameGrid[0][0] == player && gameGrid[1][0] == player && gameGrid[2][0] == player;
    }

    private static boolean isThirdRow(char player, char[][] gameGrid) {
        return gameGrid[2][0] == player && gameGrid[2][1] == player && gameGrid[2][2] == player;
    }

    private static boolean isSecondRow(char player, char[][] gameGrid) {
        return gameGrid[1][0] == player && gameGrid[1][1] == player && gameGrid[1][2] == player;
    }

    private static boolean isFirstRow(char player, char[][] gameGrid) {
        return gameGrid[0][0] == player && gameGrid[0][1] == player && gameGrid[0][2] == player;
    }
}
