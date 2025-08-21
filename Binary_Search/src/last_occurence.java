public class last_occurence {
    static int func(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low <= high)
        {
            int mid = low + (high-low)/2;  // To avoid overflow when high and low points to a large value //
            if(arr[mid] == target)
            {
                ans = mid;
                low = mid+1;
            }
            else if (target > arr[mid]) {
                low = mid+1;              // Search in right half
            }
            else {
                high = mid-1;             // Search in left half
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,13,13,13,13,20,20};
        int target = 13;
        System.out.println(func(arr,target));
    }
}
