package com.examle.ex4_vitaly.list;

import java.util.List;

import static com.examle.ex4_vitaly.util.Utility.outputStringBuilder;

public class ListTimeComparison {

    private static ListTimeComparison instance;
    private long startTime;
    private long finishTime;

    private ListTimeComparison() {
    }

    public static ListTimeComparison getInstance() {
        if (instance == null)
            instance = new ListTimeComparison();
        return instance;
    }

    private void startTime() {
        startTime = System.currentTimeMillis();
    }

    private void finishTime() {
        finishTime = System.currentTimeMillis();
    }

    private long diff() {
        return startTime - finishTime;
    }

    void timeListAdd() {
        ListComparison listComparison = new ListComparison();
        listComparison.clear();
        startTime();
        listComparison.listAddList(listComparison.getArrayList());
        finishTime();
        outputStringBuilder("ArrayList time: ", Long.toString(diff()), " ms");

        startTime();
        listComparison.listAddList(listComparison.getLinkedList());
        finishTime();
        outputStringBuilder("LinkedList time: ", Long.toString(diff()), " ms");

    }

    /**
     * It measures time of {@link ListComparison#listAddInPosList(int, List)} and {@link ListComparison#listAddInPosList(int, List)}
     */
    void timeListAddInPos() {
        ListComparison listComparison = new ListComparison();
        listComparison.clear();
        startTime();
        listComparison.listAddInPosList(ListTask.N, listComparison.getArrayList());
        finishTime();
        outputStringBuilder("ArrayList time: ", Long.toString(diff()), " ms");

        startTime();
        listComparison.listAddInPosList(ListTask.N, listComparison.getLinkedList());
        finishTime();
        outputStringBuilder("LinkedList time: ", Long.toString(diff()), " ms");
    }

    /**
     * It measures time of {@link ListComparison#addListIterator(int, List)} and {@link ListComparison#addListIterator(int, List)}
     */
    void timeAddListIterator() {
        ListComparison listComparison = new ListComparison();
        listComparison.clear();
        startTime();
        listComparison.addListIterator(ListTask.N, listComparison.getArrayList());
        finishTime();
        outputStringBuilder("ArrayList time: ", Long.toString(diff()), " ms");

        startTime();
        listComparison.addListIterator(ListTask.N, listComparison.getLinkedList());
        finishTime();
        outputStringBuilder("LinkedList time: ", Long.toString(diff()), " ms");
    }

    /**
     * It measures time of {@link ListComparison#getElements(List)} and {@link ListComparison#getElements(List)}
     */
    void timeGetElement() {
        ListComparison listComparison = new ListComparison();
        listComparison.clear();
        startTime();
        listComparison.getElements(listComparison.getArrayList());
        finishTime();
        outputStringBuilder("ArrayList time: ", Long.toString(diff()), " ms");

        startTime = System.currentTimeMillis();
        listComparison.getElements(listComparison.getLinkedList());
        finishTime();
        outputStringBuilder("LinkedList time: ", Long.toString(diff()), " ms");
    }

    /**
     * It measures time of {@link ListComparison#listRemove(List)} and {@link ListComparison#listRemove(List)}
     */
    void timeRemoveFromLists() {
        ListComparison listComparison = new ListComparison();
        startTime();
        listComparison.listRemove(listComparison.getArrayList());
        finishTime();
        outputStringBuilder("ArrayList time: ", Long.toString(diff()), " ms");

        startTime();
        listComparison.listRemove(listComparison.getLinkedList());
        finishTime();
        outputStringBuilder("LinkedList time: ", Long.toString(diff()), " ms");
    }

    /**
     * It measures time of {@link ListComparison#removeListIterator(List)} and {@link ListComparison#removeListIterator(List)}
     */
    void timeRemoveFromListsIterator() {
        ListComparison listComparison = new ListComparison();
        startTime();
        listComparison.removeListIterator(listComparison.getArrayList());
        finishTime();
        outputStringBuilder("ArrayList time: ", Long.toString(diff()), " ms");

        startTime();
        listComparison.removeListIterator(listComparison.getLinkedList());
        finishTime();
        outputStringBuilder("LinkedList time: ", Long.toString(diff()), " ms");
    }


}
