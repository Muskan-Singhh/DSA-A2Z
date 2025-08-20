public class recursive_BS {
    static int binary(int[] arr, int target, int low, int high)
    {
            if(low>high)                         //Base Case
                return -1;

            int mid = (low+high)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if (target > arr[mid]) {
                return binary(arr,target,mid+1,high);              // Search in right half
            }
            else{
                return binary(arr,target,low,mid-1);                    // Search in left half
            }


    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,8,10,12};
        int target = 4;
        int low = 0;
        int high = arr.length-1;
        int ans = binary(arr,target,low,high);
        System.out.println(ans);
    }
}
