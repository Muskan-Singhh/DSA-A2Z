import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class freq {
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
        System.out.println("Enter the no.of queries");
        int q = sc.nextInt();
        while(q >0 )
        {
            System.out.println("Enter the number whose frequency you want to know");
            int number = sc.nextInt();
            if(mp.containsKey(number))
                System.out.println("Frequency of the number is: " +mp.get(number));
            else
                System.out.println("0");
            q--;
        }
    }
}
