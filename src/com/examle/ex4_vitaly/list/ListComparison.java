package com.examle.ex4_vitaly.list;

import com.examle.ex4_vitaly.bean.Person;
import com.examle.ex4_vitaly.util.Utility;

import java.util.*;

/**
 * This class contains methods for benchmarking ArrayList and LinkedList.
 */
public class ListComparison {

    private List<Person> arrayList;
    private List<Person> linkedList;

    public ListComparison() {
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
    }

    /**
     * Clears lists.
     */
    private void clear() {
        arrayList.clear();
        linkedList.clear();
    }

    /**
     * It measures time of {@link ListComparison#listAddList(int, List)} and {@link ListComparison#listAddList(int, List)}
     *
     */
    void timeListAdd() {
        clear();
        System.out.println("Start adding to ArrayList");
        long startTime = System.currentTimeMillis();
        listAddList(ListTask.N, arrayList);
        long finishTime = System.currentTimeMillis();
        System.out.println("Adding time: " + (finishTime - startTime) + " ms");

        System.out.println("Start adding to LinkedList");
        startTime = System.currentTimeMillis();
        listAddList(ListTask.N, linkedList);
        finishTime = System.currentTimeMillis();
        System.out.println("Adding time: " + (finishTime - startTime) + " ms");
    }

    /**
     * It measures time of {@link ListComparison#listAddInPosList(int, List)} and {@link ListComparison#listAddInPosList(int, List)}
     *
     */
    void timeListAddInPos() {
        clear();
        System.out.println("Start adding to ArrayList");
        long startTime = System.currentTimeMillis();
        listAddInPosList(ListTask.N, arrayList);
        long finishTime = System.currentTimeMillis();
        System.out.println("Adding time: " + (finishTime - startTime) + " ms");

        System.out.println("Start adding to LinkedList");
        startTime = System.currentTimeMillis();
        listAddInPosList(ListTask.N, linkedList);
        finishTime = System.currentTimeMillis();
        System.out.println("Adding time: " + (finishTime - startTime) + " ms");
    }

    /**
     * It measures time of {@link ListComparison#addListIterator(int, List)} and {@link ListComparison#addListIterator(int, List)}
     *
     */
    void timeAddListIterator() {
        clear();
        System.out.println("Start adding to ArrayList");
        long startTime = System.currentTimeMillis();
        addListIterator(ListTask.N, arrayList);
        long finishTime = System.currentTimeMillis();
        System.out.println("Adding time: " + (finishTime - startTime) + " ms");

        System.out.println("Start adding to LinkedList");
        startTime = System.currentTimeMillis();
        addListIterator(ListTask.N, linkedList);
        finishTime = System.currentTimeMillis();
        System.out.println("Adding time: " + (finishTime - startTime) + " ms");
    }

    /**
     * It measures time of {@link ListComparison#getElements(List)} and {@link ListComparison#getElements(List)}
     */
    void timeGetElement() {
        System.out.println("Start getting to ArrayList");
        long startTime = System.currentTimeMillis();
        getElements(arrayList);
        long finishTime = System.currentTimeMillis();
        System.out.println("Getting time: " + (finishTime - startTime) + " ms");

        System.out.println("Start getting to LinkedList");
        startTime = System.currentTimeMillis();
        getElements(linkedList);
        finishTime = System.currentTimeMillis();
        System.out.println("Getting time: " + (finishTime - startTime) + " ms");
    }

    /**
     * It measures time of {@link ListComparison#listRemove(List)} and {@link ListComparison#listRemove(List)}
     */
    void timeRemoveFromLists() {
        System.out.println("Start removing from ArrayList");
        long startTime = System.currentTimeMillis();
        listRemove(arrayList);
        long finishTime = System.currentTimeMillis();
        System.out.println("Remove time: " + (finishTime - startTime) + " ms");

        System.out.println("Start removing from LinkedList");
        startTime = System.currentTimeMillis();
        listRemove(linkedList);
        finishTime = System.currentTimeMillis();
        System.out.println("Remove time: " + (finishTime - startTime) + " ms");
    }

    /**
     * It measures time of {@link ListComparison#removeListIterator(List)} and {@link ListComparison#removeListIterator(List)}
     */
    void timeRemoveFromListsIterator() {
        System.out.println("Start removing from ArrayList");
        long startTime = System.currentTimeMillis();
        removeListIterator(arrayList);
        long finishTime = System.currentTimeMillis();
        System.out.println("Remove time: " + (finishTime - startTime) + " ms");

        System.out.println("Start removing from LinkedList");
        startTime = System.currentTimeMillis();
        removeListIterator(linkedList);
        finishTime = System.currentTimeMillis();
        System.out.println("Remove time: " + (finishTime - startTime) + " ms");
    }

    private void listAddInPosList(int amount, List<Person> list) {
        for (int i = 0; i < amount; i++) {
            list.add(i, new Person("Name #" + Utility.randInt(amount), Utility.randInt(amount)));
        }
    }

    private void listRemove(List<Person> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            list.remove(i);
        }
    }

    private void listAddList(int amount, List<Person> list) {
        for (int i = 0; i < amount; i++) {
            list.add(new Person("Name #" + Utility.randInt(amount), Utility.randInt(amount)));
        }
    }

    private void getElements(List<Person> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            list.get(i);
        }
    }

    private void addListIterator(int amount, List<Person> list) {
        ListIterator<Person> listIterator = list.listIterator();
        for (int i = 0; i < amount; i++) {
            listIterator.add(new Person("Name #" + Utility.randInt(amount), Utility.randInt(amount)));
        }
    }

    private void removeListIterator(List<Person> list) {
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

}
