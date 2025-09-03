 /*Allocate Minimum Number of Pages
Problem Statement: Given an array of integer numbers, ‘arr[i]’ represents the number of pages in the ‘i-th’ book.
There are a ‘m’ number of students, and the task is to allocate all the books to the students.
You have to allocate the book to ‘m’ students such that the maximum number of pages assigned to a student is minimum.
If the allocation of books is not possible. return -1

Example 1:
Input Format: n = 4, m = 2, arr[] = {12, 34, 67, 90}
Result: 113
Example 2:
Input Format: n = 5, m = 4, arr[] = {25, 46, 28, 49, 24}
Result: 71
Assume the given array is {25 46 28 49 24} and number of students, M = 4.
Now, we can allocate these books in different ways.
Some of them are the following:
25 | 46 | 28 | 49, 24  → Maximum no. of pages a student receive = 73
25 | 46 | 28, 49 | 24  → Maximum no. of pages a student receive = 77
25 | 46, 28 | 49 | 24  → Maximum no. of pages a student receive = 74
25, 46 | 28 | 49 | 24  → Maximum no. of pages a student receive = 71
From the above allocations, we can clearly observe that the minimum possible maximum number of pages is 71. */
import java.util.*;
public class Book_Allocation {
    static int count_Student(ArrayList<Integer> arr, int pages)
    {
        int stud = 1, page = 0;
        int n = arr.size();
        for(int i=0;i<n;i++)
        {
            if(page + arr.get(i) <= pages)
                page += arr.get(i);
            else
            {
                stud++;
                page = arr.get(i);
            }
        }
        return stud;
    }
/*        ****************************  BRUTE-FORCE APPROACH *************************************
    static int func(ArrayList<Integer> arr , int m)
    {
        if(m > arr.size())
            return -1;
        int low = Collections.max(arr);                        // Finds maximum element of arr
        int high = arr.stream().mapToInt(Integer::intValue).sum(); // finds sum of all elements of arr
        for(int i = low;i<=high;i++)
        {
            if(count_Student(arr,i) == m)
                return i;
        }
        return low;
    }
*/
//           ****************************  OPTIMAL APPROACH *************************************
    static int func(ArrayList<Integer> arr, int m) {
        if (m > arr.size())
            return -1;
        int low = Collections.max(arr);                        // Finds maximum element of arr
        int high = arr.stream().mapToInt(Integer::intValue).sum(); // finds sum of all elements of arr
        while (low <= high)
        {
            int mid = low + (high-low) / 2;
            if(count_Student(arr,mid) > m)
                low = mid+1;
            else
                high = mid-1;
        }
        return low;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(12, 34, 67, 90));
        int m = 2;
        System.out.println(func(arr,m));
    }
}

