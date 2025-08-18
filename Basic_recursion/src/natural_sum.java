import java.util.Scanner;

public class natural_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        System.out.println(sum(n));
    }
    static int sum(int n)
    {

        if(n<1)
            return 0;
        return n + sum(n-1);
    }
}
