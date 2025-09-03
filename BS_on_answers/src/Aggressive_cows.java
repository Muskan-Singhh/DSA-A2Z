/*                             *********************** Aggressive Cows ******************
Problem Statement: You are given an array 'arr' of size 'n' which denotes the position of stalls.
You are also given an integer 'k' which denotes the number of aggressive cows.
You are given the task of assigning stalls to 'k' cows such that the minimum distance between any two of them is the maximum possible.
Find the maximum possible minimum distance.

Example 1:
Input Format: N = 6, k = 4, arr[] = {0,3,4,7,10,9}
Result: 3
Explanation: The maximum possible minimum distance between any two cows will be 3 when 4 cows are placed at positions {0, 3, 7, 10}.
Here the distances between cows are 3, 4, and 3 respectively.
We cannot make the minimum distance greater than 3 in any ways.

Example 2:
Input Format: N = 5, k = 2, arr[] = {4,2,1,3,6}
Result: 5
Explanation: The maximum possible minimum distance between any two cows will be 5 when 2 cows are placed at positions {1, 6}.
 */
import java.util.Arrays;

public class Aggressive_cows {
    static boolean canPlace(int[] arr, int cows, int d)
    {
        int cnt = 1, last = arr[0];
        for(int i = 1;i< arr.length;i++)
        {
            if(arr[i] - last >= d){
                cnt++;
                last = arr[i];
            }
             if(cnt >= cows)
                 return true;
        }
        return false;
    }
/*        ****************************  BRUTE-FORCE APPROACH *************************************
    static int func(int[] arr, int cows)
    {
        Arrays.sort(arr);
        int n = arr.length-1;
        int limit = arr[n] - arr[0];
        for(int i = 1;i <= limit;i++)
        {
            if(!canPlace(arr, cows,i))
                return (i - 1);
        }
        return limit;
    }
 */
    static int func(int[] arr, int cows) {
        Arrays.sort(arr);
        int n = arr.length - 1;
        int low = 1;
        int high = arr[n] - arr[0];
        while(low <= high)
        {
            int mid = low+(high-low) / 2;
            if(canPlace(arr,cows,mid))
                low = mid+1;
            else
                high = mid-1;
        }
        return high;
    }
    public static void main(String[] args) {
        int[] stalls = {0,3,4,7,10,9};
        int cows = 4;
        System.out.println(func(stalls,cows));
    }
}
