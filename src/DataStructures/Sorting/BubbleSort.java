package DataStructures.Sorting;
import java.util.*;
public class BubbleSort
{
    public static void main(String[] args) {
        //sort means it should be in ascending or decending \
        //buble sort means it is sorting by step by step
        //by every pass we get the correct order at last of the array
        //for every pass we getting sorted at end so we can make a code so it we ignore because it
        //already sorted so it will make the the code upto the sorted element only
        //like second pass we will ignore the code last 2 elements
        //space complexity is O(1) // constant //no extra space is required
        //time complexity : Best case is O(N)  is sorted
        //worst case is O(N square) if sorted in opposite
        //* as the size of array is growing the time complexity also increases the no.of comparisions also increases
        //O(7N-Nsquare/2)==O(Nsquare)
        int[] a={1,2,3,5,4};
        bubble(a);
        System.out.println(Arrays.toString(a));
    }
    static void bubble(int[] arr)
    {
        boolean swapped;
        //run the steps n-1 times
        for(int i=0;i<arr.length;i++)
        {
            swapped = false;
            //for each step,max item will come at  the last respective index
            for(int j=1;j<arr.length-i;j++)
            {
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1])
                {
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped= true;


                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if(swapped==false)
            {
                break;
            }
        }
    }
}
