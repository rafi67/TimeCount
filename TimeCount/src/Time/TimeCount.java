/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Time;

/**
 *
 * @author rafis
 */
public class TimeCount {
    int hour, minute, second;
    public TimeCount() {
        hour = 7;
        minute = 52;
        second = 55;
        Print();
    }
    
    public TimeCount(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
        Print();
    }
    
    public TimeCount(TimeCount tm){
        hour = tm.hour;
        minute = tm.minute;
        second = tm.second;
        Print();
    }
    
    void Print() {
        System.out.println(hour+":"+minute+":"+second);
    }
}
