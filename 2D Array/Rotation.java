import java.util.Scanner;

public class Rotation{

    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int[][] matrix, int r, int c){
        int[][] ans = new int[c][r];

        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    static void reverseArray(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static int[][] rotate(int[][] matrix, int n){
        matrix = findTranspose(matrix, n, n);
    
        for(int i = 0; i < n; i++){
            reverseArray(matrix[i]);
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns");
        int c = sc.nextInt();
        int[][] a = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix");
        printMatrix(a);

        a = rotate(a, r);

        System.out.println("Rotation of matrix");
        printMatrix(a);

        sc.close();
    }
}