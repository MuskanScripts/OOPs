package lec3.Inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    public BoxPrice(){
        super();
        this.cost = -1;
    }
    public BoxPrice(double side ,double weight, double cost){
        super(side,weight);
        this.cost = cost;
    }
    public BoxPrice(double d, double e, double i, double weight, double cost) {
        super(d, e, i, weight);
        this.cost = cost;
    }
    
    public BoxPrice(double cost) {
        this.cost = cost;
    }

    public BoxPrice(BoxWeight other, double cost) {
        super(other);
        this.cost = cost;
    }
    public BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

}
