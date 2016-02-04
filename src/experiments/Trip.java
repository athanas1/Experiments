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
public class Trip {
    
    
    
    public void AirportExcursion(){
        PurchaseTicket();
        Packed();
        DriveToAirport();
        TakeOff();
        Arrive();
        
    }

    private void PurchaseTicket() {
        System.out.println("I have purchased a Ticket");
    }

    private void TakeOff() {
        System.out.println("We have taken off");
    }

    private void Packed() {
        System.out.println("I have packed my stuff");
    }

    private void DriveToAirport() {
        System.out.println("I have driven to airport");
    }

    private void Arrive() {
        System.out.println("I have arrived at my location");
    }
}
