import java.util.Scanner;

public class rotate_mat_90 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter row of array : ");
//        int r = sc.nextInt();
//        System.out.println("Enter column of array : ");
//        int c = sc.nextInt();
//        System.out.println("Enter elements of array : ");
//        int[] []arr = new int[r][c];
//        for (int i = 0;i<r;i++)
//        {
//            for (int j = 0;j<c;j++)
//            {
//                arr[i][j] = sc.nextInt();
//            }
//        }
        int[][] arr = {
                {1,  2,  3},
                {4,5,  6},
                {7,  8,9}

        };
        int r = arr.length;
        int c = arr[0].length;
//        *************************BRUTE-FORCE**********************************
//        int[] [] mat = new int[r][c];
//        for (int i = 0;i<r;i++) {
//            for (int j = 0; j < c; j++) {
//                    mat[j][r-i-1] = arr[i][j];
//            }
//        }


//      *************************OPTIMAL APPROACH**********************************
        for (int i = 0;i<r;i++)
        {
            for (int j = 0;j<i;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }

        }
        for (int i = 0;i<r;i++)
        {
            int s = 0, e= r-1;
            while(s<e)
            {
                int temp = arr[i][s];
                arr[i][s] = arr[i][e];
                arr[i][e] = temp;
                s++;
                e--;
            }
        }
        System.out.println("Updated Matrix is");
        for (int i = 0;i<r;i++)
        {
            for (int j = 0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
