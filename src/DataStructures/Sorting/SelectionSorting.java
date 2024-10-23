package DataStructures.Sorting;
import java.util.*;
public class SelectionSorting
{
    public static void main(String[] args) {
        //selection sort will swapped with correct index
        int[] a={9,2,3,11,0,6};
        selection(a);
        System.out.println(Arrays.toString(a));
        //total comparisions n(n-1)/2 == O(Nsquare) time complexity worst and best case is O(Nsquare)
        //use cases: it porforms well in small lists/arrays
    }
    static void selection(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            //find the max item in the remaining array and swap with correct index
            int last = a.length -i-1;
            int maxIndex = getMaxIndex(a,0,last);
            swap(a,maxIndex,last);

        }
    }
    static void swap(int[] arr, int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    private static int getMaxIndex(int[] arr,int s, int end )
    {
        int max = s;
        for(int i=s;i<=end;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
}
