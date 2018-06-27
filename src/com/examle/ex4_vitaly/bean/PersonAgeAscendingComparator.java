package com.examle.ex4_vitaly.bean;

import java.util.Comparator;

/**
 * Implements Comparator of {@link Person}.
 * Compares by age (ascending order).
 */
public class PersonAgeAscendingComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return Integer.compare(person1.getAge(), person2.getAge());
    }

}
