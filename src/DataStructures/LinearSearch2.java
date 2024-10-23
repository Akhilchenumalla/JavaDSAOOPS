package DataStructures;

public class LinearSearch2 {
    public static void main(String[] args)
    {
        int[] arr={};
        int t=79;
        System.out.println(linearSearch(arr,t));


    }

    static int linearSearch(int[] arr, int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            int e=arr[i];
            if(e==target)
            {
                return i;
            }
        }
        return -1;
    }
}
