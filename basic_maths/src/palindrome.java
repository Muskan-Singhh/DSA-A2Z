import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int d=0,rev=0;
        int num = n;
        while (n!=0)
        {
            d = n%10;
            rev = rev*10 + d;
            n/=10;
        }
        if(num == rev)
        {
            System.out.println("Number is Palindrome ");
        }
        else
        {
            System.out.println("Number is not Palindrome ");
        }
    }
}
