import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        boolean flag = true;
        for(int i = 2;i<=n/2;i++)
        {
            if(n%i == 0 ) {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("No is Prime");
        }
        else {
            System.out.println("No is not Prime");
        }
    }
}
