package Arrays;
import java.util.*;
public class Arrays
{
    public static void main(String[] args) {
        //store a roll numbers
        int a=10;

        //store a persons name
        String name ="linl";

        //arrays collection of same data type
        //syntax
        //datatype[] ref = new datatype[size];

        //store 5 roll numbers;
        int[] rnos = new int[5];
        //or directly
        int[] rons2 ={3,2,5,6};

        int[] ros;//declaration of array.ros  is getting defined in the stack(complile time)
        ros = new int[5];// initializaton actually here object is being created in this & it run at runtime(dynamic memory)
        //heap objects are not continuos
        //dynamic memory collection
        //internally arrays may not be continous --- depends on jvm\
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
        int[] arr={1,2,3,4}; //new int[n];
//        for(int i=0;i<n;i++)
//        {
//            arr[i]=s.nextInt();
//        }
//        System.out.println(arr);
        for(int ni : arr)
        {
            System.out.print(ni+" ");
        }

    }
}
