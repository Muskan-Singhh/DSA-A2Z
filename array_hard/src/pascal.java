import java.util.Scanner;

public class pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int n = sc.nextInt();
//     ***********************OPTIMAL APPROACH*********************************************
        int val;
        for (int i=0;i<n;i++)
        {
            val = 1;
            for (int j = 0;j<=i;j++)
            {
                System.out.print(val+" ");
                val = val * (i-j)/(j+1);
            }
            System.out.println();
        }

    }
//  *****************************BRUTE-FORCE******************************************
//    static int fact(int n)
//    {
//        if(n == 0 || n==1)
//            return 1;
//        return n*fact(n-1);
//    }
//    static int ncr(int n , int r)
//    {
//        if(r == 0)
//            return 1;
//        if(r == 1)
//            return n;
//        if(n == r)
//            return 1;
//        int a = fact(n);
//        int b = fact(r);
//        int c = fact(n-r);
//        return a/(b*c);
//    }
//    static void pascal(int n)
//    {
//        for(int r = 0;r<n;r++)
//        {
//            for(int c = 0;c<=r;c++)
//            {
//                System.out.print(ncr(r, c)+" ");
//
//            }
//            System.out.println();
//        }
//
//    }
}
