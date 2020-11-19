/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismandencapsulation;


public class protonX50 extends proton {
   
    String autoParking;
    private String colour = "Oncean Blue";
    private String boot;
 
    
    protonX50(){
        this.autoParking = "On"; //this refer to object detail
       
    }
    
    public void autoPark(){
        System.out.println("This car got big boot " +autoParking);
    }
    
    void run(){
       System.out.println("Proton X50 is running safely");
    }
    
     public String getBoot(){
    return boot;
    }

    public void setBoot(String myBoot){
    this.boot = myBoot;
    }

    public String getColour(){
        return colour;
   
    }
   }
