
package abstraction_inheritation_polimorphism;

public class Rectangle extends Figure {
    
    //Open Constructor//
    Rectangle(double a,double b){
        super (a,b);
    }
     //Close Constructor//
    
    void area(){  //Crete Override Methood.
        double area=a*b;
        System.out.println("Inside Rectangle area is:"+area);
    }
}
