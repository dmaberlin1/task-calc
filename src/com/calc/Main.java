package com.calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String calc(String[] args) {
        System.out.println("Введите два числа: ");
        //ридер считывает данные с клавиатуры, в строковом виде
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0, b = 0;
        try {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Введите знак операции: ");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String sing = "";
        try {
            sing = read.readLine();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("a: " + a + "b+ " + "sing" + sing);

    }

}
