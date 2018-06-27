package com.examle.ex4_vitaly.map;

import com.examle.ex4_vitaly.util.Utility;

public class MapTask {

    private static final int N = 5;
    private static MapTask instance;

    public static MapTask getInstance() {

        if (instance == null)
            instance = new MapTask();

        return instance;
    }

    public void map() {
        MapImpl map = new MapImpl();
        map.fillMap(N);
        map.outputKeySet();
        map.outputValueCollection();
        map.outputEntrySetMap();
    }

    public void mapIterator() {
        MapImpl map = new MapImpl();
        map.fillMap(N);
        map.outputEntrySetMap();
        int ageOfBean =  map.removeEntryIterator(Utility.randInt(N));
        System.out.println("Delete bean with age: " + ageOfBean);
        map.outputEntrySetIterator();
    }

}
