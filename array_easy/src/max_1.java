import java.util.Scanner;

public class max_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array : ");
        int[] arr = new int[n];
        for (int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int c= 0, max=0;
        for (int i=0;i<n;i++)
        {
            if(arr[i] == 1)
            {
                c++;
            }
            else{
                c = 0;
            }
            max = Math.max(c,max);
        }
        System.out.println("max 1's are : "+max);
    }
}
