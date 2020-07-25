/*The string "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext" represents:

dir
    subdir1
        file1.ext
        subsubdir1
    subdir2
        subsubdir2
            file2.ext

The directory dir contains two sub-directories subdir1 and subdir2. subdir1 contains a file file1.ext and an empty second-level sub-directory subsubdir1. subdir2 contains a second-level sub-directory subsubdir2 containing a file file2.ext.

We are interested in finding the longest (number of characters) absolute path to a file within our file system. For example, in the second example above, the longest absolute path is "dir/subdir2/subsubdir2/file2.ext", and its length is 32 (not including the double quotes).


*/
// time complexity O(n)










class Solution {
    public int lengthLongestPath(String input) {
        int []a=new int[100];
        int max=0,i=0,l=0,j=0,flag=0;
        while(i<input.length())
        {
        
            if(input.charAt(i)=='\n' )
            {
                
                i++;
                j=0;
                while(input.charAt(i)=='\t')
                {
                    j++;
                    i++;
                }
       if(input.charAt(i)==' ' && input.charAt(i+1)==' ' &&input.charAt(i+2)==' ' &&input.charAt(i+3)==' '&&j==0)
                {
                    j++;
                    i=i+4;
                }
            
                    if(max<a[l]+l && flag==1)
                    {
                        max=a[l]+l;
                        System.out.println(a[l]+" hehe"+l);
                        flag=0;
                    }
                
                 
                l=j;
                if(l>0)
                {
                    a[l]=a[l-1];
                }
                if(l==0)
                {
                    a[0]=0;
                }
                
            }
            else
            {
                if(input.charAt(i)=='.')
                {
                    flag=1;
                }
                System.out.print(input.charAt(i));
                a[l]++;
                i++;
            }
            
        
        }
        for(i=0;i<26;i++)
        {
            System.out.print(a[i]+" ");
        }
        if(max<a[l]+l && flag==1)
        {
                max=a[l]+l;
                flag=0;
        }
                return max;
    }
}
