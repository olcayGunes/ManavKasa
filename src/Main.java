import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double toplam, armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo,
                armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5;

        System.out.print("Armut miktarını giriniz (kg): ");
        armutKilo = input.nextDouble();

        System.out.print("Elma miktarını giriniz (kg): ");
        elmaKilo = input.nextDouble();

        System.out.print("Domates miktarını giriniz (kg): ");
        domatesKilo = input.nextDouble();

        System.out.print("Muz miktarını giriniz (kg): ");
        muzKilo = input.nextDouble();

        System.out.print("Patlıcan miktarını giriniz (kg): ");
        patlicanKilo = input.nextDouble();

        toplam = (armutFiyat * armutKilo) + (elmaFiyat * elmaKilo) + (domatesFiyat * domatesKilo) +
                (muzFiyat * muzKilo) + (patlicanFiyat * patlicanKilo);

        System.out.println("Toplam Ödemeniz Gereken Tutar: " + toplam);
    }
}
