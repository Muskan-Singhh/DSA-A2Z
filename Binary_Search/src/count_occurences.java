// Approach used in this problem is :

//         Total number of occurrences = last occurrence - first occurrence + 1


// Find first occurence and last occurence(Code available) separately and apply the formula


public class count_occurences {
    static int first_occ(int[] arr, int target)
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
                high = mid-1;
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
    static int last_occ(int[] arr, int target)
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
        int[] arr = {3,4,13,13,13,13,13,20,20};
        int target = 20;
        int first = first_occ(arr,target);
        int last = last_occ(arr,target);
        int ans = last - first +1;
        System.out.println(ans);
    }
}
