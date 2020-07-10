
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("LÜtfen Bakiyenizi Giriniz : ");
        int bakiye = scanner.nextInt();
        while (true){
            System.out.println("Yapmak istediğiniz işlemi seçin : ");
            System.out.println("Para Çekmek için 1'i tuşlayın ");
            System.out.println("Para Yatırmak için 2'yi tuşlayın ");
            int işlem = scanner.nextInt();
            switch (işlem) {
                case 1:
                    System.out.println("Çekmek İstediğiniz Tutarı Giriniz : ");
                    int tutar = scanner.nextInt();
                    if (tutar > bakiye) {
                        System.out.println("Bakiyeniz yetersiz ! ");
                        break;
                    }
                        bakiye -= tutar;
                        System.out.println("Yeni bakiyeniz : " + bakiye);

                        break;
                case 2:
                    System.out.println("Yatırmak İstediğiniz Tutarı Giriniz : ");
                    tutar = scanner.nextInt();
                    bakiye += tutar;
                    System.out.println("Yeni bakiyeniz : " + bakiye);
                    break;
                default:
                    System.out.println("Geçersiz İşlem Girdiniz");
                    break;
            }
            System.out.println("Yeni bir İşlem Yapmak İstiyorsanız E'ye İstemiyorsanız H'ye Basınız");
            String karar = scanner.next();
            if (karar.equals("e"))
                continue;
            if (karar.equals("h"))
                System.out.println("İyi günler :)");
                break;

        }

    }
}

