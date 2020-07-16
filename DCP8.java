
/*Good morning! Here's your coding interview problem for today.

This problem was asked by Google.

A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

Given the root to a binary tree, count the number of unival subtrees.

For example, the following tree has 5 unival subtrees:

   0
  / \
 1   0
    / \
   1   0
  / \
 1   1


*/


// solved in binary search.io
//time complex O(nlogn) and space complexity O(1)


import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    int c=0;
    
    public boolean univ(Tree root)
    {
        if(root==null)
        {
            return true;
        }
        if(root.left!=null && root.left.val!=root.val)
        {
            return false;
        }
        if(root.right!=null && root.right.val!=root.val)
        {
            return false;
        }
        if(univ(root.right) && univ(root.left))
        {
         return true;   
        }
        return false;

    }
    public int solve(Tree root) {
        // Write your code here
        if(root==null)
        {
            return 0;
        }
        solve(root.left);
        solve(root.right);
        if(univ(root))
        {
            c++;
        }
           return c;
        }
        
    
    
}

