public class IndexesofSubarraySum {
    
}

// /* question links :>) https://www.geeksforgeeks.org/find-subarray-with-given-sum/ */


class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int n=arr.length,j=0,sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            while(sum>target && j<i) sum-=arr[j++];
            if(sum==target){
                ans.add(j+1);
                ans.add(i+1);
                return ans;
            }
    
        }
        ans.add(-1);
        return ans;
    }
}

