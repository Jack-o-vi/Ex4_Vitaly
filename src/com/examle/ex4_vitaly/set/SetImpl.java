package com.examle.ex4_vitaly.set;

/*

Set (HashSet, TreeSet)
Проверить не содержит ли Set дублированных элементов.
Убедится что элементы HashSet неупорядоченные.
Создать собственный компаратор - implements Comparator - и на основе него создать TreeSet. Добавить элементы в рандомном порядке, после вставки проверить упорядоченность.

 */

import com.examle.ex4_vitaly.bean.Person;
import com.examle.ex4_vitaly.bean.PersonAgeAscendingComparator;
import com.examle.ex4_vitaly.util.Utility;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImpl {

    private Set<Person> hashSetPeople;
    private Set<Person> treeSetPeople;

    public SetImpl() {
        hashSetPeople = new HashSet<>();
        treeSetPeople = new TreeSet<>(new PersonAgeAscendingComparator());
    }

    public void fillSet(int amount, Set<Person> set) {
        set.clear();
        for (int i = amount; i > 0; i--) {
            set.add(new Person("Name #" + Utility.randInt(amount), Utility.randInt(amount)));
        }
    }

    public void outputSet() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Person person : hashSetPeople) {
            stringBuilder.append(person);
        }
        System.out.println(stringBuilder);
    }

    public void outputTreeSet() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Person person : treeSetPeople) {
            stringBuilder.append(person);
        }
        System.out.println(stringBuilder);
    }

    public Set<Person> getHashSetPeople() {
        return hashSetPeople;
    }


    public Set<Person> getTreeSetPeople() {
        return treeSetPeople;
    }

}
