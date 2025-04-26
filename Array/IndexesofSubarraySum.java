class IndexesOfSubarraySum
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        int sum = 9;
        int n = arr.length;
        subarraySum(arr, n, sum);
    }
    
    public static void subarraySum(int arr[], int n, int sum)
    {
    int curr_sum = arr[0];
    int start = 0;
    int end = 0;
    for(int i = 1; i < n; i++)
    {
        while(curr_sum > sum && start < i)
        {
            curr_sum = curr_sum - arr[start];
            start++;
        }
        if(curr_sum == sum)
        {
            end = i;
            break;
        }
        if(i < n)
        {
            curr_sum = curr_sum + arr[i];
        }
    }
    if(curr_sum == sum){
        System.out.println("Subarray found from index " + start + " to " + end);
    }
    else
    {
        System.out.println("No subarray found with the given sum.");
    }
    }
    }   
        
    
