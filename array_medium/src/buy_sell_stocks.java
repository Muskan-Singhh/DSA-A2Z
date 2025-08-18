import java.util.Scanner;

public class buy_sell_stocks {
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
        int buy = Integer.MAX_VALUE, profit = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] < buy)
                buy = arr[i];
            else {
                profit = Math.max(profit, arr[i] - buy);
            }

        }

        System.out.println("Profit : " +profit);
    }
}
