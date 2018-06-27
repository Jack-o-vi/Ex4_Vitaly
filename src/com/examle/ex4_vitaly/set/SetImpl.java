package com.examle.ex4_vitaly.set;

/*

Set (HashSet, TreeSet)
Проверить не содержит ли Set дублированных элементов.
Убедится что элементы HashSet неупорядоченные.
Создать собственный компаратор - implements Comparator - и на основе него создать TreeSet. Добавить элементы в рандомном порядке, после вставки проверить упорядоченность.

 */

import com.examle.ex4_vitaly.bean.Bean;
import com.examle.ex4_vitaly.bean.BeanNameComparator;
import com.examle.ex4_vitaly.util.Utility;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImpl {

    private Set<Bean> hashSetBeans;
    private Set<Bean> treeSetBeans;

    public SetImpl() {
        hashSetBeans = new HashSet<>();
        treeSetBeans = new TreeSet<>(new BeanNameComparator());
    }

    public void outputSet() {
        for (Bean bean : hashSetBeans) {
            System.out.println(bean.toString());
        }
        System.out.println("Size(): " + hashSetBeans.size());
    }

    public void outputTreeSet() {
        for (Bean bean : treeSetBeans) {
            System.out.println(bean.toString());
        }
        System.out.println("Size(): " + treeSetBeans.size());
    }

    public void fillTreeSet(int amount) {
        treeSetBeans.clear();
        if (treeSetBeans != null) {
            for (int i = amount; i > 0; i--) {
                if (i % 2 == 0)
                    treeSetBeans.add(new Bean("Name #" + Utility.randInt(amount), Utility.randInt(amount)));
            }
        }
    }

    public void fillHashSet(int amount) {
        hashSetBeans.clear();
        if (hashSetBeans != null) {
            for (int i = amount; i > 0; i--) {
                if (i % 2 == 0)
                    hashSetBeans.add(new Bean("Name #" + Utility.randInt(amount), Utility.randInt(amount)));
            }
        }

    }


}
