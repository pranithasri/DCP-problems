/*Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?*/


//This is asloution with time complexity o(3n)
//space complexity O(2n)

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int i=-1,n;
	    int []b=new int[1000];
	    int []c=new int[1000];
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
       while(sc.hasNextInt()){

          a.add(sc.nextInt());

          }
         n=a.size();
         c[n-1]=1;
         b[0]=1;
         for(i=1;i<n;i++)
         {
             b[i]=b[i-1]*a.get(i-1);
             
         }
         for(i=n-2;i>=0;i--)
         {
             c[i]=c[i+1]*a.get(i+1);
             
         }
         for(i=0;i<n;i++)
         {
            
              System.out.print(c[i]*b[i]+", ");
         }
	}
	
}
