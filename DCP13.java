/*
This problem was asked by Google.

The area of a circle is defined as πr^2. Estimate π to 3 decimal places using a Monte Carlo method.

Hint: The basic equation of a circle is x2 + y2 = r2.

*/
//time complexity depends on more iterations you make more accurate result is obtained 

import java.util.*; 
public class pivalue{

     public static void main(String []args){
        Random rand=new Random();
        double c=0,s=0,it=1000,i;
        double x,y,pi=0;
        for(i=0;i<it*100;i++)
        {
            
             x=rand.nextDouble();
             y=rand.nextDouble();
             if(x*x+y*y <1)
             {
                 c=c+1;
             }
             s=s+1;
             pi=4*c/s;
             

        }
        System.out.println(pi);
        
     }
}