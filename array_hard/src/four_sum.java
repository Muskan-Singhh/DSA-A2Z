import java.util.*;

public class four_sum {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        int n = arr.length;
        int target = 0;
//        ***************************BRUTE-FORCE*****************************************************************
//        Set<List<Integer>> ans = new HashSet<>();
//        for(int i = 0;i<n-3;i++)
//        {
//            for(int j = i+1;j<n-2;j++)
//            {
//                for(int k = j+1;k<n-1;k++)
//                {
//                    for(int l = k+1;l<n;l++)
//                    {
//                        if(arr[i] + arr[j] + arr[k] + arr[l] == target)
//                        {
//                            List<Integer> res = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
//                            Collections.sort(res);
//                            ans.add(res);
//
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(ans);


//        **********************************OPTIMIZED APPROACH********************************************
        Arrays.sort(arr);
       List<List<Integer>> ans = new ArrayList<>();
        int left,right;
        for(int i = 0;i<n-3;i++)
        {
            if(i>0 && arr[i] == arr[i-1])
                continue;
            for(int j = i+1;j<n-2;j++)
            {
                if(j>i+1 && arr[j] == arr[j-1])
                    continue;

                left = j+1;
                right = n-1;
                while (left < right)
                {
                    if(arr[i] + arr[j] + arr[left] + arr[right] == target)
                    {
                        ans.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                        left++;
                        right--;
                        while (left<right && arr[left] == arr[left-1])
                            left++;
                        while (left<right && arr[right] == arr[right+1])
                            right--;
                    }
                    else if (arr[i] + arr[j] + arr[left] + arr[right] > target)
                    {
                        right--;
                    }
                    else
                        left++;

                }

            }
        }
        System.out.println(ans);
    }
}
