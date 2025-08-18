import java.util.ArrayList;
import java.util.List;

public class set_Mismatch {
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4,6,7,5};
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
//      ******************************BRUTE-FORCE****************************************

//        int c;
//        for(int i = 1;i<=n;i++)
//        {   c = 0;
//            for(int j = 0;j<n;j++)
//            {
//                if( arr[j] == i)
//                {
//                    c+=1;
//                }
//
//            }
//            if(c == 2)
//                ans.add(i );
//            else if (c == 0) {
//                ans.add(i);
//            }
//        }


//     ************************   HASHING  ***********************************
//            int[] hash = new int[n+1];
//            for(int i = 0;i<n;i++)
//            {
//                hash[arr[i]]++;
//            }
//
//            for(int i = 1;i<=n;i++)
//            {
//                if(hash[i] == 2 ) ans.add(i);
//                if(hash[i] == 0 ) ans.add(i);
//            }

//     ************************OPTIMAL(USING SUM)***********************************


        long s = 0;
        long s2 = 0;

        for (int j : arr) {
            s += j;
            s2 += j * j;
        }
        long sn = (n*(n+1))/2;
        long s2n = (n*(n+1)*(2*n+1))/6 ;
        long val1 = s - sn;
        long val2 = s2 - s2n;
        val2 = val2/val1;
        int x = ((int) val1 + (int) val2)/2;
        int y = x - (int) val1 ;
        ans.add(x);
        ans.add(y);
        System.out.println(ans);
    }
}
