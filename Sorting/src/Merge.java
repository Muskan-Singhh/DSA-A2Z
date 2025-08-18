import java.util.ArrayList;
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of array : ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter elements of array : ");
//        for (int i = 0;i<n;i++)
//        {
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {4,3,2,5,1,7,6,8};
        int n = arr.length;
        merge_sort(arr,0, arr.length-1);
        for (int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void merge_sort(int[] arr, int l,int h)
    {

        if (l<h)
        {
            int mid = (l+h)/2;
            merge_sort(arr,l,mid);
            merge_sort(arr,mid+1,h);
            merge(arr,l,mid,h);
        }
    }
    static void merge(int[] arr,int s,int m,int e)
    {
        int left = s;
        int right = m+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(left <= m && right <= e)
        {
            if(arr[left] <= arr[right])
            {
                temp.add(arr[left] );
                left++;
            }
            else {
                temp.add(arr[right] );
                right++;
            }
        }
        while (left<=m)
        {
            temp.add(arr[left] );
            left++;
        }
        while (right <= e)
        {
            temp.add(arr[right] );
            right++;
        }
        for(int i=s;i<=e;i++)
        {
            arr[i] = temp.get(i-s);
        }
    }
}
