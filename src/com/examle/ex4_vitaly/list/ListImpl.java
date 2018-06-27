package com.examle.ex4_vitaly.list;

import com.examle.ex4_vitaly.bean.Person;
import com.examle.ex4_vitaly.bean.PersonAgeComparator;

import java.util.*;

/**
 * <h1>In this class all tasks about List are implemented.</>
 * a. Enumeration - reading list values.
 * The List will be output with Enumeration {@link ListImpl#enumerationOutput()}
 * and using List.toString {@link ListImpl#outputBeans()}.
 * b. Iterator - reading and removing elements from the list. Two features were demonstrated in
 * {@link ListImpl#iteratorDeleteByAge(int)} and {@link ListImpl#iteratorOutput()}.
 * c. ListIterator - reading next and previous values, removing, updating and adding new element.
 * The implementation is in following methods:
 * {@link ListImpl#listIteratorDeleteByAge(int)},
 * {@link ListImpl#listIteratorAdd(Person)},
 * {@link ListImpl#listIteratorOutput()},
 * {@link ListImpl#listIteratorSetByAge(Person, int)}.
 * d. Comparable allows objects to be comparable and sort them in specified order.
 * {@link Person} class implements {@link Comparable}
 * <p>
 * c. Comparator interface allows to create own Comparator by which the objects will be sorted.
 * {@link PersonAgeComparator} is an example of Comparator for {@link Person} class.
 *
 * @author Vitaly Zeenko
 */
public final class ListImpl {

    private static List<Person> people;

    public ListImpl() {
        people = new ArrayList<>();
    }

    void fillBeans() {
        people.clear();
        for (int i = 0; i < ListTask.N; i++) {
            people.add(new Person("Name #" + i, i));
        }
    }

    void outputBeans() {
        StringBuilder stringBuilder = new StringBuilder(" List: ");
        stringBuilder.append(people);
        System.out.println(people);
    }

    void enumerationOutput() {
        Enumeration<Person> enumeration = Collections.enumeration(people);
        StringBuilder stringBuilder = new StringBuilder(" Enumeration:\n");
        while (enumeration.hasMoreElements()) {
            stringBuilder.append(enumeration.nextElement()).append(System.lineSeparator());
        }
        System.out.println(stringBuilder);
    }

    void iteratorOutput() {
        Iterator<Person> beanIterator = people.iterator();
        StringBuilder stringBuilder = new StringBuilder(" Iterator:\n");
        Person person;
        while (beanIterator.hasNext()) {
            person = beanIterator.next();
            if (person != null)
                stringBuilder.append(person.toString()).append(System.lineSeparator());
        }

        System.out.println(stringBuilder);
    }

    void listIteratorOutput() {
        ListIterator<Person> beanListIterator = people.listIterator();
        StringBuilder stringBuilder = new StringBuilder(" ListIterator:\n");
        Person person;
        while (beanListIterator.hasNext()) {
            person = beanListIterator.next();
            if (person != null)
                stringBuilder.append(person.toString()).append(System.lineSeparator());
        }
        System.out.println(stringBuilder);
    }

    int iteratorDeleteByAge(int age) {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getAge() == age) {
                iterator.remove();
            }
        }
        return age;
    }

    void listIteratorDeleteByAge(int age) {
        ListIterator<Person> beanListIterator = people.listIterator();
        while (beanListIterator.hasNext()) {
            if (beanListIterator.next().getAge() == age) {
                beanListIterator.remove();
            }
        }
    }

    void listIteratorSetByAge(Person person, int age) {
        ListIterator<Person> beanListIterator = people.listIterator();
        while (beanListIterator.hasNext()) {
            if (beanListIterator.next().getAge() == age) {
                beanListIterator.set(person);
            }
        }
    }

    void listIteratorAdd(Person person) {
        ListIterator<Person> beanListIterator = people.listIterator();
        beanListIterator.add(person);
    }

    void comparableSortOutput() {
        Collections.sort(people);
        outputBeans();
    }

    void comparableShuffleOutput() {
        Collections.shuffle(people);
        outputBeans();
    }

    void comparatorSortOutput() {
        Collections.shuffle(people);
        outputBeans();
        Collections.sort(people, new PersonAgeComparator());
        outputBeans();
    }

}
