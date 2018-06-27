package com.examle.ex4_vitaly;

import com.examle.ex4_vitaly.bean.Person;
import com.examle.ex4_vitaly.bean.PersonAgeAscendingComparator;
import com.examle.ex4_vitaly.bean.PersonAgeDescendingComparator;
import com.examle.ex4_vitaly.bean.PersonNameComparator;
import com.examle.ex4_vitaly.list.ListTask;
import com.examle.ex4_vitaly.map.MapTask;
import com.examle.ex4_vitaly.set.SetTask;
import com.examle.ex4_vitaly.util.Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        testTime();
        List<Person> list = new ArrayList<>();
        String[] names = {"Zed", "Yuki","Bob", "David", "Eva", "Huey", "Duke"};
        int i = 50;
        for (String name : names) {
            list.add(new Person(name, Utility.randInt(i)));
        }

        for (Person person : list) {
            System.out.println(person);
        }
        System.out.println("Sorted: ");
        Collections.sort(list, new PersonNameComparator());
        for (Person person : list) {
            System.out.println(person);
        }

        //System.out.println(list.toString());
//        listTask();
//        setTask();
//        mapTask();
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
