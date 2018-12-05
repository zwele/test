package com.example.test.utils;

import java.math.BigDecimal;

public class NumberUtils {

    public static void main(String[] args){
        Double d = new Double(5.67);

        int num = BigDecimal.valueOf(d).setScale(1, BigDecimal.ROUND_HALF_EVEN).intValue();
        System.out.println(num);
    }
}
