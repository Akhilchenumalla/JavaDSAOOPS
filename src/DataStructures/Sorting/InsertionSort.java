package DataStructures.Sorting;
import java.util.*;
public class InsertionSort
{
    public static void main(String args[])
    {
        int[] arr={5,4,2,3,1,6};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        //for every index: put that index element at the correct index of left hand side;
        //After 1st pass i=0 for example 5,3,4,1,2 then 5,3 will sort then
        //in 2nd pass 3,5,4 will sort then continue like that
        //complexity : worst case : O(Nsquare)
        //best case : O(N)
        //why use it?
        //adaptive : steps get reduced if array is sorted no.of swaps reduced as compared to bubble sort
        //* stable
        //used for smaller values of N == works good which is array is partially sorted == it takes part in hybrid soring algorithms.


    }
    static void insertion(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
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
