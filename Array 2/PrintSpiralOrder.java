import java.util.Scanner;

public class PrintSpiralOrder {

    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void printSpiralOrder(int[][] matrix, int r, int c){
        int topRow = 0;
        int bottomRow = r - 1;
        int leftCol = 0;
        int rightCol = c - 1;

        int totalElements = 0;

        while(totalElements < r * c){
            // top row
            for(int i = leftCol; i <= rightCol && totalElements < r * c; i++){
                System.out.print(matrix[topRow][i] + " ");
                totalElements++;
            }
            topRow++;

            // right col
            for(int i = topRow; i <= bottomRow && totalElements < r * c; i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            // bottom row
            for(int i = rightCol; i >= leftCol && totalElements < r * c; i--){
                System.out.print(matrix[bottomRow][i] + " ");
                totalElements++;
            }
            bottomRow--;

            // left col
            for(int i = bottomRow; i >= topRow && totalElements < r * c; i--){
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter the elements of the matrix");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Spiral Order");
        printSpiralOrder(matrix, r, c);
        sc.close();
    }    
}
