package DataStructures.Sorting;
import java.util.*;
public class MissingNumbers
{
    public static void main(String args[])
    {
        int[] a={1,2,3,6,5};
        cycle(a);
        System.out.println(Arrays.toString(a));
    }
    static void cycle(int[] a)
    {
        int i=0;
        while(i<a.length)
        {
            int correct = a[i];
            if(a[i]!=a[correct])
            {
                
            }
        }
    }
}
