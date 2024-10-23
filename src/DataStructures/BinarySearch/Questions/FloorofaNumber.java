package DataStructures.BinarySearch.Questions;

public class FloorofaNumber
{
    public static void main(OneQuestion[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int t=8;
        System.out.println(Floor(arr,t));
    }
    static int Floor(int[] arr,int t)
    {
        int s=0;
        int e=arr.length-1;

        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(t<arr[mid])
            {
                e=mid-1;
            }
            else if(t>arr[mid])
            {
                s=mid+1;
            }
            else {
                return mid;
            }
        }
        return e;
    }
}
