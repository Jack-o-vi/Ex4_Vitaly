package com.examle.ex4_vitaly.list;

import com.examle.ex4_vitaly.bean.Bean;
import com.examle.ex4_vitaly.bean.BeanNameComparator;

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
 * {@link ListImpl#listIteratorAdd(Bean)},
 * {@link ListImpl#listIteratorOutput()},
 * {@link ListImpl#listIteratorSetByAge(Bean, int)}.
 *  d. Comparable allows objects to be comparable and sort them in specified order.
 *  {@link Bean} class implements {@link Comparable}
 *
 *  c. Comparator interface allows to create own Comparator by which the objects will be sorted.
 *  {@link BeanNameComparator} is an example of Comparator for {@link Bean} class.
 *
 * @author Vitaly Zeenko
 */
public final class ListImpl {

    private static List<Bean> beans;

    public ListImpl() {
        beans = new ArrayList<>();
    }

    public void outputBeans() {
        System.out.println(" List: ");
        System.out.println(beans.toString());
        //beans.forEach(System.out::println);
    }

    public void enumerationOutput() {
        Enumeration<Bean> enumeration = Collections.enumeration(beans);
        StringBuilder stringBuilder = new StringBuilder();
        while (enumeration.hasMoreElements()) {
            stringBuilder.append(enumeration.nextElement()).append(System.lineSeparator());
        }
        System.out.println(" Enumeration:\n" + stringBuilder.toString());
    }

    public void iteratorOutput() {
        Iterator<Bean> beanIterator = beans.iterator();
        StringBuilder stringBuilder = new StringBuilder();
        Bean bean;
        while (beanIterator.hasNext()) {
            bean = beanIterator.next();
            if (bean != null)
                stringBuilder.append(bean.toString()).append(System.lineSeparator());
        }

        System.out.println(" Iterator:\n" + stringBuilder);
    }

    public void listIteratorOutput() {
        ListIterator<Bean> beanListIterator = beans.listIterator();
        StringBuilder stringBuilder = new StringBuilder();
        Bean bean;
        while (beanListIterator.hasNext()) {
            bean = beanListIterator.next();
            if (bean != null)
                stringBuilder.append(bean.toString()).append(System.lineSeparator());
        }
        System.out.println(" ListIterator:\n" + stringBuilder);
    }

    public int iteratorDeleteByAge(int age) {
        Iterator<Bean> iterator = beans.iterator();
        // can be replaced by
        // beans.removeIf(bean -> bean.getAge() == age);
        while (iterator.hasNext()) {
            if (iterator.next().getAge() == age) {
                iterator.remove();
            }
        }
        return age;
    }

    public int listIteratorDeleteByAge(int age) {
        ListIterator<Bean> beanListIterator = beans.listIterator();
        while (beanListIterator.hasNext()) {
            if (beanListIterator.next().getAge() == age) {
                beanListIterator.remove();
            }
        }
        return age;
    }

    public int listIteratorSetByAge(Bean bean, int age) {
        ListIterator<Bean> beanListIterator = beans.listIterator();
        while (beanListIterator.hasNext()) {
            if (beanListIterator.next().getAge() == age) {
                beanListIterator.set(bean);
            }
        }
        return age;
    }

    public Bean listIteratorAdd(Bean bean) {
        ListIterator<Bean> beanListIterator = beans.listIterator();
        beanListIterator.add(bean);
        return bean;
    }

    public void comparableSortOutput() {
        System.out.println("Sort: ");
        Collections.sort(beans);
        outputBeans();
    }

    public void comparableShuffleOutput() {
        System.out.println("Shuffle: ");
        Collections.shuffle(beans);
        outputBeans();
    }

    public void comparatorSortOutput() {
        System.out.println("Shuffle: ");
        Collections.shuffle(beans);
        outputBeans();
        System.out.println("Sort using comparator: ");
        Collections.sort(beans, new BeanNameComparator());
        outputBeans();
    }

    public void fillBeans(int amount) {
        beans.clear();
        if (beans != null)
            for (int i = 0; i < amount; i++) {
                beans.add(new Bean("Name #" + i, i));
            }
    }




}
