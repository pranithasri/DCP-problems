import java.util.*;

/*Good morning! Here's your coding interview problem for today.

This problem was asked by Facebook.

Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' is not allowed.*/

//time complexity O(n) space complexity O(n)

class Solution {
    public int solve(String message) {
        // Write your code here
        
        int i,c=1,l;
        l=message.length();
        int []a=new int[l];
        int []b=new int[l];
        for(i=0;i<l-1;i++)
        {
            if((message.charAt(i))==49)
            {
                a[i]=2;
            }
            else if((message.charAt(i))==50&& (message.charAt(i))<=54)
            {
                a[i]=2;
            }
            else
            {
                a[i]=1;
            }
        }
        a[l-1]=1;
      
        b[0]=1;
        for(i=1;i<l;i++)
        {
            
           if(a[i-1]==2)
           {
               if(i-2<0)
               {
                   
                  b[i]=b[i-1]+1 ;
               }
               else
               {
               b[i]=b[i-1]+b[i-2];
               }
           }
           else
           {
               b[i]=b[i-1];
           }
        }
         
        return b[l-1];
    }
}





public class Decode{

     public static void main(String []args){
        
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        System.out.println(s.solve(sc.next()));
        
     }
}
