        
/*Given two strings a and b, find their total edit distance between the two. One edit distance is defined as

    Deleting a character or
    Inserting a character or
    Replacing a character
*/

import java.util.*;
import java.lang.*;

class Solution {
    public int solve(String a, String b) {
        // Write your code here
        int c=0,i,j,p=-1;
        int []s=new int[26];
    
    if (a.length()>b.length())
        {
        
            for(j=0,i=0;j<a.length() && i<b.length();j++)
            {
                if(a.charAt(j)!=b.charAt(i))
                {
                System.out.println(a.charAt(j));
                    c++;
                }
                else
                {
            System.out.println(i+" "+p);
                    p++;
                    i++;
                }
            }
            System.out.print(i);
           
        
        }
        else
        {
        
         for(i=0,j=0;j<b.length()&& i<a.length();j++)
            {
                if(a.charAt(i)!=b.charAt(j))
                {
                        System.out.println(b.charAt(j));
                    c++;
                }
                else
                {
                    i++;
                    p++;
                }
            }                
             
        }
        
        
                
      return c;  
    }
}

