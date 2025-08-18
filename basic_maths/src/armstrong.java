import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int p = (int) (Math.log10(n)+1);
        int d ,sum=0;
        int num = n;
        while (n != 0)
        {
            d = n%10;
            sum +=  (int) (Math.pow(d,p));
            n/=10;
        }
        if(num==sum)
            System.out.println("Number is Armstrong");
        else
            System.out.println("Number is not Armstrong");
    }
}
