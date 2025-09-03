/*                                           ************** Kth Missing Positive Number ****************
Problem Statement: You are given a strictly increasing array ‘vec’ and a positive integer 'k'.
Find the 'kth' positive integer missing from 'vec'.

Example 1:
Input Format: vec[]={4,7,9,10}, k = 1
Result: 1
Explanation: The missing numbers are 1, 2, 3, 5, 6, 8, 11, 12, ……, and so on.
Since 'k' is 1, the first missing element is 1.

Example 2:
Input Format: vec[]={4,7,9,10}, k = 4
Result: 5
Explanation: The missing numbers are 1, 2, 3, 5, 6, 8, 11, 12, ……, and so on.
Since 'k' is 4, the fourth missing element is 5. */


public class Kth_missing_positve {
/*        ****************************  BRUTE-FORCE APPROACH *************************************
    static int func(int[] vec, int k)
    {
        for(int i=0;i< vec.length;i++)
        {
            if(vec[i] <= k)
                k++;
            else
                break;
        }
        return k;
    } */
//           ****************************  OPTIMAL APPROACH *************************************
    static int func(int[] vec, int k) {
        int low = 0 , high = vec.length-1;
        int mid, missing;
        while(low <= high)
        {
            mid = low+(high-low)/2;
            missing = vec[mid] - (mid + 1);
            if(missing < k)
                low = mid+1;
            else
                high = mid-1;
        }
        return low+k;
    }
    public static void main(String[] args)
    {
        int[] vec={2,3,4,7,11};
        int k = 5;
        System.out.println(func(vec,k));

    }
}
