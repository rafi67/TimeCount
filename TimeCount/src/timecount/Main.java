/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timecount;

import Time.TimeCount;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TimeCount tm = new TimeCount();
        TimeCount tm2 = new TimeCount(2,30,45);
        TimeCount tm3 = new TimeCount(tm2);
    }
    
}
