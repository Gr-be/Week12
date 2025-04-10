/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.philsophers;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author glaba
 */
public class Philosopher extends Thread {

    int pID;
    TroughPosition troughposition;
    int timesEaten;

    public Philosopher(int id, TroughPosition position) {
        this.pID = id;
        this.troughposition = position;
        this.timesEaten = 0;

    }

    @Override
    public void run() {
        while(timesEaten<3){
        boolean attempt = troughposition.startEating(pID);
        
        if (attempt == false) {
            System.out.println("Philosopher " + pID + " is waiting. He has eaten " + timesEaten + " times.");
            while (attempt == false) {

                attempt = troughposition.startEating(pID);
                if (attempt == true) {
                    break;
                }
            }

        }
        
        if(attempt==true){
            timesEaten+=1;
        }

        try {
            Random random = new Random();
            int num = random.nextInt(1, 51);

            Thread.sleep(num);
        } catch (InterruptedException ex) {
        }
        
        }
        System.out.println(                                                     "Philosopher "+pID+ " has left the trough. "+ "He ate "+ timesEaten+ " times and is full.");
    }
}
