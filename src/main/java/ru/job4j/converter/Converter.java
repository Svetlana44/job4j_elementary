package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float out = Converter.rubleToEuro(in);
        float expected = 2;
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
//        float dollar = Converter.rubleToDollar(in);
//        float euro = Converter.rubleToEuro(in);
         out = Converter.rubleToDollar(in);
         passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
//        System.out.println("140 rubles are " + euro + " euro.");
//        System.out.println("140 rubles are " + dollar + " dollar.");
    }
}
