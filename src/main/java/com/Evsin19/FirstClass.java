package com.Evsin19;

import java.util.List;

public class FirstClass {

    public static void main(String[] args) {
        // Целочисленные типы (Значение числовой литерал)
        byte aBate = 0; // -128 + 127 8 бит (-2^8) .. (2^8-1)
        short aShort = 0; // -32768 + 32767 16 бит (-2^16) .. (2^16-1)
        int aInt = 0; // -14 млрд 32 бит (-2^32) .. (2^32-1)
        long aLong = 0L; // 64 бит (-2^64) .. (2^64-1)
        // Плавающая точка
        float aFloat = 0.0f;
        double aDouble = 0.0d;
        // Символьный тип
        char aChar = 'a'; // Хранит код символа
        // Логический тип
        boolean aBoolean = true;
        Boolean booleanWapper = false; // это уже объектный тип
        // Строка (и бесконечных объектных/ссылочных типов данных
        String toBePrint = "Hello world!";
        // Объект список
        List<String> teacher = List.of("...", "....");
        // Операторы
        // Оператор присваивания =
        String toBePrint1 = "Hello world!";
        // Арифметические операторы + - / * % ++ --
        System.out.println(4.0f + 4);
        // Операторы сравнения == > < >= <= !=
        // Логические операторы & | && || !
        // Оператор instanseof
        System.out.println(aFloat instanceof int);
        // Тернарный оператор

        char sex = 'm';
        String name = sex == 'm'
                ? 'Валентин'
                : 'Валентина';
        // Управляющая конструкция if

        if(sex == 'm'){
            name = 'Валентин';
        }
        else {name = 'Валентина';}

        // Ключевое слово new Создание объектов (String можно без new остальное только с new)
        String name = new String("fsdjfdsf");
    }
}