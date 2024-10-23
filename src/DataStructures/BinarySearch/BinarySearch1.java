package DataStructures.BinarySearch;
import java.util.*;
public class BinarySearch1
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        //used for sorted arrays or we make it sort, ascending or descending order
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int m=s.nextInt();
        //1.find the middle element
        //2.target>mid = search in the right else search in left
        //3.if middle element == target element //answer
        // we need to make a code which increases the middle element and start and end so it covers the total array
        //best case time complexity it is constant O(1)
        //worst case k=log(2)N == O(log(N))
        //for examples  in linear it takes 1millions then in binary search it takes 20 only this is difference

        System.out.println(binarySearch(a,m));

    }
    static int binarySearch(int[] arr,int target)
    {
        int start =0;
        int end =arr.length-1;

        //Order-Agnostic
        boolean isAsc = arr[start]<arr[end];


        while(start <= end)
        {
            //find the middle element
            int mid = start + (end - start )/2; //because if we add start and end then it may exceed the int number;

            if(target < arr[mid])
            {
                end = mid -1;
            }
            else if (target > arr[mid])
            {
                start = mid +1;
            }
            else
            {
                return mid;
            }

        }
        return -1;
    }




















}
