import java.util.Scanner;

public class Addition{
    static void additionOfTwoMatrix(int a[][], int r1, int c1, int b[][], int r2, int c2){
        if(c1!= r2){
            System.out.println("Addition not possible, Rows and Column should be equal");
            return;
        }

        int[][] sum = new int[r1][c1];

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        printMatrix(sum);
    }

    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
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
        
        // System.out.println("Matrix 1:");
        // printMatrix(a);
        // System.out.println("Matrix 2:");
        // printMatrix(b);

        additionOfTwoMatrix(a, r1, c1, b, c1, c2);

        sc.close();
    }
}