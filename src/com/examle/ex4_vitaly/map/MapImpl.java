package com.examle.ex4_vitaly.map;


import com.examle.ex4_vitaly.bean.Person;
import com.examle.ex4_vitaly.bean.Pet;
import com.examle.ex4_vitaly.util.Utility;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
HashMap
Iterator - провести модификацию HashMap с помощью Iterator - Изменения записать в StringBuilder и вывести в консоль.
Для сравнения вывести коллекцию целиком. (Map.toString())
 */
public class MapImpl {

    private Map<Person, Pet> beanMap;

    public MapImpl() {
        beanMap = new HashMap<>();
    }

    public void fillMap(int amount) {
        beanMap.clear();
        for (int i = 0; i < amount; i++) {
            beanMap.put(
                    new Person("Name #" + Utility.randInt(amount), Utility.randInt(amount)),
                    new Pet("PetName #" + Utility.randInt(amount)));
        }
    }

    public void outputKeySet() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Key set: ");
        for (Person entity : beanMap.keySet()) {
            stringBuilder.append(entity.toString()).append(System.lineSeparator());
        }
        System.out.println(stringBuilder.toString());
    }

    public void outputValueCollection() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Value collection: ");
        for (Pet entity : beanMap.values()) {
            stringBuilder.append(entity).append(System.lineSeparator());
        }
        System.out.println(stringBuilder);
    }

    public void outputEntrySetMap() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Entry set: ");
        for (Map.Entry<Person, Pet> entity : beanMap.entrySet()) {
            stringBuilder.append(entity.getKey()).append(entity.getValue()).append(System.lineSeparator());
        }
        System.out.println(stringBuilder);
    }

    public int removeEntryIterator(int age) {
        Iterator<Map.Entry<Person, Pet>> iterator = beanMap.entrySet().iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getKey().getAge() == age)
                iterator.remove();
        }

        return age;
    }

    public void outputEntrySetIterator() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<Map.Entry<Person, Pet>> iterator = beanMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Person, Pet> entry = iterator.next();
            stringBuilder.append(entry.getKey()).append(entry.getValue()).append(System.lineSeparator());
        }
        System.out.println(stringBuilder.toString());
    }
}
