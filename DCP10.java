/*
Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.
*/
//time complexity O(1) and  space compleity O(1)
import java.util.Timer;
import java.util.*;

public class HelloWorld{
    
     public static void main(String []args){
         int i;
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         for(i=0;i<10;i++)
          {
         policy(new Command()
         {
     
        
        public void execute()
        {
        System.out.println("hello");

        }
    },1000);

     }
     }
     public static void policy(Command command,int n)
     {
             Timer t=new Timer();
             t.schedule(new TimerTask(){
                 
             public void run()
             {
                 command.execute();
             }},n);
         
     }    
     interface Command {
        public void execute();
    }
     
}
