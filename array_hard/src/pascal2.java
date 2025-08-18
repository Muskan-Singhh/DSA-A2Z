import java.util.Scanner;

public class pascal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int row = sc.nextInt();

        int  r = row-1;

        int val = 1;
        for(int i=0;i<=r;i++)
        {
            System.out.print(val+" ");
            val = val * (r-i)/(i+1);
        }


    }
}
