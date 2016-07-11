package ru.od.learn.koval;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Валерий on 11.07.2016.
 */

public class Box {
    String name;
    int arraySize;
    List <Info> list = new ArrayList<Info>();

    public void FillRandom(){
        for (int i = 0; i < 24/*list.size()*/; i++){
            Info info = new Info();
            info.setHour(i);
            info.setValue(Math.random());
            list.add(i,info);
        }
    }
    public void GetList(){
        for (int i = 0; i < 24/*list.size()*/; i++){
            list.get(i).getElement();
        }
    }

    public static void main(String[] args) {
        Box test = new Box();
        test.FillRandom();
        test.GetList();
    }
}
