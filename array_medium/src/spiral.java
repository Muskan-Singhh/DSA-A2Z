import java.util.ArrayList;

public class spiral {
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
                {7,  8,9},


        };

        int r = arr.length;
        int c = arr[0].length;

        int top = 0, bottom = r-1, left =0, right =c-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while (top<=bottom && left<=right)
        {
            for(int i = left;i<=right;i++)
            {
                ans.add(arr[top][i]);
            }
            top++;
            for(int i = top;i<=bottom;i++)
            {
                ans.add(arr[i][right]);
            }
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }

            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(arr[i][left]);
                }
                left++;
            }

        }
        System.out.println(ans);
    }
}
