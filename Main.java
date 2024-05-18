import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int[] sumLine = new int[3];
        int[] sumColumn = new int[3];
        int Line = 0;
        int Column = 0;
        int sumDiagonalLeft = 0;
        int sumDiagonalRight = 0;
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("Введите %d строку \n", i + 1);
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sumLine[i] += matrix[i][j];
            }
        }
        if(sumLine[0] == sumLine[1] && sumLine[2] == sumLine[0]){
            Line = sumLine[0];
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sumColumn[i] += matrix[j][i];
            }
        }
        if(sumColumn[0] == sumColumn[1] && sumColumn[2] == sumColumn[0]){
            Column = sumColumn[0];
        }
        for (int i = 0; i < matrix.length; i++) {
            sumDiagonalLeft += matrix[i][i];
        }
        for (int i = 0; i < matrix.length; i++) {
            sumDiagonalRight += matrix[i][matrix.length - 1 - i];
        }
        if(Line == Column && sumDiagonalLeft == sumDiagonalRight && Column == sumDiagonalRight){
            System.out.println("Это магический квадрат");
        }
        else {
            System.out.println("Это не магический квадрат");
        }
    }
}
