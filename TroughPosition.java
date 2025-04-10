/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.philsophers;

import static java.lang.Math.random;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author glaba
 */
public class TroughPosition {

    int id;
    int pos1;
    int pos2;
    int pos3;
    boolean someoneFeeding;

    public TroughPosition(int id, int pos1, int pos2) {
        this.id = id;
        this.pos1 = pos1;
        this.pos2 = pos2;
        this.pos3 = -1;
        this.someoneFeeding = false;
    }

    public TroughPosition(int id, int pos1, int pos2, int pos3) {
        this.id = id;
        this.pos1 = pos1;
        this.pos2 = pos2;
        this.pos3 = pos3;
        this.someoneFeeding = false;
    }

    public boolean startEating(int id) {

        if ((someoneFeeding == false) && (id == pos1 || id == pos2 || id == pos3)) {
            this.someoneFeeding = true;

            System.out.println("Philosopher " + id + " has started eating");

            Random random = new Random();
            int eatingDuration = random.nextInt(1, 101);

            try {
                Thread.sleep(eatingDuration);
            } catch (InterruptedException ex) {
                Logger.getLogger(TroughPosition.class.getName()).log(Level.SEVERE, null, ex);
            }
            finishEating();
            System.out.println("Philosopher " + id + " has finished eating");
            return true;
        }
        else{

        return false;
}
    }

    public void finishEating() {
        this.someoneFeeding = false;
    }

}
