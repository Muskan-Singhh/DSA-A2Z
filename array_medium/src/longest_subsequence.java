import java.util.Arrays;
import java.util.Scanner;

public class longest_subsequence {
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
        Arrays.sort(arr);
        int c = 1, max = Integer.MIN_VALUE;
        for(int i = 0;i<n-1;i++)
        {
            if(arr[i+1] == arr[i]+1)
            {
                c++;
                max = Math.max(c,max);
            }
            else{
                c=1;
            }



        }
        System.out.println("Longest Subsequence = "+max);
    }
}
