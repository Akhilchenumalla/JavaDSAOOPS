package FuntionsAndMethods;
import java.util.*;
public class VarArgs
{
    public static void main(String[] args) {
        fun(1,2,3,4,4,5);
    }
    static void fun1(int a,int b,int ...v){

    }
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));

    }
}
