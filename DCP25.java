import java.util.*;

/*Good morning! Here's your coding interview problem for today.

This problem was asked by Facebook.

Implement regular expression matching with the following special characters:

    . (period) which matches any single character
    * (asterisk) which matches zero or more of the preceding element
*/
// time complexity O(n)
//space complexity O(n)


class Solution {
    public boolean solve(String pattern, String s) {
        // Write your code here
        int i,j=0;
        for(i=0;i<pattern.length();i++)
        {
            if(pattern.charAt(i)!='*' && pattern.charAt(i)!='.')
            {
              if(j>=s.length())
              {
                  return false;
              }
               else if(s.charAt(j)!=pattern.charAt(i))
               {
                    System.out.println(i+" "+j);
                   System.out.println("1");
                   return false;
               }
               j++;
            }
            else
            {
                if(pattern.charAt(i)=='.')
                {
                    if(s.charAt(j)>='a'&& s.charAt(j)<='z')
                    {
                        j++;
                    }
                    else
                    {
                        System.out.println(i+" "+j);
                        System.out.println("2");
                        return false;
                    }
                }
                else if(pattern.charAt(j)=='*')
                {
                    if(pattern.charAt(i-1)=='.')
                    {
                        if(i+1>=pattern.length())
                        {
                            return true;
                        }

           while((j<s.length() ) && (pattern.charAt(i+1)!=s.charAt(j)))
                       {
                        
                        j++;
                        System.out.println("hii"+j);
                    } 
                    }
                    else
                    {
                    while((j<s.length()) && (pattern.charAt(i-1)==s.charAt(j)))
                    {
                        
                        j++;
                        System.out.println("hii"+j);
                    }
                    
                if((i+1<pattern.length() && j<s.length()) &&(pattern.charAt(i+1)!=s.charAt(j)))
                    {
                        System.out.println(i+" "+j);
                        System.out.println("3");
                        return false;
                    }
                    }
                    
                }
            }
        }
        if(j>=s.length())
        {
          return true;
        }
        return false;
    }
    
}

