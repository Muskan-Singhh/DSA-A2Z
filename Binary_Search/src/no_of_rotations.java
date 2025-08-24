//Find out how many times the array has been rotated

//Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values).
// Now the array is rotated between 1 to N times which is unknown. Find how many times the array has been rotated.

//Example 1:
//Input Format: arr = [4,5,6,7,0,1,2,3]
//Result: 4
//Explanation: The original array should be [0,1,2,3,4,5,6,7]. So, we can notice that the array has been rotated 4 times.

//Example 2:
//Input Format: arr = [3,4,5,1,2]
//Result: 3
//Explanation: The original array should be [1,2,3,4,5]. So, we can notice that the array has been rotated 3 times.

public class no_of_rotations {
    static int func(int[] arr)
    {
        int ans = Integer.MAX_VALUE;
        int index = -1;
        int low = 0 , high = arr.length-1;
        while (low <= high)
        {
            int mid = low+(high-low) / 2;
            if (arr[low] <= arr[high])
            {
                if(arr[low] < ans)
                {
                    ans = arr[low];
                    index = low;

                }
                break;
            }

            if (arr[low] <= arr[mid]) {
                if(arr[low] < ans)
                {
                    ans = arr[low];
                    index = low;

                }
                low = mid +1;
            }
            else {
                if(arr[mid] < ans)
                {
                    ans = arr[mid];
                    index = mid;
                }

                high = mid-1;

            }



        }
       return index;
    }
    public static void main(String[] args) {
        int[] arr = {7, 8,9, 2, 3, 4};

        int ans = func(arr);
        System.out.println(ans);
    }
}
