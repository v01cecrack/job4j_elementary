package ru.job4j.calculator;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60; /* формула перевода рублей в доллары. */
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = rubleToDollar(10019);
        System.out.println("10019 rubles are " + dollar + " dollars.");
    }
}
