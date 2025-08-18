
import java.util.Scanner;

public class duplicates_removal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array in sorted order : ");
        int[] arr = new int[n];
        for (int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        remove_duplicates(arr,n);
    }
    static void remove_duplicates(int[] arr, int n)
    {
        int i=0,j=0;
        while (j<n)
        {
            if(arr[i] != arr[j])
            {
                i+=1;
                arr[i] = arr[j];
            }
            j+=1;
        }
        for (int k = 0;k<=i;k++)
        {
            System.out.println(arr[k]);
        }
    }
}
