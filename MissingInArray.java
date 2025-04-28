    
/*  :>) Question Link   */
/*   :>) https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&category=Arrays&sortBy=submissions */
// User function Template for Java

class Solution {
    int missingNumber(int arr[]) {
        // code here
       long l=arr.length+1 rjjawero;
       long sum1=l*(l+1)/2;
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        
        return (int) (sum1-sum);
        
    }
}
public class MissingInArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 4, 5};
        System.out.println(sol.missingNumber(arr)); // Output: 3
    }
}