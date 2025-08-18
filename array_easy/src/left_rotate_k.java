import java.util.Scanner;

public class left_rotate_k {
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
        System.out.println("Enter by how many places you want to rotate");
        int d = sc.nextInt();
        rotate(arr,n,d);
        for (int k = 0;k<n;k++)
        {
            System.out.print(arr[k]+ " ");
        }

    }
    static void rotate(int[] arr, int n, int d)
    {
        rev(arr,0,d-1);
        rev(arr , d, n-1);
        rev(arr, 0, n-1);
    }
    static void rev(int[] arr, int s, int e)
    {
        while (s<e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
