package ConditionalsANDLoops;

import java.sql.SQLOutput;

public class Loops
{
    public static void main(String[] args) {
        /*
        Syntax of for loops

        for(int num=1;num<5;num++)
        {
        //body
        }
         */
//        for(int n=0;n<8;n++)
//        {
//            System.out.println(n);
//        }
//        int n=0;
//        while(n<8)
//        {
//            System.out.println(n);
//            n++;
//        }
        //when we donot know how many times the loops will run then we use while loop

        //do while
        /*
        do{ while condition;
        }
         */
        int n=1;
        do
        {
            System.out.println(n);
            n++;
        }while(n<0);

    }
}
