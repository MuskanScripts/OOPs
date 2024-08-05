package lec3.Inheritance;

public class Main {
    public static void main(String[] args) {
        // Box b = new Box(2.4, 1.0, 1);
        // Box x1 = new Box(43.5);
        // System.out.println(x1.h + " " + x1.w + " " + x1.l);

        // BoxWeight bb = new BoxWeight();
        // System.out.println(bb.h + " " + bb.l + " " + bb.w + " " + bb.weight);
        // BoxWeight b3 = new BoxWeight(1, 2, 3, 4);

        Box box5 = new BoxWeight(1, 2, 3, 4);
        // System.out.println(box5.weight); it will give error bcuz we can't access it as we are taking the refrence as a Box class
        // There are many variables in both parent and child classes and you are given access to variables that are in the ref type i.e. BoxWeight
     
        // BoxWeight b6 = new Box(1, 02, 03);
        // this is giving error as the reference is of type BoxWeight so means i can access weight which means it should be initialised 
        // but here , when the obj itself is of type parent class , then how will you call the constructor of child class so it is giving error
        // so we cant do that child ref var and parent type object

        /*
         * in the above line box5 is a reference var which is refering to something of
         * Box class
         * but we created here an object of class Box weight
         * 
         * This works due to the concept of polymorphism. When you assign an object of a
         * subclass to a reference variable of the superclass, the reference variable
         * can only access the properties and methods defined in the superclass.
         * 
         * However, the actual object that exists in memory is of the subclass type
         * (BoxWeight in this case), and it has all the properties and methods of both
         * the superclass (Box) and the subclass (BoxWeight).
         * 
         * Box box5 = new BoxWeight(1, 2, 3, 4); creates an object of type BoxWeight but
         * references it using a Box variable.
         * key points
         * 1. You can only call methods available in the Box class using box5 directly.
         * 2. To access methods specific to BoxWeight, you need to cast box5 to
         *    BoxWeight.
         * 3. This use of polymorphism allows for more flexible and reusable code, as
         *    youcan work with objects of different types through a common interface.
         */
    }

}
