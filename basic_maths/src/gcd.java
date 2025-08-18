import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int n2 = sc.nextInt();
        int a = Math.max(n1,n2);
        int b = (n1+n2)-a;
        int d = 0;
        while(a%b != 0)
        {
           d = a%b;
           a = b;
           b = d;
        }
        System.out.println("Gcd of given numbers = " +b);
    }
}
