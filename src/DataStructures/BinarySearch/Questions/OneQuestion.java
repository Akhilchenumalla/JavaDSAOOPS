package DataStructures.BinarySearch.Questions;

public class OneQuestion
{
    public static void main(String[] args)
    {
        char[] a={'c','f','j'};
        char t='j';
        int k=Answer(a,t);
        System.out.println(a[k]);
    }
    static int Answer(char[] a,char t)
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
                if(mid==a.length-1)
                {
                    return mid;
                }
                else {
                    return mid+1;
                }
            }
        }
        return s;
    }
}
