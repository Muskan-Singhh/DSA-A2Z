import java.util.HashMap;

public class subwithxor {
    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        int n = arr.length;
        int k = 6;
//      ***************************BRUTE-FORCE*******************************************************
//        int xor,c=0;
//        for(int i = 0;i<n;i++)
//        {
//            xor = 0;
//            for(int j = i;j<n;j++)
//            {
//                xor = xor ^ arr[j];
//                if(xor == k)
//                    c++;
//            }
//        }
//        System.out.println(c);
//     **************************************OPTIMAL****************************************************
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int xor = 0 , c = 0;
        mpp.put(xor,1);
        for(int i=0;i<n;i++)
        {
            xor ^= arr[i];

            int x = xor^k;
            if(mpp.containsKey(x))
                c += mpp.get(x);

            mpp.put(xor, mpp.getOrDefault(xor,0)+1);

        }
        System.out.println(c);
    }
}
