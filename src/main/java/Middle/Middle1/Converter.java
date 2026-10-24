package Middle.Middle1;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========КОНВЕРТЕР ДОЛЛАР -> РУБЛИ==========");
        System.out.println("Введите кол-во долларов: ");

        String input = scanner.nextLine();

        Converter converter = new Converter();
        converter.convert(input);

    }

    public double convert(String input) {

        try {

            final double PRICE_OF_THE_DOLLAR = 81.97;

            input = input.replace(",", ".");
            double user_num = Double.parseDouble(input);


            if (user_num < 0) {
                throw new RuntimeException("ЗНАЧЕНИЕ НЕ МОЖЕТ БЫТЬ МЕНЬШЕ 0");
            }

            double result = user_num * PRICE_OF_THE_DOLLAR;

            System.out.println(user_num + " доллара(ов), это - " + result + " рублей");

            return result;

        } catch (Exception e) {
            throw new RuntimeException("ЗНАЧЕНИЕ НЕ ДОПУСТИМО!  " + e);
        }


    }
}
