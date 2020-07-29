import java.util.*; 
  

/*This problem was asked by Snapchat.

Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find the minimum number of rooms required.

For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.*/
class Pair { 
    int x; 
    int y; 
  
public Pair(int x, int y) 
    { 
        this.x = x; 
        this.y = y; 
    } 
} 

class Compare { 
  
    static void compare(Pair arr[], int n) 
    { 
        
        Arrays.sort(arr, new Comparator<Pair>() { 
            @Override public int compare(Pair p1, Pair p2) 
            { 
                return p1.y - p2.y; 
            } 
        }); 
    } 
} 
  
class DCP{ 
  
public static void main(String[] args) 
    { 
        int i,n,c=0,j,t;
       
        Scanner sc = new Scanner(System.in); 
        n= sc.nextInt();
        int []a=new int[n];
        Pair arr[] = new Pair[n];
        for(i=0;i<n;i++)
        { 
  
        arr[i] = new Pair(sc.nextInt(), sc.nextInt()); 
        }
  
        Compare obj = new Compare(); 
  
        obj.compare(arr, n); 

        a[0]=arr[0].y;
        t=0;
        c=1;
        for(i=1;i<arr.length;i++)
        {
            
           
                for(j=0;j<=t;j++)
                {
                    if(a[j]>arr[i].x)
                    {
                        if(a[j]<arr[i].y)
                        {
                            c++;
                            break;
                        }
                    }
                    
                
            }
        }
        System.out.println(c);

  
    } 
    
}