public class max_prod {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0};
        int n = arr.length;
        int prod ;
        int max_prod = Integer.MIN_VALUE;

//      ******************************BRUTE-FORCE****************************************
//
//        for(int i=0;i<n;i++)
//        {
//            prod = 1;
//            for(int j = i;j<n;j++)
//            {
//                prod *= arr[j];
//                max_prod = Math.max(max_prod,prod);
//            }
//
//        }

//     **********************************OPTIMIZED APPROACH********************************************

        int pre = 1;
        int suf = 1;
        for (int i = 0;i<n;i++)
        {
            if (pre == 0)
                pre = 1;
            if (suf == 0)
                suf = 1;
            pre *= arr[i];
            suf *= arr[n-i-1];
            max_prod = Math.max(max_prod,Math.max(pre,suf));

        }




        System.out.println(max_prod);
    }
}
