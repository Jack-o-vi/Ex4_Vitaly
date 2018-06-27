package com.examle.ex4_vitaly.set;

public class SetTask {
    private static final int N = 30;

    private static SetTask instance;

    private SetTask(){}

    public static SetTask getInstance() {
        if (instance == null)
            instance = new SetTask();
        return instance;
    }

    public void hashSet() {
        SetImpl setImpl = new SetImpl();
        setImpl.fillSet(N, setImpl.getHashSetPeople());
        setImpl.outputSet();
    }

    public void treeSet() {
        SetImpl setImpl = new SetImpl();
        setImpl.fillSet(N, setImpl.getTreeSetPeople());
        setImpl.outputTreeSet();
    }

}
