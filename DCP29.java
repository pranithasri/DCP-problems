/*
Run-length encoding is a fast and simple method of encoding strings. 
The basic idea is to represent repeated successive characters as a 
single count and character. For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".
*/
//time complexity O(n) space complexity O(1)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int i,j=1;
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String p="";
		for(i=0;i<s.length();i++)
		{
		   if(i+1<s.length() && s.charAt(i)==s.charAt(i+1))
		   {
		       j++;
		   }
		   else{
		       
		       p=p+Integer.toString(j);
		       p=p+s.charAt(i);
		       j=1;
		      
		   }
		}
		System.out.println(p);
		
	}
}

