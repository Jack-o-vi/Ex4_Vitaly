package com.examle.ex4_vitaly.util;

import java.util.Random;

public class Utility {

    public static int randInt(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }

}
