/*
Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).

For example, given the string ([])[]({}), you should return true.

Given the string ([)] or (((), you should return false.
*/

// time complexity O(n) and space complexity O(n)
import java.util.*;

class Solution {
    public boolean solve(String s) {
        // Write your code here
        int []a=new int[s.length()];
        int i,j=-1;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                j++;
                a[j]=1;
                
            }
            else if(s.charAt(i)=='{')
            {
                j++;
                a[j]=2;
            
            }
            else if(s.charAt(i)=='[')
            {
                j++;
                a[j]=3;

            }
            else if(s.charAt(i)==')')
            {
                if(j>=0 && a[j]==1)
                {
                a[j]=0;
                j--;
                }
                else
                {
                    System.out.println("p");
                    return false;
                }
            }
            else if(s.charAt(i)=='}')
            {
               if(j>=0 && a[j]==2)
                {
                a[j]=0;
                j--;
                }
                else
                {
                    System.out.println("f");
                    return false;
                }
            }
            else if(s.charAt(i)==']')
            {
                if(j>=0 && a[j]==3)
                {
                a[j]=0;
                j--;
                }
                else
                {
                    System.out.println("s");
                    return false;
                }
            }
        }
        if(j==-1)
        {
        return true;
        }
        else
        {
            return false;
        }
    }
}

