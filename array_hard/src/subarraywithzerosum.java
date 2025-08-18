import java.util.HashMap;
import java.util.Map;

public class subarraywithzerosum {
    public static void main(String[] args) {
        int[] arr = {6, -2, 2, -8, 1, 7, 4, -10};
        int n = arr.length;
//        ***************************BRUTE-FORCE*****************************************************************
//        int max = 0;
//        for(int i = 0; i < n ; i++)
//        {
//            int sum = 0 , c = 0;
//            for(int j = i; j < n ; j++)
//            {
//                sum+=arr[j];
//                if(sum == 0)
//                    c = (j-i+1);
//            }
//            max = Math.max(c,max);
//        }
//        System.out.println(max);

//     **********************************OPTIMIZED APPROACH********************************************
        HashMap<Integer,Integer> freq = new HashMap<>();
        int sum = 0, max = 0;
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
            if(sum == 0)
                max = i+1;
            if(freq.containsKey(sum))
                max = Math.max(max, i - freq.get(sum));
            else
                freq.put(sum,i);

        }
        System.out.println(max);



    }
}
