/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.philsophers;

/**
 *
 * @author glaba
 */
public class Feeding {
    public static void main(String[] args) {

    TroughPosition[] position=new TroughPosition[4];
    
        
             TroughPosition trp1=new TroughPosition(1, 1, 2, 9);
             TroughPosition trp2=new TroughPosition(2, 3, 4);
             TroughPosition trp3=new TroughPosition(3, 5, 6);
             TroughPosition trp4=new TroughPosition(4, 7, 8, 10);
             
             position[0]=trp1;
             position[1]=trp2;
             position[2]=trp3;
             position[3]=trp4;
             
             Philosopher p1=new Philosopher(1, trp1);
             
             Philosopher p2=new Philosopher(2, trp1);
             
             Philosopher p3=new Philosopher(3, trp2);
             
             Philosopher p4=new Philosopher(4, trp2);
             
             Philosopher p5=new Philosopher(5, trp3);
             
             Philosopher p6=new Philosopher(6, trp3);
             
             Philosopher p7=new Philosopher(7, trp4);
             
             Philosopher p8=new Philosopher(8, trp4);
             
             Philosopher p9=new Philosopher(9, trp1);
             
             Philosopher p10=new Philosopher(10, trp4);
            
         Philosopher[] philosophers=new Philosopher[10];
         
         philosophers[0]=p1;
         philosophers[1]=p2;
         philosophers[2]=p3;
         philosophers[3]=p4;
         philosophers[4]=p5;
         philosophers[5]=p6;
         philosophers[6]=p7;
         philosophers[7]=p8;
         philosophers[8]=p9;
         philosophers[9]=p10;
         
        
            for(Philosopher ph: philosophers){
                    
                
                
                
                ph.start();
            
                
                
            }
        
        
    }

}
