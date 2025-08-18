import java.util.Scanner;

public class sort_012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array : ");
        int[] arr = new int[n];
        for (int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int low = 0,mid=0,high = n-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else {
                
            }
        }
    }
}
