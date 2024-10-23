package DataStructures.Sorting;
import java.util.*;
public class CycleSort
{
    public static void main(String args[])
    {
        int[] a={6,5,4,3,2,1,7,8};
        cycle(a);
        System.out.println(Arrays.toString(a));
        //cycle sort we use only one for loop in one pass only
        //*when given numbers from range 1,N == use cyclic sort (very important);
        // index = value -1 for example array is{3,5,2,1,4} to  {1,2,3,4,5} after sorting
        //worst case is O(2N-1) == O(N)
    }
    static void cycle(int[] a)
    {
        int i=0;
        while(i<a.length)
        {
            int correct =a[i]-1;
            if(a[i] != a[correct])
            {
                swap(a,i,correct);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }















}
