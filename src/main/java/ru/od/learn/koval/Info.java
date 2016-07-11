package ru.od.learn.koval;

/**
 * Created by Валерий on 11.07.2016.
 */
public final class Info {
    int hour;
    double value;

    public  void setHour(int newHour){
        hour = newHour;
    }
    public  void setValue(double newValue){
        value = newValue;
    }
    public void getElement(){
        System.out.println(hour + "***" + value);
    }
}
