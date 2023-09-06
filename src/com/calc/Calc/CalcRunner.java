package com.calc.Calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcRunner {
    public static void main(String[] args) {
        try {
            //обьект для чтения вводы пользователя с консоли
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите арифметическое выражение (например, 1 + 2):");
//            BufferedReader предоставляет методы, такие как readLine(),
//                    которые позволяют читать строки текста целиком,
            String input = reader.readLine();
            String result = calc(input);
            System.out.println("Результат: " + result);
        } catch (IOException e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }


    //Ниже создан приватный метод calc  в него попадает строка с reader.readLine();
    private static String calc(String input) {
        try {
            //разбираем строку на массив
            String[] tokens = input.split(" ");

            if (tokens.length != 3) {
                throw new IllegalArgumentException("Неверный формат ввода");
            }
            // Извлекаем первое и второе число из токенов и делаем преобразование типов
            int operand1 = Integer.parseInt(tokens[0]);
            int operand2 = Integer.parseInt(tokens[2]);
            //  оператор арифметической операции операции
            String operator = tokens[1];


            // Вычисляем результат в зависимости от оператора, используя выражение switch expressions",
            // в современном варианте
            // такая возможность появилась  с 12  версии
            int result = switch (operator) {
                case "+" -> operand1 + operand2;
                case "-" -> operand1 - operand2;
                case "*" -> operand1 * operand2;
                case "/" -> {
                    if (operand2 == 0) {
                        throw new IllegalArgumentException("Деление на ноль");
                    }
                    //Инструкция yield в Java используется в контексте "Switch Expressions"
                    yield operand1 / operand2;
                }
                default -> throw new IllegalArgumentException("Неверный оператор");
            };

            return Integer.toString(result);
        } catch (Exception e) {
            return "throws Exception";
        }
    }




}
