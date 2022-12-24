package patikadev;

import java.util.Scanner;

public class maxMinDeger {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int numb, counter, min = 1, max = 1;

        System.out.print("kaç tane sayı gireceksiniz:");
        counter = inp.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + " sayıyı giriniz:");
            numb = inp.nextInt();

            if (i == 1) {
                max = numb;
                min = numb;
            }
            if (numb > max) {
                max = numb;
            }
            if (numb < min) {
                min = numb;
            }

        }
        System.out.println("en küçük sayı:"+min);
        System.out.println("en büyük sayı:"+max);
    }
}
