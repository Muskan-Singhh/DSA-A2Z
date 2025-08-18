import java.util.HashMap;
import java.util.Scanner;

public class givensum_subarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array : ");
        int[] arr = new int[n];
        for (int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target sum : ");
        int k = sc.nextInt();
        HashMap<Integer,Integer> presum = new HashMap<>();
        int count = 0, sum = 0, prefix;
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
            if(sum == k)
                count++;
            prefix = sum-k;
            if(presum.containsKey(prefix))
                count += presum.get(prefix);
            presum.put(sum,presum.getOrDefault(sum,0)+1);
        }
        System.out.println("It contains "+count+" Subarrays with given sum");
    }
}
