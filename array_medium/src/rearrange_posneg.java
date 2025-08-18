import java.util.ArrayList;
import java.util.Scanner;

public class rearrange_posneg {
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
//      *************************BRUTE-FORCE**********************************
//        ArrayList<Integer> pos = new ArrayList<>();
//        ArrayList<Integer> neg = new ArrayList<>();
//        for (int i=0;i<n;i++)
//        {
//            if(arr[i]>0)
//                pos.add(arr[i] );
//            else
//                neg.add(arr[i] );
//        }
//        for (int i=0;i<n/2;i++)
//        {
//            arr[2*i] = pos.get(i);
//            arr[2*i+1] = neg.get(i);
//        }
//        System.out.println("Printing array elements : ");
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
        int[] ans = new int[n];
        int pos = 0,neg=1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0){
                ans[pos] = arr[i];
                pos+=2;
            }
            else{
                ans[neg] = arr[i];
                neg+=2;
            }


        }
        System.out.println("Printing array elements : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
