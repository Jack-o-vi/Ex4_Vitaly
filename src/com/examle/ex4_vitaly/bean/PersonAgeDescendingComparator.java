package com.examle.ex4_vitaly.bean;

import java.util.Comparator;

/**
 * Implements Comparator of {@link Person}.
 * Compares by age (descending order).
 */
public class PersonAgeDescendingComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return Integer.compare(person2.getAge(), person1.getAge());
    }

}
