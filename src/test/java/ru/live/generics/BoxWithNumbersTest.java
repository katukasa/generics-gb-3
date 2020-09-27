package ru.live.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoxWithNumbersTest {

    @Test
    void compare() {
        BoxWithNumbers<Long> box = new BoxWithNumbers<>(1L, 2L, 3L);
        BoxWithNumbers<Integer> intBox = new BoxWithNumbers<>(1, 2, 3);

        boolean actual = box.compare(intBox);

        Assertions.assertTrue(actual);
    }

    @Test
    void getFirstTest() {
        BoxWithNumbers<Long> box = new BoxWithNumbers<>(1L, 2L, 3L);
        Long actual = BoxWithNumbers.firstElement(box);



        Assertions.assertEquals(Long.valueOf(1L), actual);
    }

    @Test
    void genericsTest() {
        List<String> list = new ArrayList();

        List<String> list2 = new ArrayList<>();
        List strings = new ArrayList<String>();

        List<Integer> integers = new ArrayList<Integer>();
        integers.add(0);
        strings.add("Weeeha!");
        integers.addAll(strings);

        System.out.println(integers);
    }

    @Test
    void genericsQuizTest() {
        Number number = Long.valueOf(5L + 1L);

        //List<Number> list = new ArrayList<Long>();
        //List<Long> list2 = new ArrayList<Number>();
    }


    @Test
    void doubleTest() {
        Double d = 0.0;

        for (int i = 0; i < 100000; i++) {
            d += 0.00001;
        }
        System.out.println(d);
        assertEquals(1.0, d, 0.00001);
    }


    @Test
    void bigDecimalTest() {
        BigDecimal d = BigDecimal.ZERO;

        for (int i = 0; i < 100000; i++) {
            d = d.add(new BigDecimal("0.00001"));
        }
        System.out.println(d);
        assertEquals(new BigDecimal("1.00000"), d);
    }
}