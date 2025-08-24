//QUESTION : Minimum in Rotated Sorted Array

//Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values).
//Now the array is rotated between 1 to N times which is unknown. Find the minimum element in the array.

//Example 1:
//Input Format: arr = [4,5,6,7,0,1,2,3]
//Result: 0
//Explanation: Here, the element 0 is the minimum element in the array.

// Example 2:
//Input Format: arr = [3,4,5,1,2]
//Result: 1
//Explanation: Here, the element 1 is the minimum element in the array.

public class min_rotated_array {
    static int func(int[] arr)
    {
        int minValue = Integer.MAX_VALUE;
        int low = 0 , high = arr.length-1;
        while (low <= high)
        {
            int mid = low+(high-low) / 2;



            if (arr[low] <= arr[high]) {                                  //search space is already sorted
                minValue = Math.min(minValue, arr[low]);                  //then arr[low] will always be
                break;                                                    //the minimum in that search space

            }
            if (arr[low] <= arr[mid]) {                      //if left part is sorted
                minValue = Math.min(minValue,arr[low]);      // select leftmost element of this half as minimum &
                low = mid+1;                                 // eliminate left half
            }
            else {                                         //if right part is sorted
                minValue = Math.min(minValue,arr[mid]);    // select leftmost element of this half as minimum &
                high = mid-1;                              // eliminate right half

            }
        }
        return minValue;

    }
    public static void main(String[] args) {
        int[] arr = {7, 8,9, 2, 3, 4};

        int ans = func(arr);
        System.out.println(ans);
    }
}
