import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter elements of the array : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<n;i++)
        {
            int key = arr[i];
            int f = 0;
            if(mp.containsKey(key))
                f=mp.get(key);
            f++;
            mp.put(key,f);
        }
        int max_f = -1;
        int max_e = -1;
        int min_f = Integer.MAX_VALUE;
        int min_e = -1;
        for(Map.Entry<Integer,Integer> e : mp.entrySet())
        {
            if(max_f < e.getValue()) {
                max_f = e.getValue();
                max_e = e.getKey();
            }

            if(min_f > e.getValue()) {
                min_f = e.getValue();
                min_e = e.getKey();
            }
        }
        System.out.println("Max Frequency =  "+ max_e +" And Min Frequency = "+min_e);
    }
}
