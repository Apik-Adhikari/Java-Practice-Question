import java.util.Scanner;

public class Multiplication{
    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiplicationOfTwoMatrix(int a[][], int r1, int c1, int b[][], int r2, int c2){
        if(c1!= r2){
            System.out.println("Multiplication not possible, Wrong Dimensional");
            return;
        }

        int[][] mul = new int[r1][c2];

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                for(int k = 0; k < c1; k++){
                    mul[i][j] += a[i][k] * b[k][j];
                }         
            }
        }
           printMatrix(mul);
    }
        
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For first matrix:");
        System.out.println("Enter the number of rows");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of columns");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("For second matrix:");
        System.out.println("Enter the number of rows");
        int r2 = sc.nextInt();
        System.out.println("Enter the number of columns");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];

        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                b[i][j] = sc.nextInt();
            }
        }

        multiplicationOfTwoMatrix(a, r1, c1, b, c1, c2);

        sc.close();
    }
}