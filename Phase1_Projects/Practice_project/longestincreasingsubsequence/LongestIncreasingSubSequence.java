package longestincreasingsubsequence;

public class LongestIncreasingSubSequence 
{
		static int max_ref; // stores the LongestIncreseSequence
        static int _LongestIncreaseSequence(int arr[], int n)
    	{
               if (n == 1)
    			return 1;
           int res, max_ending_here = 1;

    		for (int i = 1; i < n; i++) 
    		{
    			res = _LongestIncreaseSequence(arr, i);
    			if (arr[i - 1] < arr[n - 1]
    				&& res + 1 > max_ending_here)
    				max_ending_here = res + 1;
    		}
             if (max_ref < max_ending_here)
    			max_ref = max_ending_here;
                  return max_ending_here;
    	 }
          static int LongestIncreaseSequence(int arr[], int n)
    	  {
    		
    		max_ref = 1;
            _LongestIncreaseSequence(arr, n);
            return max_ref;
    		
           }
       
          public static void main(String args[])
    	{
    		int arr[] = { 34,56,3,13,25,46,89,56,33,19,6,9  };
    		int n = arr.length;
    		System.out.println("Length of LongestIncreaseSequence is " + LongestIncreaseSequence(arr, n) + "\n");
    	}
 
}
        




	


