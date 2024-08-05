package lec3.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        super();
        this.weight = -1;
    }
//below constructor is autogenerated
    public BoxWeight(double d, double e, double i, double weight) {
        super(d, e, i);
        this.weight = weight;
    }

    //copy constructor
    BoxWeight(BoxWeight other){
        super(other);
       this.weight= other.weight;
    }
    /*
     * public BoxWeight(double l, double w, double h, double weight) {
     * this.l = l;
     * this.h = h;
     * this.w = w;
     * this.weight = weight;
     * }
     * 
     * We can write the above code also as
     * 
     * public BoxWeight(double l, double w, double h, double weight) {
     * 
     * 
     * super(l,w,h); //what is this ?  call the parent class constructor
     * super is used to initialise values present in parent class constructor
     * it will not access the private ones
     * 
     * 
     * this.weight = weight;
     * }
     * 
     * 
     * parent can't access child properties
     */
    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight ;

    }

     /*
      * SUPER
      * when the child class needs to refers to the super class from which it is derived
      * it we want to explicitly refer something in the parent class then we need to use SUPER
      */
}
