/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiments;

/**
 *
 * @author Alex
 */
public class Experiments {

   
    public static void main(String[] args) {
     Fruit[] fruit = new Fruit[3];
     fruit[0] = new Kiwi();
     fruit[1] = new Apple();
     fruit[2] = new Banana();
     
     for(Fruit a: fruit) {
         
         a.Taste();
     }
     Trip fun = new Trip();
     
     fun.AirportExcursion();
     
     
     
    }
    
}
