package com.examle.ex4_vitaly.list;

import com.examle.ex4_vitaly.bean.Bean;
import com.examle.ex4_vitaly.util.Utility;

public class ListTask {

    private static final int N = 500_00;
    private static ListTask instance;

    public static ListTask getInstance() {
        if (instance == null)
            instance = new ListTask();
        return instance;
    }

    public void enumeration() {
        ListImpl listImpl = new ListImpl();
        listImpl.fillBeans(N);
        listImpl.enumerationOutput();
        listImpl.outputBeans();
    }

    public void iterator() {
        ListImpl listImpl = new ListImpl();
        listImpl.fillBeans(N);
        int ageToDelete = 3;
        System.out.println("Delete Bean with age: " + listImpl.iteratorDeleteByAge(ageToDelete));
        listImpl.iteratorOutput();
        listImpl.outputBeans();

    }

    public void listIterator() {
        ListImpl listImpl = new ListImpl();
        int ageToDelete = 3;
        listImpl.fillBeans(N);
        System.out.println("Delete Bean with age: " + listImpl.listIteratorDeleteByAge(ageToDelete));

        int ageToSet = 4;
        int newAge = 18;
        String newName = "Name #";

        Bean bean = new Bean(newName + newAge, newAge);

        System.out.println("Set Bean with age: " + listImpl.listIteratorSetByAge(bean, ageToSet));

        bean = new Bean(newName + Utility.randInt(N), Utility.randInt(N));
        System.out.println("Add Bean: " + listImpl.listIteratorAdd(bean));
        listImpl.listIteratorOutput();
        listImpl.outputBeans();
    }

    public void comparable() {
        ListImpl listImpl = new ListImpl();
        listImpl.fillBeans(N);

        listImpl.comparableSortOutput();
        listImpl.comparableShuffleOutput();

    }

    public void comparator() {
        ListImpl listImpl = new ListImpl();
        listImpl.fillBeans(N);
        listImpl.comparatorSortOutput();
    }

    public void testLists() {
        ListComparison listComparison = new ListComparison();

        System.out.println("=========== List.add(Obj)  ===========");
        listComparison.timeListAdd(N);
        System.out.println("=========== List.add(pos,Obj)  ===========");
        listComparison.timeListAddInPos(N);
        System.out.println("=========== ListIterator.add(Obj)  ===========");
        listComparison.timeAddListIterator(N);
        System.out.println("=========== List.get()  ===========");
        listComparison.timeGetElement();
        System.out.println("=========== List.remove()  ===========");
        listComparison.timeRemoveFromLists();
        System.out.println("=========== Iterator.remove()  ===========");
        listComparison.timeRemoveFromListsIterator();

    }

}
