package lec1;
//class is a named group of properties and functions
//class starts with capital letter by convention
//i can create my own data type using classes

/*class is just a logical construct and object is a 
 * phsical reality which is actually occupying 
 * space in memory */


 // dot operator is used to access any instance variable

 //instance variable which are declared outside the main inside the class
/**
 * Student
 * 
 */
// create a class
class Student {
    int rollno ; //it has default value 0
    String name ; // it has default value null
    float marks ; //it has default value 0.0
    public Student(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
//   Student() {
//        this.rollno = 45 ; 
//        this.name = "Kunal";
//        this.marks = 56.9f; 
//     }
    Student(){
        //this is how u call a constructor from another constructor
        this(89, "Muskan", 69.0f);
    }
    

    /*We need a ways to add the value of the above properties object by object
     * means they should be diffrent for a particular object
     * 
     * We need one word to access every object
     * 
     * to access we will have this keyword
     */
    void greeting(){
        System.out.println("hey its me " + name);
    }
     
}

public class Main {
    public static void main(String[] args) {
      
        Student kunal = new Student();
        kunal.rollno = 40;
        kunal.name = "Kunal Khushwaha";
        kunal.marks = 96.4f;

        Student one = new Student();
        Student two = one;
        one.name = "Muski";
        System.out.println(two.name); //Muski
        
        

 
/*  If i write here that 
 * sout(Arrays.toString(k)); 
 * output = [null,null,null,null,null,null,null];
*/
// "this" tells which object u r referencing to

    }

}
//why we dont use new keyword for creating primitive data types
//objects are stored in heap memory
//primitives are stored in stack memory only
//in java primitive data types are not stored in heap






