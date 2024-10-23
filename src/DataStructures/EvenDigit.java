package DataStructures;
import java.util.*;
public class EvenDigit
{
    public static void main(String[] args) {
        int[] nums={1890,1247,9200,1764,9800};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            if(even(num)==true)
            {
                count++;
            }

        }

        return count;
    }
    static boolean even(int num)
    {
        if(digit(num)%2==0)
        {
            return true;
        }
        return false;

    }
    static int digit(int num)
    {
        String digit = ""+num;

        return digit.length();
    }



























}
