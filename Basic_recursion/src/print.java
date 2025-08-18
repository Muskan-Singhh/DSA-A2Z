import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Enter how many times you want to print the number : ");
        int n = sc.nextInt();
        print_n(num,n);
    }
    static void print_n(int num, int n)
    {
        if(n==0)
            return;
        else {
            System.out.print(num + " ");
            print_n(num, n - 1);
        }

    }
}
