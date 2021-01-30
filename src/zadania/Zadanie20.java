package zadania;

import java.util.Random;
import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        Random r = new Random();
        int bound = 101;
        int random = r.nextInt(bound);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj liczbę od 0 do 100");
            int input = sc.nextInt();

            if (input > random) {
                System.out.println("Za dużo");
            } else if (input < random) {
                System.out.println("Za mało");
            } else {
                System.out.println("Bingo!");
                break;
            }
        }

    }


}
