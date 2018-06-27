package com.examle.ex4_vitaly.bean;

import java.util.Objects;

public class Bean implements Comparable<Bean> {

    private String name;
    private int age;

    public Bean() {
    }

    public Bean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bean bean = (Bean) o;
        return age == bean.age &&
                Objects.equals(name, bean.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Bean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Bean bean) {
        if (bean != null) {
            if (age > bean.getAge()) {
                return 1;
            } else if (age == bean.getAge()) {
                return 0;
            } else {
                return -1;
            }

        }

        return 0;
    }
}
