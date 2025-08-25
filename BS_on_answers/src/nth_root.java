/*               ***************** Nth Root of a Number using Binary Search ************************

Problem Statement: Given two numbers N and M, find the Nth root of M.
The nth root of a number M is defined as a number X when raised to the power N equals M.
If the 'nth root is not an integer, return -1.

Example 1: Input Format: N = 3, M = 27
Result: 3
Explanation: The cube root of 27 is equal to 3.

Example 2: Input Format: N = 4, M = 69
Result: -1
Explanation: The 4th root of 69 does not exist. So, the answer is -1.

 */
public class nth_root {

    static long power(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= mid;
            if (ans > m)  // prevent unnecessary overflow
                return ans;
        }
        return ans;
    }

    static int root(int n, int m) {
        int low = 1, high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long val = power(mid, n, m);

            if (val == m)   // found exact root
                return mid;
            else if (val < m)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;  // no integer root found
    }
    public static void main(String[] args) {
        int m = 216;
        int n = 3;
        int ans = root(n,m);
        System.out.println(ans);
    }
}
