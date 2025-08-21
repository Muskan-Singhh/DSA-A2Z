import java.util.ArrayList;

public class floor_ceil {
    static ArrayList<Integer> floor_and_ceil(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int floor = -1, ceil = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                floor = arr[mid];
                ceil = arr[mid];
                break;  // exact match, stop searching
            }
            else if (arr[mid] < target) {
                floor = arr[mid];   // possible floor
                low = mid + 1;
            }
            else {
                ceil = arr[mid];    // possible ceil
                high = mid - 1;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(floor);
        ans.add(ceil);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,4,7,8,10};
        int target = 5;
        System.out.println(floor_and_ceil(arr,target));
    }
}
