package com.teachmeskills.lesson17;

import com.teachmeskills.lesson17.function_interface.FuncInterface;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 or 2");
        boolean exit = true;

        while (exit) {
            try {
                switch (scanner.nextInt()) {
                    case 1: {
                        FuncInterface<String> my = str -> new StringBuilder(str).reverse().toString();
                        System.out.println("Реверс Artyom -> " + my.doSome("Artyom"));
                        exit = false;
                        break;
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
                        exit = false;
                        break;
                    }
                    default: {
                        System.out.println("Re-enter 1 or 2");
                        break;
                    }
                }
            } catch (Exception e) {
                exit = false;
            }
        }


        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("\n" +"День недели - " + dayOfWeek + "\n");

    }
}