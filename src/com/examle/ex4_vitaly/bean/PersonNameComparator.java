package com.examle.ex4_vitaly.bean;

import java.util.Comparator;

/**
 * This comparator compares Person by age in ascending order in case if first person has name,
 * which starts with letter from the first half of the English alphabet
 * and by age in descending order in case if first person has name,
 * which starts with letter from the second half of the English alphabet.
 */
public class PersonNameComparator implements Comparator<Person> {

    private static final String[] alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z".split("\\s");

    @Override
    public int compare(Person person1, Person person2) {

        String namePerson1 = person1.getName().toLowerCase();

        if (checkStartWithFirstHalf(namePerson1)) {
            return compareByAgeAscendingOrder(person1, person2);
        } else if (checkStartWithSecondHalf(namePerson1)) {
            return compareByAgeDescendingOrder(person1, person2);
        } else {
            return 0;
        }

    }

    private boolean checkStartWithFirstHalf(String name) {
        int halfAlphabet = alphabet.length / 2;
        for (int i = 0; i < halfAlphabet; i++) {
            if (name.startsWith(alphabet[i])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkStartWithSecondHalf(String name) {
        int halfAlphabet = alphabet.length / 2;
        for (int i = 0; i < halfAlphabet; i++) {
            if (name.startsWith(alphabet[i])) {
                return true;
            }
        }
        return false;
    }

    private int compareByAgeAscendingOrder(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }

    private int compareByAgeDescendingOrder(Person p1, Person p2) {
        return Integer.compare(p2.getAge(), p1.getAge());
    }

}
