
package abstraction_inheritation_polimorphism;

abstract class Figure {
    double a,b;
    
    //Open constructor//
    Figure(double a,double b){
        this.a=a; 
        this.b=b;
    }
    //Close Constructor//
    
 
    abstract void area();
    
}
