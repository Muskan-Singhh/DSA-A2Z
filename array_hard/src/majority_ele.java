import java.util.ArrayList;
import java.util.Scanner;

public class majority_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr = new int[n];
        for (int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
//        int[] arr = {3,3,1,2,2,1,3,1,2,2,1};
//        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();
        int c1 = 0;
        int c2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(c1 ==0 && ele2 != arr[i])
            {
                c1++;
               ele1 = arr[i];
            } else if (c2==0 && arr[i]!=ele1) {
                c2++;
                ele2 = arr[i];
            } else if (arr[i] == ele1) {
                c1++;
            } else if (arr[i]==ele2) {
                c2++;
            }
            else {
                c1--;
                c2--;
            }
        }
        c1=c2=0;
        for(int i = 0;i<n;i++)
        {
            if(arr[i]== ele1)
            {
                c1++;
            }
            if(arr[i] == ele2)
            {
                c2++;
            }
        }
        if(c1>n/3)
            ans.add(ele1);
        if(c2>n/3)
            ans.add(ele2);
        System.out.println(ans);
    }
}
