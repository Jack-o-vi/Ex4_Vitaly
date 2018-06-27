package com.examle.ex4_vitaly.list;

import com.examle.ex4_vitaly.bean.Person;
import com.examle.ex4_vitaly.util.Utility;

public class ListTask {

    public static final int N = 10;
    private static ListTask instance;

    private ListTask() {
    }

    public static ListTask getInstance() {
        if (instance == null)
            instance = new ListTask();
        return instance;
    }

    public void enumeration() {
        ListImpl listImpl = new ListImpl();
        listImpl.fillBeans();
        listImpl.enumerationOutput();
        listImpl.outputBeans();
    }

    public void iterator() {
        ListImpl listImpl = new ListImpl();
        listImpl.fillBeans();
        int ageToDelete = 3;
        System.out.println("Delete Person with age: " + listImpl.iteratorDeleteByAge(ageToDelete));
        listImpl.iteratorOutput();
        listImpl.outputBeans();

    }

    public void listIterator() {
        ListImpl listImpl = new ListImpl();
        int ageToDelete = 3;
        listImpl.fillBeans();
        System.out.println("Delete Person with age: " + ageToDelete);
        listImpl.listIteratorDeleteByAge(ageToDelete);

        int ageToSet = 4;
        int newAge = 18;
        StringBuilder newName = new StringBuilder("Name #").append(newAge);

        Person person = new Person(newName.toString(), newAge);

        System.out.println("Set Person with age: " + ageToSet);
        listImpl.listIteratorSetByAge(person, ageToSet);

        newName.append(Utility.randInt(N));
        person = new Person(newName.toString(), Utility.randInt(N));
        System.out.println("Add Person: " + person);
        listImpl.listIteratorAdd(person);
        listImpl.listIteratorOutput();
        listImpl.outputBeans();
    }

    public void comparable() {
        ListImpl listImpl = new ListImpl();
        listImpl.fillBeans();

        listImpl.comparableShuffleOutput();
        listImpl.comparableSortOutput();

    }

    public void comparator() {
        ListImpl listImpl = new ListImpl();
        listImpl.fillBeans();
        listImpl.comparatorSortOutput();
    }

    public void testLists() {
        ListComparison listComparison = new ListComparison();

        System.out.println("=========== List.add(Obj)  ===========");
        listComparison.timeListAdd();
        System.out.println("=========== List.add(pos,Obj)  ===========");
        listComparison.timeListAddInPos();
        System.out.println("=========== ListIterator.add(Obj)  ===========");
        listComparison.timeAddListIterator();
        System.out.println("=========== List.get()  ===========");
        listComparison.timeGetElement();
        System.out.println("=========== List.remove()  ===========");
        listComparison.timeRemoveFromLists();
        System.out.println("=========== Iterator.remove()  ===========");
        listComparison.timeRemoveFromListsIterator();

    }

}
