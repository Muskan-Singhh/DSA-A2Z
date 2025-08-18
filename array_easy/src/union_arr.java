import java.util.ArrayList;
import java.util.Scanner;

public class union_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array 1: ");
        int[] arr1 = new int[n];
        for (int i = 0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter size of array 2: ");
        int m = sc.nextInt();
        System.out.println("Enter elements of array 2: ");
        int[] arr2 = new int[m];
        for (int i = 0;i<m;i++)
        {
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0,j = 0;
        while (i<n && j < m)
        {
            while (arr1[i] == arr1[(i+1)%n])
                i++;
            while (arr2[j] == arr2[(j+1)%m])
                j++;
            if(arr1[i]<arr2[j])
            {
                union.add(arr1[i]);
                i++;
            } else if (arr2[j]<arr1[i]) {
                union.add(arr2[j] );
                j++;

            }
            else {
                union.add(arr1[i]);
                i++;
                j++;
            }
        }
        while (i<n)
        {
            while (arr1[i] == arr1[(i+1)%n])
                i++;
            union.add(arr1[i]);
            i++;
        }
        while (j<m)
        {
            while (arr2[j] == arr2[(j+1)%m])
                j++;
            union.add(arr2[j]);
            j++;

        }
        System.out.println(union);
    }
}
