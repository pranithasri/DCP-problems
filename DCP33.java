import java.io.*;
import java.math.*;
import java.util.ArrayList;
import java.util.Collections;

/*Compute the running median of a sequence of numbers. That is, given a stream of numbers, print out the median of the list so far on each new element.

Recall that the median of an even-numbered list is the average of the two middle numbers.

For example, given the sequence [2, 1, 5, 7, 2, 0, 5], your algorithm should print out:*/
public class Solution {

    /*
     * Complete the runningMedian function below.
     */
    static double[] runningMedian(int[] a) {
        /*
         * Write your code here.
         */
         double []b=new double[a.length];
         int i;
         ArrayList<Double> s = new ArrayList<>();
         for(i=0;i<a.length;i++)
         {
             s.add((double)a[i]);
             Collections.sort(s);
             if(s.size()%2==0)
             {
                 System.out.println(s.get(s.size()/2)+" "+s.get(s.size()/2-1));
                 b[i]=(s.get(s.size()/2)+s.get(s.size()/2-1))/2;
             }
             else
             {
                 System.out.println(s.get(s.size()/2));
                 b[i]=s.get(s.size()/2);
             }
         }
         return b;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(scanner.nextLine().trim());

        int[] a = new int[aCount];

        for (int aItr = 0; aItr < aCount; aItr++) {
            int aItem = Integer.parseInt(scanner.nextLine().trim());
            a[aItr] = aItem;
        }

        double[] result = runningMedian(a);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}

