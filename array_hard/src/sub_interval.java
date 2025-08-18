import java.util.*;

public class sub_interval{
    public static void main(String[] args) {
        int[][] arr = {{1,3}, {2,6}, {8,10}, {2,4},{7,9},{15,18}};
        int r = arr.length;
//      Arrays.sort(arr, Comparator.comparingInt((int[] i) -> i[0]).thenComparingInt(i->i[1]));

//      ***********************BRUTE-FORCE*****************************
//        List<List<Integer>> res = new ArrayList<>();
//        boolean[] vis = new boolean[r];
//        for (int i = 0;i<r;i++)
//        {
//            if(vis[i]) continue;
//            int s = arr[i][0];
//            int e = arr[i][1];
//
//            for (int j = i+1;j<r;j++)
//            {
//                if(vis[j]) continue;
//                int cur_s = arr[j][0];
//                int cur_e = arr[j][1];
//                if (cur_s <= e && cur_e >= s)
//                    {
//                        s = Math.min(s,cur_s);
//                        e = Math.max(e, cur_e);
//                        vis[j] = true;
//                    }
//            }
//            vis[i] = true;
//            res.add(Arrays.asList(s, e));
//        }
//
//        System.out.println(res);
        
//     ************************OPTIMAL***********************************

    }
}
