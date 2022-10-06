import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    /**
     * task1
     * #10
     * Дана строка. Вывести строку, содержащую те же символы, но расположенные в обратном порядке.
     */
    private static void task1() {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    /**
     * task2
     * #33
     * Даны строки S и S0. Удалить из строки S первую подстроку, совпадающую с S0.
     * Если совпадающих подстрок нет, то вывести строку S без изменений.
     */

    private static void task2() {

        String s = "это предложение первое";
        String s0 = "это предложение";
        final var result = s.replaceFirst(s0, "");
        System.out.println(result);
    }


    /**
     * task3
     * #56
     * Дана строка-предложение заданное кириллицей. Вывести самое короткое слово в предложении.
     */
    //string.charAt(i) != ' ' не работает правильно, переделать задание. пробелы тоже считаются словами, задача не работает
    private static void task3() {
        String string = "Это предложение для третьей лабораторной работы по кросс-платформенному программированию";

        String[] words = string.split(" ");
        String small = words[0];

        for (String word : words) {
            if (small.length() > word.length())
                small = word;
        }

        System.out.println("Smallest word: " + small);
    }

}

