import java.util.Scanner;

public class Transpose{

    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int[][] a, int r, int c){
        int[][] ans = new int[c][r];

        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
                ans[i][j] = a[j][i];
            }
        }
        return ans;
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

        int ans[][] = findTranspose(a, r, c);
        printMatrix(ans);

        sc.close();
    }
}