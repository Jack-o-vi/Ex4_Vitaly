package com.examle.ex4_vitaly.list;

import com.examle.ex4_vitaly.bean.Bean;
import com.examle.ex4_vitaly.util.Utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class contains methods for benchmarking ArrayList and LinkedList.
 *
 */
public class ListComparison {

    private ArrayList<Bean> arrayList;
    private LinkedList<Bean> linkedList;

    public ListComparison() {
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
    }

    /**
     * Clears lists.
     */
    public void clear(){
        arrayList.clear();
        linkedList.clear();
    }

    /**
     * It measures time of {@link ListComparison#listAddArrayList(int)} and {@link ListComparison#listAddLinkedList(int)}
     * @param amount is an amount of elements to add
     */
    public void timeListAdd(int amount) {
        clear();
        System.out.println("Start adding to ArrayList");
        long startTime = System.currentTimeMillis();
        listAddArrayList(amount);
        long finishTime = System.currentTimeMillis();
        System.out.println("Adding time: " + (finishTime - startTime) + " ms");

        System.out.println("Start adding to LinkedList");
        startTime = System.currentTimeMillis();
        listAddLinkedList(amount);
        finishTime = System.currentTimeMillis();
        System.out.println("Adding time: " + (finishTime - startTime) + " ms");
    }

    /**
     * It measures time of {@link ListComparison#listAddInPosArrayList(int)} and {@link ListComparison#listAddInPosLinkedList(int)}
     * @param amount is an amount of elements to add
     */
    public void timeListAddInPos(int amount) {
        clear();
        System.out.println("Start adding to ArrayList");
        long startTime = System.currentTimeMillis();
        listAddInPosArrayList(amount);
        long finishTime = System.currentTimeMillis();
        System.out.println("Adding time: " + (finishTime - startTime) + " ms");

        System.out.println("Start adding to LinkedList");
        startTime = System.currentTimeMillis();
        listAddInPosLinkedList(amount);
        finishTime = System.currentTimeMillis();
        System.out.println("Adding time: " + (finishTime - startTime) + " ms");
    }

    /**
     * It measures time of {@link ListComparison#addArrayListListIterator(int)} and {@link ListComparison#addLinkedListListIterator(int)}
     * @param amount is an amount of elements to add
     */
    public void timeAddListIterator(int amount) {
        clear();
        System.out.println("Start adding to ArrayList");
        long startTime = System.currentTimeMillis();
        addArrayListListIterator(amount);
        long finishTime = System.currentTimeMillis();
        System.out.println("Adding time: " + (finishTime - startTime) + " ms");

        System.out.println("Start adding to LinkedList");
        startTime = System.currentTimeMillis();
        addLinkedListListIterator(amount);
        finishTime = System.currentTimeMillis();
        System.out.println("Adding time: " + (finishTime - startTime) + " ms");
    }

    /**
     * It measures time of {@link ListComparison#getElementsArrayList()} and {@link ListComparison#getElementsLinkedList()}
     */
    public void timeGetElement() {
        System.out.println("Start getting to ArrayList");
        long startTime = System.currentTimeMillis();
        getElementsArrayList();
        long finishTime = System.currentTimeMillis();
        System.out.println("Getting time: " + (finishTime - startTime) + " ms");

        System.out.println("Start getting to LinkedList");
        startTime = System.currentTimeMillis();
        getElementsLinkedList();
        finishTime = System.currentTimeMillis();
        System.out.println("Getting time: " + (finishTime - startTime) + " ms");
    }

    /**
     * It measures time of {@link ListComparison#listRemoveArrayList()} and {@link ListComparison#listRemoveLinkedList()}
     */
    public void timeRemoveFromLists() {
        System.out.println("Start removing from ArrayList");
        long startTime = System.currentTimeMillis();
        listRemoveArrayList();
        long finishTime = System.currentTimeMillis();
        System.out.println("Remove time: " + (finishTime - startTime) + " ms");

        System.out.println("Start removing from LinkedList");
        startTime = System.currentTimeMillis();
        listRemoveLinkedList();
        finishTime = System.currentTimeMillis();
        System.out.println("Remove time: " + (finishTime - startTime) + " ms");
    }

    /**
     * It measures time of {@link ListComparison#removeLinkedListIterator()} and {@link ListComparison#removeArrayListIterator()}
     */
    public void timeRemoveFromListsIterator() {
        System.out.println("Start removing from ArrayList");
        long startTime = System.currentTimeMillis();
        removeArrayListIterator();
        long finishTime = System.currentTimeMillis();
        System.out.println("Remove time: " + (finishTime - startTime) + " ms");

        System.out.println("Start removing from LinkedList");
        startTime = System.currentTimeMillis();
        removeLinkedListIterator();
        finishTime = System.currentTimeMillis();
        System.out.println("Remove time: " + (finishTime - startTime) + " ms");
    }

    public void listAddInPosArrayList(int amount) {
        for (int i = 0; i < amount; i++) {
            arrayList.add(i, new Bean("Name #" + Utility.randInt(amount), Utility.randInt(amount)));
        }
    }

    public void listAddInPosLinkedList(int amount) {
        for (int i = 0; i < amount; i++) {
            linkedList.add(i, new Bean("Name #" + Utility.randInt(amount), Utility.randInt(amount)));
            //linkedList.add(new Bean("Name #" + Utility.randInt(amount), Utility.randInt(amount)));
        }
    }

    public void listRemoveArrayList() {
        for (int i = 0; i < arrayList.size() / 2; i++) {
            arrayList.remove(i);
        }
    }

    public void listRemoveLinkedList() {
        for (int i = 0; i < linkedList.size() / 2; i++) {
            linkedList.remove(i);
        }
    }

    public void listAddArrayList(int amount) {
        for (int i = 0; i < amount; i++) {
            arrayList.add(new Bean("Name #" + Utility.randInt(amount), Utility.randInt(amount)));
        }
    }

    public void listAddLinkedList(int amount) {
        for (int i = 0; i < amount; i++) {
            linkedList.add(new Bean("Name #" + Utility.randInt(amount), Utility.randInt(amount)));
            //linkedList.add(new Bean("Name #" + Utility.randInt(amount), Utility.randInt(amount)));
        }
    }

    public void getElementsArrayList() {
        for (int i = 0; i < arrayList.size() / 2; i++) {
            arrayList.get(i);
        }
    }

    public void getElementsLinkedList() {
        for (int i = 0; i < linkedList.size() / 2; i++) {
            linkedList.get(i);
        }
    }

    public void addLinkedListListIterator(int amount) {
        ListIterator<Bean> listIterator = linkedList.listIterator();
        for (int i = 0; i < amount; i++) {
            listIterator.add(new Bean("Name #" + Utility.randInt(amount), Utility.randInt(amount)));
            //linkedList.add(new Bean("Name #" + Utility.randInt(amount), Utility.randInt(amount)));
        }
    }

    public void addArrayListListIterator(int amount) {
        ListIterator<Bean> listIterator = arrayList.listIterator();
        for (int i = 0; i < amount; i++) {
            arrayList.add(new Bean("Name #" + Utility.randInt(amount), Utility.randInt(amount)));
            //linkedList.add(new Bean("Name #" + Utility.randInt(amount), Utility.randInt(amount)));
        }
    }

    public void removeLinkedListIterator() {
        Iterator<Bean> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
    }

    public void removeArrayListIterator() {
        Iterator<Bean> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
    }

}
