import java.util.Scanner;

public class array_rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        rev(arr,n-1);
    }
    static void rev(int[] arr, int n)
    {
        if(n<0)
            return;
        System.out.print(arr[n]+ " ");
        rev(arr,n-1);
    }
}
