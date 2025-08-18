import java.util.Scanner;

public class Move_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array : ");
        int[] arr = new int[n];
        for (int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        for(int i = 0;i<n;i++)
        {
            if(arr[i] != 0)
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
//        while (j<n)
//        {
//            arr[j]=0;
//            j++;
//        }
        for (int i = 0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
