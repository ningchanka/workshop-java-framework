package com.example.kbtg;

import java.util.Random;

public class DemoService {

    Random random;
    public void setRandom(Random random){
        this.random = random;
    }

    public String generateData(String name) {
        int number = random.nextInt(10);
        if(number >= 5 && number <= 8){
            return name + number;
        }
        throw new RuntimeException("Invalid number with " + number);
    }

}
