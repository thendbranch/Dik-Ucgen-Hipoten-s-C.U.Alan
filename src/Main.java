// https://app.patika.dev/
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Dik Üçgende Hipotenüs Bulan Program
            Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

        Ödev
            Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

        𝑢 = (a+b+c) / 2

        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         */

        //1. Aşama Kullanıcıdan değer almak için Scanner kütüphanesi yükle ve Değerleri al
        Scanner input = new Scanner(System.in);

        System.out.println("Dik Üçgende Hipotenüs Bulma");
        System.out.print("Lütfen birinci kenarı giriniz : ");
        int birinci = input.nextInt();
        System.out.print("Lütfen ikinci kenarı giriniz : ");
        int ikinci = input.nextInt();

        //2. Aşama Hesaplama

        double hipo = Math.sqrt(birinci*birinci + ikinci*ikinci);
        System.out.println("Hipotenüs : " + hipo);

        // Ödev Çözüm

        System.out.println("!! Üçgen Alan Hesaplama !!");

        System.out.print("Birinci Kenar : ");
        int a = input.nextInt();
        System.out.print("İkinci Kenar : ");
        int b = input.nextInt();
        System.out.print("Üçüncü Kenar : ");
        int c = input.nextInt();

        double u  = (a+b+c) / 2;

        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        double cevre =2*u;
        System.out.println("Uçgenin Alanı : " + alan);
        System.out.println("Üçgenin Çevresi : " + cevre);

    }
}