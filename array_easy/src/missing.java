import java.util.Scanner;

public class missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array : ");
        int[] arr = new int[n];
        for (int i = 0;i<n-1;i++) {
            arr[i] = sc.nextInt();
        }
//        ************************SUMMATION APPROACH******************
//        int sum = (n * (n+1)) / 2;
//        int sum2 = 0;
//        for(int i = 0 ; i<n-1;i++)
//        {
//            sum2 += arr[i];
//        }
//        System.out.println(sum-sum2);


//        ***********************XOR APPROACH********************************
        int xor1 = 0, xor2 = 0;
        for(int i = 1;i<=n;i++)
        {
            xor1 = xor1^i;
        }
        for (int i = 0;i<n-1;i++)
        {
            xor2 ^= arr[i];
        }
        System.out.println(xor1^xor2);
    }
}
