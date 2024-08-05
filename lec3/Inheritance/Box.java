package lec3.Inheritance;

public class Box {
   
    double l;
    double w;
    double h;

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    Box(double side) {
        this.h = side;
        this.l = side;
        this.w = side;
    }

    public Box(double d, double e, double i) {
        this.l = d;
        this.w = e;
        this.h = i;
    }

    public Box(Box old) {
        this(old.l, old.w, old.h);
    }

    /*
     * passing on the things from parents to children
     * In terms of classes we can say if there is a classes which is able to
     * use the properties and stuff using extends keyword after child class
     * class child extends Base {
     * int weight; //including base class prop + weight
     * //we have to initialize parents class variables also
     * }
     */

}
