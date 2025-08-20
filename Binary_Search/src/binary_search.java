public class binary_search {

    static int binary(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length-1;

        while(low <= high)
        {
            int mid = low + (high-low)/2;  // To avoid overflow when high and low points to a large value //
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
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,8,10,12};
        int target = 8;
        int ans = binary(arr,target);
        System.out.println(ans);
    }

}
