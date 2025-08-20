public class upper_bound {
    static int u_Bound(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length-1;

        while(low <= high)
        {
            int mid = (low+high)/2;
            if (target >= arr[mid]) {
                low = mid+1;              // Search in right half
            }
            else {
                high = mid-1;             // Search in left half
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,8,10,12};
        int target = 12;
        int ans = u_Bound(arr,target);
        System.out.println(ans);
    }
}
