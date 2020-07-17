/*Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.

Follow-up: Can you do this in O(N) time and constant space?*/

//space complexity O(n) and time complexity O(n)
import java.util.*;


class Solution {
    public int solve(int[] nums) {
        // Write your code here
        int l=nums.length,i;
        int []a=new int[l+1];
        a[l]=0;
        a[l-1]=nums[l-1];
        a[l-2]=nums[l-2];
        for(i=l-3;i>=0;i--)
        {
            
             if(nums[i]<0)
             {
                 a[i]=(a[i+1]>a[i+2]) ? a[i+1]:a[i+2];
             }
             else{
            a[i]= (a[i+3]>a[i+2]) ? nums[i]+a[i+3]:nums[i]+a[i+2];
             }
            if(a[i]<a[i+1])
            {
                a[i]=a[i+1];
            }
        }
        
        if(a[0]<0)
        {
            a[0]=0;
        }
       return a[0];
    }
}





public class HelloWorld{

     public static void main(String []args){
        int i;
        Scanner sc=new Scanner(System.in);
        Solution so=new Solution();
        String s=sc.next();
        String[] p=s.split(",");
        int []nums=new int[(p.length)];
        for(i=0;i<p.length;i++)
        {
            nums[i]=(Integer.parseInt(p[i]));
        }
        System.out.println(so.solve(nums));
        
     }
}
