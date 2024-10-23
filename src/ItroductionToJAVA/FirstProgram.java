package ItroductionToJAVA;

import java.util.Scanner;

public class FirstProgram
{
    // in java main class is important for run the code
    //static is used because we want to run this main method without creating the object of the class FirstProgram
    //void is the return from methods(in this we no need to return any thing)
    public static void main(String args[])
    {
        System.out.println("hello world");
        //for displaying some thing the java developers created in simple language is system.out.println
        System.out.println("l");
        Scanner s=new Scanner(System.in);//system.in means take input from the keyboard
        int rollno=64;//s.nextInt();
        String name="Kunal";//s.nextLine();
        char l='a';
        float marks =98.2f;//s.nextFloat();
        double largedecimalnumber = 444464.7676;
        long largeinteger = 766747474476467L;
        boolean check=false;
        s.nextBoolean();
        s.next();

        //typecasting
        int num =(int)(76.45f);

        //java is unique code

    }
}