import java.util.Random;
import java.util.Scanner;

public class workshop1 {
    public static void main(String[] args) {
        //1- kullanıcıdan kaç ürün almak istediğini soran,her ürünün fiyatını alarak toplam alışveriş tutarını hesaplayan bir algoritma yazınız.(Input için Scanner ve döngü için for döngüsü kullanınız)
        /**Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç ürün almak istiyorsunuz?: ");
        int amount = scanner.nextInt();

        double total = 0.0;

        for (int i = 1; i <= amount; i++) {
            System.out.print(i + ". ürünün fiyatı: ");
            double price = scanner.nextDouble();
            total += price;
        }

        System.out.println("Total tutar: " + total + " TL");**/
        //2- Do-While ve While döngüsü nedir? Bununla ilgili örnek yapınız.
        //While koşulu kontrol edilmeden önce do bloğundaki kod çalıştırılır. Sonra koşul kontrol edilir doğruysa blok tekrar çalıştırılır.
        /**Scanner scanner = new Scanner(System.in);
        String text;
        do {
            System.out.print("Bir metin girin (çıkmak için exit yazın): ");
            text = scanner.nextLine();
            if (!text.equalsIgnoreCase("exit")) {
                System.out.println("Büyük harfli hali: " + text.toUpperCase());
            }
        } while (!text.equalsIgnoreCase("exit"));**/

        //3-Kullanıcının 1 ile 10 arasında rastgele bir sayıyı tahmin etmesini isteyen ve doğru tahmin edene kadar devam eden bir program yazınız.(While döngüsü ile yapınız ve rastgele sayı üretmek için Random kütüphanesini kullanınız)
        /**Random random = new Random();
        int rastgeleSayi = random.nextInt(11);
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Tahmininiz: ");
            int tahmin = sc.nextInt();
            if (tahmin==rastgeleSayi){
                break;
            }
        }
        System.out.println("Doğru bildiniz. Sayı: " + rastgeleSayi);**/

        //4- Bir sayının mükemmel sayı olup olmadığı kontrol eden algoritma yazınız.
        /**Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int toplam = 0;
        int sayi = sc.nextInt();
        for (int i = 1; i < sayi; i++) {
            if(sayi%i==0){
                toplam+=i;
            }
        }
        if(sayi == toplam){
            System.out.println("Mükemmel sayıdır.");
        }
        else {
            System.out.println("Mükemmel sayı değildir.");
        }**/
        //5- String metotlarını araştırınız. Her bir metot için örnek yapınız.
        /**String metin = "Hello World!";
        String buyukHarf = metin.toUpperCase();
        String kucukHarf = metin.toLowerCase();
        int uzunluk = metin.length();
        String yeniMetin = metin.replace("!",".");
        String[] kelimeler = metin.split(" ");
        boolean bosMu = metin.isEmpty();
        boolean iceriyorMu = metin.contains("Hell");
        char karakter = metin.charAt(5);
        String altMetin = metin.substring(4,8);**/

;        //6- kullanıcıdan öğrenci sayısını isteyen her öğrenci için öğrenci adı,öğrenci soyadı,1.sınav notu,2.sınav notu,3.sınav notu isteyen ve daha sonra not ortalamasını hesaplayıp ekrana yazdıran algoritma yapınız.(For döngüsü kullanınız)
        /**Scanner scanner = new Scanner(System.in);
        System.out.print("Öğrenci sayısı giriniz: ");
        int ogrenciSayisi = scanner.nextInt();
        for (int i = 1; i <= ogrenciSayisi; i++) {
            System.out.print(i+". öğrencinin adı: ");
            String isim = scanner.next();

            System.out.print(i+". öğrencinin soyadı: ");
            String soyisim = scanner.next();

            System.out.print(i+". öğrencinin 1. sınav notu: ");
            double not1 = scanner.nextDouble();

            System.out.print(i+". öğrencinin 2. sınav notu: ");
            double not2 = scanner.nextDouble();

            System.out.print(i+". öğrencinin 3. sınav notu: ");
            double not3 = scanner.nextDouble();

            System.out.println(isim + " " + soyisim + " not ortalaması: " + ((not1+not2+not3)/3));
        }**/





    }
}
