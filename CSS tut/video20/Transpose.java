import java.util.Scanner;

public class Transpose {
    public static int[][] transpose(int arr[][], int newarr[][]) {
        for (int i = 0; i < newarr.length; i++) {
            for (int j = 0; j < newarr.length; j++) {
                newarr[j][i] = arr[i][j];
            }
        }
        return newarr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];

        System.out.println("Enter elements for the matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int newarr[][] = new int[3][3];
        transpose(arr, newarr);

        System.out.println("Transposed matrix:");
        for (int i = 0; i < newarr.length; i++) {
            for (int j = 0; j < newarr.length; j++) {
                System.out.print(newarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
