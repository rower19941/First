package ru.od.learn.koval;
import ru.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Валерий on 11.07.2016.
 */

public class Box {
    String name;
    List <Info> list = new ArrayList<Info>();

    public void FillRandom(){
        for (int i = 0; i < list.size(); i++){
            Info info = new Info();
            info.setHour(i);
            info.setValue(Math.random());
            list.add(i,info);
        }
    }
}
