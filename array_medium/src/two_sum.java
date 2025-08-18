import java.util.HashMap;
import java.util.Scanner;

public class two_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array : ");
        int[] arr = new int[n];
        for (int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        int[] ans = new int[2];
        ans[0] = ans[1] =  -1;
//        *****************BRUTE FORCE**********************************
//        for(int i=0;i<n;i++)
//        {
//            for (int j = 1;j<n;j++)
//            {
//                if(arr[i] + arr[j] == target)
//                {
//                    ans[0] = i;
//                    ans[1] = j;
//                }
//            }
//        }
//        ******************HASHMAP*****************************
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i=0;i<n;i++)
        {
            int rem = target - arr[i];
            if(mp.containsKey(rem))
            {
                ans[0] = mp.get(rem);
                ans[1] = i;
            }
            mp.put(arr[i],i);
        }



        for(int i= 0;i<2;i++)
            System.out.println(ans[i]);
    }
}
