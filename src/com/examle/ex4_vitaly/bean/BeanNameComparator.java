package com.examle.ex4_vitaly.bean;

import java.util.Comparator;

public class BeanNameComparator implements Comparator<Bean> {

    @Override
    public int compare(Bean bean1, Bean bean2) {
//        String nameBean1 = bean1.getName();
//        String nameBean2 = bean2.getName();
//        return nameBean1.compareTo(nameBean2);
        return bean1.compareTo(bean2);
    }

}
