
// Ali Eren KÖSE 27/02/2024 04:05

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int pm = 0;

        // 2 'den 100'e kadar olan sayıları sırala ve kalansız bölünenler harici yazdır .
        for (int number = 2; number <= 100; number++) {
            int ctrl = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    ctrl = 1;
                    break;   // kalan 0 ise döngüyü boz
                }
            }
            if (ctrl == 0) {
                System.out.println(number + " "); // asal sayıları buraya yazdır
                pm++;
            }
        }
    }
}
