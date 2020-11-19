/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismandencapsulation;

import java.util.Scanner;

    public class protonPersona extends proton {
    
    String bigBoot;
    String fuel;
    private String radio;
    private String key = "remote";
 
     protonPersona(){ // first default constructor
        System.out.println("Please enter boot space: ");
        Scanner in = new Scanner(System.in);
        String boot = in.next();
        
        this.bigBoot = "Spaces"; //this refer to object detail
        this.fuel = "Diesel";
        this.bigBoot = boot;
    }
        
  public void boot(){
    System.out.println("This car got big boot space "+bigBoot);

    }
  public void fuels(){    
        System.out.println("This car use fueld " + fuel);
    }

    public String getRadio(){
    return radio;
    }

    public void setRadio(String myRadio){
    this.radio = myRadio;
    }

    public String getKey(){
    return key;
    }
    
    void run(){
       System.out.println("Proton Persona is running safely");
    }
   }

    

