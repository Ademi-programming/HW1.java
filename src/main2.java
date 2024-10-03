import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        String cute;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        cute = sc.nextLine();
        switch (cute) {
            case "cute":
                System.out.println("Thats cute");
                break;
            case "normal":
                System.out.println("Thats normal");
                break;
            case "bad":
                System.out.println("Thats bad");
                break;
            default:
                System.out.println("I dont know");

        }
        boolean isRainy = true;
        int temperature = 10;

        if (temperature < 20 && temperature > 5); // true true
        System.out.println("Lets go to the picnic");


    }
}

