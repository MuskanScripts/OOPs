package lec1;


public class WrapperClasses {
    public static void main(String[] args) {
        int a = 10;
        int b = 200;
        swap(a, b);
        System.out.println(a + " " + b); // 10 200
        Integer num1 = 45; // 45 is object here
        Integer num2 = 46;
        swap(num1, num2);
        System.out.println(num1 + " " + num2); // 45 46 due to class it gives ref of its place but still not swapped
                                               // becuz
        // Integer class is having final keyword so we cant change its value
        // after typing num. we will be having many options with it as now it is an
        // object not a primitive data type anymore

        num1 = num1 + 1;
        System.out.println(num1); // here the output is changed
        // Final is a keyword which can prevent ur content to be modified

    }

    static void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }
}
/*
 * In Java, the Integer class is immutable and has the final keyword,
 * which means once an Integer object is created, its value cannot be
 * changed. However, when you perform operations like num1 = num1 + 1,
 * a new Integer object is created and assigned to num1. This is why
 * you can see num1 being modified.
 */

/*
 * final int Inc = 2;
 * we should always initialize an int while declaring it if we want to
 * use final keyword
 */

/*
 * final int s = 8 ;
 * s = s+10; //here it is giving me an error bcuz i cant modify the value of a
 * final int
 * System.out.println(s);
 */

 /*
  * final keyword gaurantees this immutability only when the instance variables 
  * are primitive data types and not the reference types of objects and stuff
  * bcuz if the instance var of  a ref type have final modifier behind it
  * the reference to the object will never change it will always refer to the same object
  * but the value of the object can change
  *
  * while final in ref type objects it will give error when we try to change the 
  * ref like  
  *
  * final Student kunal = new Student();
  * kunal.name = "new name";
  * kunal = otherObject ; //now this line saying that the ref var kunal is refering to some 
  * other object which will violate final keyword and it will give error here
  *
  * so i can say when a non primitive is final , you cannot reassign it
  */