
/* question links :>) https://www.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&sortBy=submissions*/
public class Solution {
    static int majorityElement(int arr[]) {
        int count = 0, candidate = -1;

        // Step 1: Find a candidate using Moore's Voting Algorithm
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify the candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        return count > arr.length / 2 ? candidate : -1;
    }
}
 
