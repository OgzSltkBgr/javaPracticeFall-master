package recap1;

import java.util.Scanner;

public class Q05_Scanner {


    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.println("Lutfen a,b ve c sayilarini giriniz");

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        double sonuc = ((a*a) - (b*b)) / (3*c);
        System.out.println("sonuc = " + sonuc);



    }


}
