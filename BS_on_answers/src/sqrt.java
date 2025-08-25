/*                              ******* Finding Sqrt of a number using Binary Search *******

Problem Statement: You are given a positive integer n. Your task is to find and return its square root.
If ‘n’ is not a perfect square, then return the floor value of 'sqrt(n)'.

Example 1:
Input Format: n = 36
Result: 6
Explanation: 6 is the square root of 36.

Example 2:
Input Format: n = 28
Result: 5
Explanation: Square root of 28 is approximately 5.292. So, the floor value will be 5. */

public class sqrt {
    static int square_root(int n)
    {
        int low = 1;
        int high = n;
        int ans = 1;
        while(low <= high)
        {
            int mid = low + (high-low)/2;  // To avoid overflow when high and low points to a large value //
            if(mid*mid == n)
                return mid;
            if (mid*mid < n) {
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 144;
        int ans = square_root(n);
        System.out.println(ans);
    }

}
