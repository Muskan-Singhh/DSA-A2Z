import java.util.Arrays;

public class mergesorted {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,7};
        int m = 4, n = 5;
        int[] nums2 = {0,2,6,8,9};

        int left = m-1;
        int right = 0;
        int temp;
        while (left >= 0 && right < n)
        {
            if(nums1[left] > nums2[right])
            {
                temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;
                right++;
            }
            else {
                break;
            }
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);



//        int[] nums3 = new int[m+n];
//        int k = 0;
//        while(left < m && right < n)
//        {
//            if(nums1[left] < nums2[right]){
//                nums3[k] =  nums1[left];
//                left++;
//                k++;
//            } else if (nums1[left] > nums2[right]) {
//                nums3[k] = nums2[right];
//                right++;
//                k++;
//            }
//            else {
//                nums3[k] = nums1[left];
//                k++;
//                left++;
//                nums3[k] = nums2[right];
//                right++;
//                k++;
//            }
//        }
//        while (left < m)
//        {
//            nums3[k] = nums1[left];
//            k++;
//            left++;
//        }
//        while (right < n){
//            nums3[k] = nums2[right];
//            right++;
//            k++;
//        }
//        for (int i = 0;i<m;i++)
//        {
//            nums1[i] = nums3[i];
//        }
//        for (int j = 0;j<n;j++)
//        {
//            nums2[j] = nums3[n+j-1];
//
//        }
        for (int i = 0;i< nums1.length;i++)
        {
            System.out.print(nums1[i]+" ");
        }
        System.out.println();
        for (int i = 0;i< nums2.length;i++)
        {
            System.out.print(nums2[i]+" ");
        }
//        int idx = nums1.length-1;
//        while( left >=0 && right >= 0)
//        {
//            if(nums1[left] < nums2[right])
//            {
//                nums1[idx] = nums2[right];
//                idx--;
//                right--;
//            }
//            else if(nums1[left] > nums2[right])
//            {
//                nums1[idx] = nums1[left];
//                left--;
//                idx--;
//            }
//            else{
//                nums1[idx] = nums2[right];
//                right--;
//                idx--;
//            }
//        }
//        while (right >= 0) {
//            nums1[idx] = nums2[right];
//            right--;
//            idx--;
//        }
//        for (int i = 0;i< nums1.length;i++)
//        {
//            System.out.print(nums1[i]+" ");
//        }
    }
}
