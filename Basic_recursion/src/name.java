import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println("Enter how many times you want to print your name : ");
        int n = sc.nextInt();
        print_name(name,n);

    }
    static void print_name(String name, int n)
    {
        if(n==0)
            return;
        else {
            System.out.println(name);
            print_name(name, n - 1);
        }
    }
}
