public class lower_bound {
    static int l_Bound(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length-1;

        while(low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if (target > arr[mid]) {
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
        int target = 13;
        int ans = l_Bound(arr,target);
        System.out.println(ans);
    }
}
