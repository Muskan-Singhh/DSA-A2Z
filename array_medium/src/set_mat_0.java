import java.util.Scanner;

public class set_mat_0 {
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
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        int r = arr.length;
        int c = arr[0].length;
//      *************************BRUTE-FORCE**********************************
//        boolean[] row = new boolean[r];
//        boolean[] col = new boolean[c];
//        for (int i = 0;i<r;i++)
//        {
//            for (int j = 0; j < c; j++)
//            {
//                if(arr[i][j] == 0)
//                {
//                    row[i] = true;
//                    col[j] = true;
//                }
//            }
//        }
//        for (int i = 0;i<r;i++)
//        {
//            for (int j = 0; j < c; j++)
//            {
//                if(row[i] || col[j])
//                {
//                    arr[i][j] = 0;
//                }
//            }
//        }
//      *************************OPTIMAL APPROACH**********************************
        int c0 = 1;
        for (int i = 0;i<r;i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (arr[i][j] == 0)
                {
                    arr[i][0] = 0;  //marking row as 0
                    if(j == 0)  // if it's first column
                        c0 = 0;
                    else
                        arr[0][j] = 0; //marking column as 0
                }
            }
        }
        for (int i = 1;i<r;i++)
        {
            for (int j = 1; j < c; j++)
            {
                if (arr[0][j] == 0 || arr[i][0] == 0)
                {
                   arr[i][j] = 0;
                }
            }
        }
        if(arr[0][0] == 0)
        {
            for(int i = 0;i<r;i++)
            {
                arr[i][0] = 0;
            }
        }
        if(c0 == 0)
        {
            for(int j = 0;j<c;j++)
            {
                arr[0][j] = 0;
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
