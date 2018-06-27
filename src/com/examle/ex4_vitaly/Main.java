package com.examle.ex4_vitaly;

import com.examle.ex4_vitaly.list.ListTask;
import com.examle.ex4_vitaly.set.SetTask;

public class Main {

    private static final int N = 50;

    public static void main(String[] args) {

        //listTask();
        setTask();

    }

    private static void listTask() {
        ListTask listTask = ListTask.getIstance();

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

}
