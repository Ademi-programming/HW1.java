import java.util.Random;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        System.out.println(permission(25, 15)); // "Можно идти гулять"
        System.out.println(permission(18, 25)); // "Можно идти гулять"
        System.out.println(permission(50, 20)); // "Можно идти гулять"
        System.out.println(permission(30, -25)); // "Оставайтесь дома"
        System.out.println(permission(15, 29)); // "Можно идти гулять"
        System.out.println(permission(46, 30)); // "Оставайтесь дома"
    }

    public static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";

        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(101); // Генерирует случайное число от 0 до 100
    }
}




