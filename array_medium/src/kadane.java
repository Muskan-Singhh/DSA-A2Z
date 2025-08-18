import java.util.Scanner;

public class kadane {
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
        int max_sum = Integer.MIN_VALUE;
//        for(int i=0;i<n;i++)
//        {
//            for (int j=i;j<n;j++)
//            {
//                 int sum=0;
//
//                for(int k=i;k<=j;k++)
//                {
//                    sum += arr[k];
//                }
//                max_sum = Math.max(sum,max_sum);
//            }
//        }
//


//      *************************2nd Approach******************************************

//        for(int i=0;i<n;i++)
//        {
//            int sum =0;
//
//            for (int j=i;j<n;j++) {
//                sum+=arr[j];
//                max_sum = Math.max(sum,max_sum);
//            }
//
//        }
//      *****************************KADANE ALGORITHM***********************************
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
            if(sum>max_sum)
                max_sum = sum;
            if (sum<0) {
                sum = 0;
            }
        }
       System.out.println("Maximum subarray sum : "+max_sum);
    }
}
