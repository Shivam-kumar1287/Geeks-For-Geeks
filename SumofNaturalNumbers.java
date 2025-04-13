

/*Question Liks :>) https://www.geeksforgeeks.org/problems/sum-of-series2811/0  */
class Solution {
      int seriesSum(int n) {
          // code here
          int sum=0;
          for(int i=0;i<=n;i++){
              sum+=i;
          }
          return sum;
      }
  };

public class SumofNaturalNumbers {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5; // Example input
        System.out.println(sol.seriesSum(n)); // Output: 15 (1 + 2 + 3 + 4 + 5)
    }
  
  