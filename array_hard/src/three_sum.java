import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class three_sum {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array : ");
//        int n = sc.nextInt();
//        System.out.println("Enter the elements of array");
//        int[] arr = new int[n];
//        for (int i = 0;i<n;i++)
//        {
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {-1,0,1,2,-1,-4};
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int left,right,sum;
        for(int i = 0;i<n-2;i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            left = i + 1;
            right = n - 1;
            while (left < right) {
                sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    res.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                    while (left < right && arr[left] == arr[left - 1])
                        left++;
                    while (left < right && arr[right] == arr[right + 1])
                        right--;
                } else if (sum > 0)
                    right--;
                else
                    left++;


            }
        }
        System.out.println(res);
    }
}
