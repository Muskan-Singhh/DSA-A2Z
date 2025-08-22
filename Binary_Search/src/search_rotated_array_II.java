//Problem Statement: Given an integer array arr of size N, sorted in ascending order (may contain duplicate values)
//and a target value k. Now the array is rotated at some pivot point unknown to you.
// Return True if k is present and otherwise, return False.
//
//Examples
//
//Example 1:
//Input Format: arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 3
//Result: True
//Explanation: The element 3 is present in the array. So, the answer is True.
//
//Example 2:
//Input Format: arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 10
//Result: False
//Explanation: The element 10 is not present in the array. So, the answer is False.

public class search_rotated_array_II {
    static boolean func(int[] arr, int target)
    {

        int low = 0 , high = arr.length-1;
        while (low <= high)
        {
            int mid = low+(high-low) / 2;
            if(arr[mid] == target)
            {
                return true;
            }
            if(arr[low] == arr[mid] && arr[mid] == arr[high])
            {
                low++;
                high--;
                continue;
            }
             if (arr[low] <= arr[mid]) {                     //if left part is sorted
                if(arr[low] <= target && target <= arr[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }
            else {                                        //if right part is sorted
                if(arr[mid] <= target && target <= arr[high])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int target = 4;
        boolean ans = func(arr,target);
        System.out.println(ans);
    }
}
