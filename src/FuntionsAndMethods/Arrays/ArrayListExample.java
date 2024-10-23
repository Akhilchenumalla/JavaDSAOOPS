package Arrays;
import java.util.*;
public class ArrayListExample
{
    public static void main(String[] args)
    {
        //Syntax
       // ArrayList<ArrayList<Integer>> list =new ArrayList<>(); //for multiArraylist
        Scanner s=new Scanner(System.in);
         ArrayList<Integer> list = new ArrayList<>();

//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
        for(int i=0;i<5;i++)
        {
            list.add(s.nextInt());
        }

        /*
        internally size is fix
        but say arraylist size is fixed is 3 then the array is filled
        then the array size fill be double (maybe it works like that),
         */

        System.out.println(list);
    }
}
