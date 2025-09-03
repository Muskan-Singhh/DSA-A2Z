/*                                        ************* Capacity to Ship Packages within D Days *****************
Problem Statement: You are the owner of a Shipment company.
You use conveyor belts to ship packages from one port to another.
The packages must be shipped within 'd' days.
The weights of the packages are given in an array 'of weights'.
The packages are loaded on the conveyor belts every day in the same order as they appear in the array.
The loaded weights must not exceed the maximum weight capacity of the ship.
Find out the least-weight capacity so that you can ship all the packages within 'd' days.

Example 1:
Input Format: N = 5, weights[] = {5,4,5,2,3,4,5,6}, d = 5
Result: 9
Explanation: If the ship capacity is 9, the shipment will be done in the following manner:
Day             Weights               Total
1        -       5, 4          -        9
2        -       5, 2          -        7
3        -       3, 4          -        7
4        -       5             -        5
5        -       6             -        6
So, the least capacity should be 9.

Example 2:

Input Format: N = 10, weights[] = {1,2,3,4,5,6,7,8,9,10}, d = 1
Result: 55
Explanation: We have to ship all the goods in a single day.
So, the weight capacity should be the summation of all the weights i.e. 55. */

public class capacity {
    static int find_days(int[] weights, int capacity) {
        int n = weights.length;
        int day = 1, load = 0;
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > capacity) {
                day++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return day;
    }

    //            ****************************  BRUTE-FORCE APPROACH *************************************
//    static int find_capacity(int[] weights, int d)
//    {
//        int n = weights.length;
//        int sum = 0, max_i = Integer.MIN_VALUE;
//        for (int j : weights) {
//            max_i = Math.max(max_i, j);
//            sum += j;
//        }
//        for (int i = max_i;i<=sum;i++)
//        {
//
//            if(find_days(weights,i) <= d)
//                return i;
//        }
//        return -1;
//    }
//     ****************************  OPTIMAL APPROACH *************************************
    static int find_capacity(int[] weights, int d) {
        int n = weights.length;
        int sum = 0, max_i = Integer.MIN_VALUE;
        for (int j : weights) {
            max_i = Math.max(max_i, j);
            sum += j;
        }
        int low = max_i, high = sum;
        while (low <= high)
        {
            int mid = low+(high-low)/2;
            if(find_days(weights,mid) > d)
                low = mid+1;
            else
                high = mid-1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        System.out.println(find_capacity(weights, d));
    }
}

