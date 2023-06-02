import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int MAX_MATRIX_SIZE = 20;
    public static final int MIN_MATRIX_SIZE = 1;
    public static final int RANDOM_MATRIX_MAX_VALUE = 100;


    public static void main(String[] args) {
        String manual = "m", random = "r";
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter matrix dimensions:");
        System.out.println("a:");
        int a = enterMatrixSize(in);
        System.out.println("b:");
        int b = enterMatrixSize(in);
        System.out.println("Please choose type of matrix filling:");
        System.out.println("m - enter manually:");
        System.out.println("r - enter randomly:");
        String fillInMatrix = in.next();
        System.out.println("Matrix:");
        if (fillInMatrix.equals(manual)) {
            printMatrix(fillManual(a, b, in));
        } else if (fillInMatrix.equals(random)) {
            printMatrix(fillRandom(a, b, in));
        } else {
            System.out.println("Wrong choice");
            return;
        }

    }

    public static int enterMatrixSize(Scanner in) {
        int number;
        number = in.nextInt();
        while (number > MAX_MATRIX_SIZE || number < MIN_MATRIX_SIZE) {
            System.out.println("The number you enter must be from " + MIN_MATRIX_SIZE
                    + " and " + MAX_MATRIX_SIZE + "\n Please enter other number: ");
            number = in.nextInt();
        }
        return number;
    }

    public static int[][] fillManual(int height, int width, Scanner in) {
        int[][] matrix = new int[height][width];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] fillRandom(int height, int width, Scanner in) {
        Random random = new Random();
        int[][] matrix = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = random.nextInt(RANDOM_MATRIX_MAX_VALUE - MIN_MATRIX_SIZE + 1) + MIN_MATRIX_SIZE;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        int height = matrix.length;
        int width = matrix[0].length;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Maximum matrix element = " + findMax(matrix));
        System.out.println("Minimum matrix element = " + findMin(matrix));
        System.out.println("Average matrix = " + calculateAverage(matrix));
        System.out.println("Geometric mean = " + calculateGeometricMean(matrix));
    }

    public static int findMax(int[][] matrix) {
        int height = matrix.length;
        int width = matrix[0].length;

        int maxValue = matrix[0][0];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }

    public static int findMin(int[][] matrix) {
        int height = matrix.length;
        int width = matrix[0].length;

        int minValue = matrix[0][0];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                }
            }
        }
        return minValue;
    }

    public static double calculateAverage(int[][] matrix) {
        int height = matrix.length;
        int width = matrix[0].length;

        int sum = 0;
        int count = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sum += matrix[i][j];
                count++;
            }
        }
        return (double) sum / count;
    }

    public static double calculateGeometricMean(int[][] matrix) {
        int height = matrix.length;
        int width = matrix[0].length;

        int multiplication = 1;
        int count = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                multiplication *= matrix[i][j];
                count++;
            }
        }
        return Math.pow(multiplication, 1.0 / count);
    }
}




