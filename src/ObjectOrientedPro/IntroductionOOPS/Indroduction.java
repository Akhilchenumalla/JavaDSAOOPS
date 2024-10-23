package ObjectOrientedPro.IntroductionOOPS;

public class Indroduction {
    public static void main(String args[]) {
        //data of 5 students:{roll,name,marks} this is were we use clases and object oriented programming
        //what is class: a class is a named group of properties and functions and class is starts with capital word
        //ex: Student[] students=new Students[5];
       // Student[] student = new Student[5];

        Student kunal = new Student(1,"hlo",99.8f);
        System.out.println(kunal.name);

        //wrapper class
        Integer num=new Integer(45);
        //it is final keyword we cannot change the value
        //if we use final keyword we need to use capital word
        final int INCREASE =2;
        //ALWAYS Intialize while declaring.
        //we can change the value in non-primitive data type and you cannot reassign it

        Student obj=new Student(1,"hello");
        System.out.println(obj);
        //it prints as ObjectOrientedPro.Student@4dd8dc3 packagename.objname@somerondamnumber



    }
}
    //create a class
class Student
    {
        int rno;
        String name;
        float marks;

//        Student()
//        {
//            this.rno=3;
//            this.name="ff";
//
//        }
        Student(int rno,String name)
        {
            this.rno=rno;
            this.name=name;
        }
        Student(int rno,String name,float marks)
        {
            this.rno=rno;
            this.name=name;
            this.marks=marks;
        }



        Student()
        {
            //constructor calling constructor
            //internally Student(13,"",100.3f);
            this(13,"default person",100.3f);
        }
    }
    //class-logical construct
    //object--physical reality//occupies space in memory
    //objects are categorize into three
    //1.state of object
    //2.identity of object
    //3.behavarial of object


    //how to do diffirent objects using the class templete
    //new keyword will make the object
    //dot(.) will contect with the object to instance variables ex:sot(Student1.rnoll)

    //new keyword: dynamically allocates memory and returns a refernce to it;
    //we cannot access address in java program

    //what is Student(); in Student n=new Student();
    //Student n;: This declares a reference variable n of type Student.
    //new Student();: This creates a new instance (object) of the Student class using its constructor.
    //The Student() part is a call to the constructor of the Student class.



    //What is Constructor
    //it is type of function
    //it is special function that runs when you create a object and it allocates some variables






















































