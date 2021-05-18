
package abstraction_inheritation_polimorphism;

public class Circle extends Figure{
    
    //Open Constructor//
     Circle(double redius){
        super (redius,redius); 
    } 
     //Close Constructor//
    
    // Open Methood
     void area(){   
        double area=3.1416*a*b;    
        System.out.println("Inside Circle area is:"+area);
    }   //Close Methood
    
} 