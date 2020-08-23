import java.util.*;

// time complexity O(n*n)
//space complexity O(1)

class Solution {
    public int solve(String s) {
        // Write your code here
        int r,l,i,j,max=0;
        for(i=1;i<s.length();i++)
        {
            l=i-1;
            r=i;
            while(l>=0 && r<s.length()-1 && s.charAt(l)==s.charAt(r) )
            {
               
                if(max< (r-l)+1)
                {
                    max=r-l+1;
                }
                 l--;
                r++;
            }
    
            l=i-1;
            r=i+1;
            while(l>=0 && r<s.length()-1 && s.charAt(l)==s.charAt(r) )
            {
              
                if(max< (r-l)+1)
                {
                    max=r-l+1;
                }
                  l--;
                r++;
            }
        }
       return max;
    }
    
}
