package com.examle.ex4_vitaly;

import com.examle.ex4_vitaly.list.ListTask;
import com.examle.ex4_vitaly.map.MapTask;
import com.examle.ex4_vitaly.set.SetTask;

public class Main {

    public static void main(String[] args) {
//        testTime();
        listTask();
        setTask();
        mapTask();
    }

    private static void listTask() {
        ListTask listTask = ListTask.getInstance();

        System.out.println("========== Enumeration ========");
        listTask.enumeration();

        System.out.println("========== Iterator ========");
        listTask.iterator();

        System.out.println("========== ListIterator ========");
        listTask.listIterator();

        System.out.println("========== Comparable ========");
        listTask.comparable();

        System.out.println("========== Comparator ========");
        listTask.comparator();
    }

    private static void setTask() {
        SetTask setTask = SetTask.getInstance();

        System.out.println("========== HashSet ========");
        setTask.hashSet();

        System.out.println("========== TreeSet ========");
        setTask.treeSet();
    }

    private static void mapTask() {
        MapTask mapTask = MapTask.getInstance();
        System.out.println("========== HashMap ========");
        mapTask.map();
        System.out.println("========== HashMap Iterator ========");
        mapTask.mapIterator();
    }

    private static void testTime() {
        System.out.println("========== Test Time ========");
        ListTask listTask = ListTask.getInstance();
        listTask.testLists();
    }

}
