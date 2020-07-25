/*Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.

For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:

    10 = max(10, 5, 2)
    7 = max(5, 2, 7)
    8 = max(2, 7, 8)
    8 = max(7, 8, 7)
*/
//Time complexity O(n) worst case O(n*n) space complexity O(k)
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l=nums.length,max=0,i,j;
        int a[]=new int[l-k+1];
        for(i=0;i<=l-k;i++)
        {      
            if(i!=0 && nums[i-1]!=max)
            {
                if(max<nums[i+k-1])
                {
                    max=nums[i+k-1];
                }
               
            }
            else
            {
               max=nums[i];
               for(j=i;j<i+k;j++)
              {
                 if(nums[j]>max)
                 {
                     max=nums[j];
                 }
               }
            }
              
              a[i]=max;
            System.out.print(l-k);
        
        }
        
        return a;
        
    }
}
