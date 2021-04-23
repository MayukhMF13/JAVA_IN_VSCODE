import java.util.Scanner;
public class sort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = 10;
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i ++) {
            arr[i] = in.nextInt();            
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-1; j++){
                if(arr[j] < arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        in.close();
        System.out.println("Sorted Array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}