import java.util.ArrayList;

public class inversions {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};
        int n = arr.length;


//      ******************************BRUTE-FORCE****************************************
//
//        for(int i=0;i<n-1;i++)
//        {
//            for(int j = i+1;j<n;j++)
//            {
//                if(arr[i] > arr[j])
//                    c++;
//            }
//        }
//

//     ************************OPTIMAL***********************************
        int ans = mergesort(arr,0,n-1);
        System.out.println(ans);

    }
    static int mergesort(int[] arr, int s,int e)
    {
        int c = 0;
        if(s>=e)
            return c;
        int m = (s + e) / 2;
        c += mergesort(arr, s, m);
        c += mergesort(arr, m + 1, e);
        c += merge(arr, s, m, e);
        return c;

    }
    static int merge(int[] arr, int s , int m, int e)
    {
           int left = s;
           int right = m+1;
           int c = 0;
           ArrayList<Integer> temp = new ArrayList<>();
           while(left <= m && right <= e)
           {
               if(arr[left] <= arr[right])
               {
                   temp.add(arr[left] );
                   left++;
               }
               else {

                   temp.add(arr[right] );
                   c += (m-left+1);
                   right++;
               }
           }
           while (left<=m)
           {
               temp.add(arr[left] );
               left++;
           }
           while (right <= e)
           {
               temp.add(arr[right] );
               right++;
           }
            for(int i=s;i<=e;i++)
            {
                arr[i] = temp.get(i-s);
            }
        return c;
    }
}
