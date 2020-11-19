/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismandencapsulation;

public class protonSaga extends proton {
    
    String fuel;
    
    private String seats;
    private String accessories = "Tinted windows";
    
    protonSaga(){
        this.fuel = "Diesel"; //this refer to object detail
         
    }
    
    public void fuel(){
        System.out.println("This car use fuel " +fuel);
     
    }
      
    
     public String getSeat(){
    return seats;
    }

    public void setSeat(String mySeat){
    this.seats = mySeat;
    }
    
    public  String getItems(){
      return accessories;
        
    } 
    
     void run(){
       System.out.println("Proton Saga is running safely");
    }
}
    

