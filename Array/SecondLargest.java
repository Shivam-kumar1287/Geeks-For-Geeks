/*Question Links :>) https://www.geeksforgeeks.org/problems/second-largest3735/1?page=1&sortBy=submissions */
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("The second largest element is: " + findSecondLargest(arr));
    }

    public static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return second;
    }
}


/* easy  solution*/
/*//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends

class Solution {
    public int getSecondLargest(int[] arr) {
        if (arr.length < 2) return -1;

        Arrays.sort(arr);
        int largest = arr[arr.length - 1];

        // Traverse backward to find the first element smaller than the largest
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                return arr[i];
            }
        }

        // If no second largest found (all elements are equal)
        return -1;
    }
}
 */