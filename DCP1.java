/*Given a list of numbers nums and a number k, return whether any two numbers from the list add up to k. You may not use the same element twice.

Note: Numbers can be negative or 0.

Bonus: Can you do this in one pass?*/
//solution with time complexity O(nlogn)
// space complexity is O(1)


import java.util.*;
import java.util.Arrays;


class Solution {
    public boolean solve(int[] nums, int k) {
        // Write your code here
       int i=0,m=nums.length-1,ind=0;
       Arrays.sort(nums);
       while(i<m)
       {
           if(nums[i]+nums[m]<k)
           {
               i++;
           }
           else if(nums[i]+nums[m]>k)
           {
               m--;
           }
           else 
           {
               return true;
           }
       }
       return false;
       
       
    }
}
