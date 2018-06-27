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
    void clear() {
        arrayList.clear();
        linkedList.clear();
    }

    void listAddInPosList(int amount, List<Person> list) {
        for (int i = 0; i < amount; i++) {
            list.add(i, new Person("Name #" + Utility.randInt(amount), Utility.randInt(amount)));
        }
    }

    void listRemove(List<Person> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            list.remove(i);
        }
    }

    void listAddList(List<Person> list) {
        for (int i = 0; i < ListTask.N; i++) {
            list.add(new Person("Name #" + Utility.randInt(ListTask.N), Utility.randInt(ListTask.N)));
        }
    }

    void getElements(List<Person> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            list.get(i);
        }
    }

    void addListIterator(int amount, List<Person> list) {
        ListIterator<Person> listIterator = list.listIterator();
        for (int i = 0; i < amount; i++) {
            listIterator.add(new Person("Name #" + Utility.randInt(amount), Utility.randInt(amount)));
        }
    }

    void removeListIterator(List<Person> list) {
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    List<Person> getArrayList() {
        return arrayList;
    }

    List<Person> getLinkedList() {
        return linkedList;
    }
}
