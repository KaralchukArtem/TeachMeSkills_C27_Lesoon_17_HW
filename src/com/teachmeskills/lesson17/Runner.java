package com.teachmeskills.lesson17;

import com.teachmeskills.lesson17.function_interface.FuncInterface;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        System.out.println("Введите число : "+
                "\n1 Реверс строки"+
                "\n2 Факториал числа"+
                "\n3 День недели" +
                "\n-------------------------");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                switch (scanner.nextInt()) {
                    case 1: {
                        FuncInterface<String> my = str -> new StringBuilder(str).reverse().toString();
                        System.out.println("Реверс Artyom -> " + my.doSome("Artyom"));
                        return;
                    }
                    case 2: {
                        FuncInterface<Integer> my = f -> {
                            int result = 1;
                            for (int i = 1; i <= f; i++) {
                                result = result * i;
                            }
                            return result;
                        };
                        System.out.println("Факториал !4 -> " + my.doSome(4));
                        return;
                    }
                    case 3: {
                        Calendar c = Calendar.getInstance();
                        c.setTime(new Date());
                        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
                        System.out.println("\n" + "День недели - " + dayOfWeek + "\n");
                        return;
                    }
                    default: {
                        System.out.println("Попробуйте снова от 1-3");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Введна не валидная строка, попробуйте снова");
        }
    }
}