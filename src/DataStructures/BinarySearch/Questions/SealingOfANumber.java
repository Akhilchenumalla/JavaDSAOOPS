package DataStructures.BinarySearch.Questions;

public class SealingOfANumber
{
    public static void main(OneQuestion[] args) {
        int[] a={2,3,5,9,14,16,18};
        int t=17;
        System.out.println(ceiling(a,t));
        //ceiling of number means smallest element in array greater than or equal to the target element
        //ceiling(arr,target=15)==16 is the answer
    }
    static int ceiling(int[] a,int t)
    {
        int s=0;
        int e=a.length-1;

        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(t>a[mid])
            {
                s=mid+1;
            }
            else if(t<a[mid])
            {
                e=mid-1;
            }
            else
            {
                return mid;
            }
        }


        return s;
    }
}
