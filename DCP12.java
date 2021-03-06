/* There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.

For example, if N is 4, then there are 5 unique ways:

    1, 1, 1, 1
    2, 1, 1
    1, 2, 1
    1, 1, 2
    2, 2

What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time.*/


//time complexity of solution is O(n) and space complexity O(n)




import java.util.*;


class Solution {
    
    public int solve(int n) {
         int i=2;long a=1000000007L;
         long []b=new long[n];
         
        // Write your code here
        if(n==1)
        {
            return 1;
        }
        else if(n==2)
        {
            return 2;
        }
           else
           {
               b[0]=1;
               b[1]=2;
               while(i<n)
                {
                    
                   b[i]=(b[i-1]+b[i-2])%a;
                   i++;
                   
                }
                
            }
            
            return (int)b[n-1];
    
        }
        
}



public class Staircase{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        System.out.println(s.solve(sc.nextInt()));
     }
}
