package com.calc.Calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCalcRunner {
    public static void main(String[] args) {
        calcSimple();
    }
    public static void calcSimple() {
        System.out.println("Введите два числа поочередно, число +Enter: ");
        //ридер считывает данные с клавиатуры, в строковом виде
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        double b = 0;
        double result = 0;
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


        switch (sing) {
            case "+": {
                result = a + b;
                break;
            }
            case "-": {
                result = a - b;
                break;
            }
            case "*": {
                result = a * b;
                break;
            }
            case "/": {
                result = a / b;
                break;
            }
        }
        System.out.println(result);
    }

}
