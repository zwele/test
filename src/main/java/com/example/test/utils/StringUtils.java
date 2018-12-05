package com.example.test.utils;

public class StringUtils {
    public static void main(String[] args){


        String goodEvalue = "包装完好=8||服务态度好=11||配送快=8||风雨无阻=8";

        String [] eves = goodEvalue.split("\\|\\|");

        for(String s:eves){
            System.out.println(s);
        }
    }
}
