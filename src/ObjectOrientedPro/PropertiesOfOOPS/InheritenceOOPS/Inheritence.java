package ObjectOrientedPro.PropertiesOfOOPS.InheritenceOOPS;

public class Inheritence
{
    //parent or Base class which child class can use them
    //for example in base class
    //using extends keyword we can make connection with the parent or base
    //class child extends Base { int weight; }
    public static void main(String[] args) {
//        Box box1=new Box(4,5,6);
//        Box box2=new Box(box1);
//        System.out.println(box1.l+" "+box1.w+" "+box1.h);
//        System.out.println(box2.l+" "+box2.w+" "+box2.h);
        BoxWeight box3= new BoxWeight();
        System.out.println(box3.h+" "+box3.weight);
        BoxPrice box = new BoxPrice(2,3,4,6,7);
        System.out.println(box.cost);
        //Types of inheritence:
        //1.Single inheritence : one class extends the other class
        //2.multi level inheritence : box > box weight > box price which parent class have child class and then child
        //class have another child class
        //3.Multiple inheritence : is not there in java because the child have two parent class when we have both same
        //objects then there is error in child class when we use that object so java doesnot support in java
        //we can make changes in to use multiple by interface
        //4.Hieranchial Inheritence : One class is inherited by many class parent class have lot of child class
        //5:Hybrid Inheritence : it also not present in java because it consist of multiple inheritance(but we can use by interface)




    }
}
