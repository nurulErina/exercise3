/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismandencapsulation;

public class proton {
    
    String brand,windows,headLight;
    int tyreSize;
    
    
    proton(){
        this.brand = "Dunlop";
        this.tyreSize = 17;
    }
    
    proton(String w, String h){
        this.windows = w;
        this.headLight = h;
    }
    
    
    public void printProton(){
        proton obj1 = new proton();
        proton obj2 = new proton("Up", "On");
        proton obj3 = new proton("Down", "Off");
        
        System.out.println("Tyre brand: " +obj1.brand+ "\nTyre size: " +obj1.tyreSize);
        System.out.println("Windows: " +obj2.windows+ "\nHeadlight: " +obj2.headLight);
        System.out.println("Windows: " +obj3.windows+ "\nHeadlight: " +obj3.headLight);
    }
    
    //method overloading
    void sum(int base, long standard){
     
     System.out.println(base+standard);
    }
    //defining a method for Polymorphism
    void sum(int base, int executive, int premium){
        System.out.println("Vehicle is running");
    }
    
    void colour(String colour){
        System.out.println("Type colour car: " +colour);
    }
    
   
 }
    

