package com.example.kbtg;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class DemoServiceTest {

    @Test
    @DisplayName("ในการทำงานต้อง random ได้ค่า 5")
    public void random_5(){
        DemoService demoService = new DemoService();
        demoService.setRandom(new MockRandom(5));
        String actualResult = demoService.generateData("Ning");
        assertEquals(actualResult, "Ning5");
    }

//    @Test
//    public void throw_exception(){
//        DemoService demoService = new DemoService();
//        String actualResult = demoService.generateData("Ning");
//
//    }

}

class MockRandom extends Random {
    private final int result;

    MockRandom(int result){
        this.result = result;
    }
    @Override
    public int nextInt() {
        return 5;//result;
    }
}

class Random5 extends Random {
    @Override
    public int nextInt() {
        return 5;
    }
}