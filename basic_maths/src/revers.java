import java.util.Scanner;

public class revers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        int d=0,rev=0;
        while (n!=0)
        {
            d = n%10;
            rev = rev*10 + d;
            n/=10;
        }
        System.out.println("Reverse = "+rev);
    }
}
