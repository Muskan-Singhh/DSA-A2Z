import java.util.Scanner;

public class selction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array : ");
        for (int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int current = 0;
        while (current < n)
        {
            int min = find_min(arr,current,n);
            int temp = arr[current];
            arr[current] = arr[min];
            arr[min] = temp;
            current++;
        }
        for (int i = 0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    static int find_min(int[] arr, int s, int e)
    {
        int m = s;
        for (int i = s+1;i<e;i++)
        {
            if(arr[m]>arr[i])
            {
                m = i;
            }
        }
        return m;
    }
}
