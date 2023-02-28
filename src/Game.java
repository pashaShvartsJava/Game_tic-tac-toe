import java.util.Scanner;

public class Game {
    public static final String X = "x";
    public static final String O = "o";
    public static String[][] field = {{".", ".", "."},
            {".", ".", "."},
            {".", ".", "."}};


    public static void playing() {
        System.out.println("Game started!");
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (true) {
            String exception = "This cell is already taken!";
            int numberLine = scanner.nextInt();
            int numColumn = scanner.nextInt();
            i++;
            if (i % 2 != 0) {
                try {
                    if (field[numberLine][numColumn].equals(".")) {
                        field[numberLine][numColumn] = O;
                    } else {
                        throw new CellException(exception);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    i--;
                    System.out.println("You entered incorrect number " + e);
                } catch (CellException e) {
                    i--;
                    System.out.println("Change the cell! " + e);
                }
                for (String[] strings : field) {
                    for (String string : strings) {
                        System.out.print(string + " ");
                    }
                    System.out.println();
                }
            } else {
                try {
                    if (field[numberLine][numColumn].equals(".")) {
                        field[numberLine][numColumn] = X;
                    } else {
                        throw new CellException(exception);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    i--;
                    System.out.println("You entered incorrect number " + e);
                } catch (CellException e) {
                    i--;
                    System.out.println("Change the cell! " + e);
                }
                for (String[] strings : field) {
                    for (String string : strings) {
                        System.out.print(string + " ");
                    }
                    System.out.println();
                }
            }
            if ((field[0][0].equals(O) && field[0][1].equals(O) && field[0][2].equals(O)) ||
                    (field[0][0].equals(O) && field[1][0].equals(O) && field[2][0].equals(O)) ||
                    (field[0][2].equals(O) && field[1][2].equals(O) && field[2][2].equals(O)) ||
                    (field[2][0].equals(O) && field[2][1].equals(O) && field[2][2].equals(O)) ||
                    (field[0][0].equals(O) && field[1][1].equals(O) && field[2][2].equals(O)) ||
                    (field[2][0].equals(O) && field[1][1].equals(O) && field[0][2].equals(O)) ||
                    (field[0][1].equals(O) && field[1][1].equals(O) && field[2][1].equals(O)) ||
                    (field[1][0].equals(O) && field[1][1].equals(O) && field[1][2].equals(O))) {
                for (String[] strings : field) {
                    for (String string : strings) {
                        System.out.print(string + " ");
                    }
                    System.out.println();
                }
                System.out.println("The first player won!");
                break;
            }
            if ((field[0][0].equals(X) && field[0][1].equals(X) && field[0][2].equals(X)) ||
                    (field[0][0].equals(X) && field[1][0].equals(X) && field[2][0].equals(X)) ||
                    (field[0][2].equals(X) && field[1][2].equals(X) && field[2][2].equals(X)) ||
                    (field[2][0].equals(X) && field[2][1].equals(X) && field[2][2].equals(X)) ||
                    (field[0][0].equals(X) && field[1][1].equals(X) && field[2][2].equals(X)) ||
                    (field[2][0].equals(X) && field[1][1].equals(X) && field[0][2].equals(X)) ||
                    (field[0][1].equals(X) && field[1][1].equals(X) && field[2][1].equals(X)) ||
                    (field[1][0].equals(X) && field[1][1].equals(X) && field[1][2].equals(X))) {
                for (String[] strings : field) {
                    for (String string : strings) {
                        System.out.print(string + " ");
                    }
                    System.out.println();
                }
                System.out.println("The second player won!");
                break;
            }
        }
    }
}
