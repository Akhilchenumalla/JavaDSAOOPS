package DataStructures;

import java.util.*;
public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        //linear searching is a type of searching which done linearly
        //find wheather 14 exits in array or not
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int f=s.nextInt();
        //Time complexity : O(N) which is worst case
        //in linear the best case is element found at 0th index its time complexity is O(1)
        //time complexity depends on the possible scenerio and size also not depend



    }
}
