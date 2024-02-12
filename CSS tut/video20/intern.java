import java.util.Scanner;
public class intern {
    public static void firstsmsecondsm(float[] arr){
        int index=0;
        int i=0;
        int j=1;
        while(i<2){
            float small = arr[0];
            while(j<arr.length){
                if(arr[j]<small){
                    small = arr[j];
                    index = j;
                 }
                 j++;
            }
            arr[index] = Float.MAX_VALUE;
            System.err.print(small + " ");
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        float arr[] = new float[5];
        int i=0;
        while (i<5) {
            arr[i] = sc.nextFloat();
            i++;
        }
        firstsmsecondsm(arr);
    }
}
