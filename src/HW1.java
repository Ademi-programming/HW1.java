import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        String myAgeIs;
        final int NUM = 42;

        String word = "года";

        myAgeIs = NUM + word;
        System.out.println("Мне: " + (NUM + word));

        System.out.println(myAgeIs);

        System.out.println(NUM);

        System.out.println(word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        { System.out.println("Введите ваше имя: ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Привет! " + name + "!");

        }
    }
}
