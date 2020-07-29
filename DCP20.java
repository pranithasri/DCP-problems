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


class DCP
{
  static int solve(Node h1,Node h3,int M,int N)
  {
    int i;
     for(i=0;i<M-N;i++)
     {
       h1=h1.l;
     }
     for(i=0;i<M;i++)
     {
       if(h1.l==h3.l)
       {
         break;
       }
       h1=h1.l;
       h3=h3.l;
     }
     return h1.l.a;
  }
  
static int Display(Node h1)
{
while(h1!=null)
{
System.out.println(h1.a);
h1=h1.l;
}
return 1;
}
 public static void main(String []args)
{
  int i,j,N,M,C;
  Scanner sc=new Scanner(System.in);
  Node h1=null;
  Node h2=null;
  Node h3=null;
  Node h4=null;
  System.out.print("enter M");
  M=sc.nextInt();
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
  System.out.println("enter N-C");
  N=sc.nextInt();
  System.out.print("enter elements for second array");
  for(i=0;i<N;i++)
  {
    Node n1=new Node(sc.nextInt());
    if(h3==null)
    {
      
      h3=n1;
      h4=n1;
      

    }
  else
  {
   h4.l=n1;
   h4=n1;
  }  
  }
  Display(h1);
  System.out.println("=======");
  Display(h3);
  System.out.print("enter common elements");
  C=sc.nextInt();
  for(i=0;i<C;i++)
  {
    Node n1=new Node(sc.nextInt());
   
   h2.l=n1;
   h4.l=n1;
   h2=n1;
   h4=n1;
    
  }


  Display(h1);
  System.out.println("=======");
  Display(h3);
  System.out.println("=======");
  
 System.out.println(solve(h1,h3,M,N));
}


}
