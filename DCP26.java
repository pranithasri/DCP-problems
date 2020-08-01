/*Given a singly linked list and an integer k, remove the kth last element from the list. k is guaranteed to be smaller than the length of the list.

The list is very long, so making more than one pass is prohibitively expensive.*/

//time complexity O(M-k) no space complexity



import java.util.*;

class Node
{
int a;
Node l;

Node(int data)
{

this.a=data;

}
}


class DCP1
{
  static Node solve(Node h1,int M,int k)
  {
    Node prev=h1;
    Node ini=h1;  
    int i;
     for(i=0;i<M-k;i++)
     {
       prev=h1;
       h1=h1.l;
     }
     prev.l=h1.l;
     h1.l=null;
     return ini;
  }
  
static void Display(Node h1)
{
while(h1!=null)
{
System.out.println(h1.a);
h1=h1.l;
}
}
 public static void main(String []args)
{
  int i,M,k;
  Scanner sc=new Scanner(System.in);
  Node h1=null;
  Node h2=null;
  
  System.out.print("enter M");
  M=sc.nextInt();
  System.out.print("enter K");
  k=sc.nextInt();
  System.out.print("enter elements for first array");
  for(i=0;i<M;i++)
  {
    Node n1=new Node(sc.nextInt());
    
    if(h1==null)
    {
      
      h1=n1;
      h2=n1;
      

    }
  else
  {
   h2.l=n1;
   h2=n1;
  }  
  }
  
  Display(h1);
  System.out.println("---------");
 Display(solve(h1,M,k));
}


}
