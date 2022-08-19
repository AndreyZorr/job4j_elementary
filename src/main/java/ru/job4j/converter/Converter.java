package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {

            float ineuro = 140;
            float expectedeuro = 2;
            float outeuro = Converter.rubleToEuro(ineuro);
            boolean passed = expectedeuro == outeuro;
            System.out.println("140 rubles are 2. Test result : " + passed);

        float indollar = 140;
        float expecteddollar = 2;
        float outdollar = Converter.rubleToDollar(indollar);
        boolean passeddollar = expecteddollar == outdollar;
        System.out.println("140 rubles are 2. Test resut : " + passed);
    }
}
