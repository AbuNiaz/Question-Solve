
package abstraction_inheritation_polimorphism;

public class Triangle extends Figure {
    
    //Open Constructor//
    Triangle(double a,double b){
        super (a,b);
    } //Close Constructor//
    
    void area(){  
        double area=a*b/2;
        System.out.println("Inside Triangle area is:"+area);
    }
    
}
