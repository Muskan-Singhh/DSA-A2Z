import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class majority_element {
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
//     ***************************BRUTE FORCE************************************
//        int c = 0;
//        for(int i = 0;i<n;i++)
//        {
//            int ele = arr[i];
//            for(int j = 0;j<n;j++)
//            {
//                if(arr[j] == ele)
//                    c++;
//            }
//           if(c> n/2)
//           {
//               System.out.println(ele);
//               break;
//           }
//        }

//      ************************HashMap**************************************
//        HashMap<Integer, Integer> mp = new HashMap<>();
//        for(int i = 0;i<n;i++)
//        {
//            int value = mp.getOrDefault(arr[i],0);
//            mp.put(arr[i], value+1);
//        }
//        for(Map.Entry<Integer,Integer> entry: mp.entrySet())
//        {
//            if(entry.getValue()>n/2) {
//                System.out.println(entry.getKey());
//                break;
//            }
//        }

//    ************************MOORE-VOTING ALGO****************************************
        int ele=0,c=0;
        for(int i=0;i<n;i++)
        {
            if(c==0){
                ele=arr[i];
                c+=1;
            } else if (ele == arr[i]) {
                c+=1;
            }
            else {
                c-=1;
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == ele)
                cnt+=1;
        }
        if(cnt>n/2)
            System.out.println("Majority element: "+ele);

    }
}
