
package abstraction_inheritation_polimorphism;

public class text {
    
    
    //Crete Main Methood//
    public static void main(String[] args){
        Figure figuref; // reference veriable
        
        figuref = new Rectangle(15, 20); 
            figuref.area(); 
            
            figuref = new Circle (13);  
            figuref.area(); 
            
            figuref = new Triangle(15, 20); 
            figuref.area(); 
    } //Close Main Methood//
    
}
