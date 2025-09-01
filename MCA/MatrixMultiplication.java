import java.util.*;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of rows for Matrix A: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        int colsA = sc.nextInt();
        System.out.print("Enter number of rows for Matrix B: ");
        int rowsB=sc.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        int colsB=sc.nextInt();


        if(colsA!=rowsB){
          System.out.println("Matrix multiplication not possible because columns of A != rows of B.");
          sc.close();
          return;
        }


        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("Enter values for Matrix A:");
        for(int i = 0; i < rowsA; i++){
            System.out.print("Row " + (i + 1) + ": ");
            for(int j = 0; j < colsA; j++){
                matrixA[i][j] = sc.nextInt();
            }
        }

        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("Enter values for Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }


        int[][] product = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    product[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
