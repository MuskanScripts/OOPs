package lec1;

class A{
    final int a = 10;
    String name ;
    public A(String n ){
        // System.out.println("object created");
        this.name = n;
    }
@Override
protected void finalize() throws Throwable {
  // TODO Auto-generated method stub
  System.out.println("object destroyed");
}

}
public class GarbageCollector {
   
public static void main(String[] args) {

    A a ;
    for(int i = 0; i<1000000000 ; i++){
        a = new A("abc");
    }
}}
