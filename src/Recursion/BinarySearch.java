package Recursion;
import java.util.*;
public class BinarySearch
{
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5};
    }
    static int binary(int[] arr,int t,int s,int e)
    {
        if(s>e)
        {
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==t)
        {
            return m;
        }
        if(t<arr[m])
        {
            return  binary(arr,t,s,m-1);
        }
        else {
            return binary(arr,t,m+1,e);
        }

    }

    //variables : 1,arguments
    //2.return type
    //.body of funtion
    //binary search with recurssion

    //Types of recursions are
    //1.linear recursion relation
    //2.divide and conquer recursion relationship

}
