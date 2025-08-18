import java.util.Scanner;

public class appear_once {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array : ");
        int[] arr = new int[n];
        for (int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int xor = 0;
        for (int i = 0;i<n;i++)
        {
            xor ^= arr[i];
        }
        System.out.println("Number appearing once : "+xor);
    }
}
