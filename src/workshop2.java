import java.util.ArrayList;
import java.util.Scanner;

public class workshop2 {

    public static void main(String[] args) {
        //Bir mağazanın günlük satış miktarını, ürün adı ve fiyatını bir dizi olarak tutan ve toplam satış gelirini hesaplayan bir algoritma yazınız.
        /**String[] urunAdlari = {"Ürün 1", "Ürün 2", "Ürün 3"};
        double[] urunFiyatlari = {10.5, 20.0, 15.75};
        int[] gunlukSatisMiktarlari = {5,7,2}; // 3 ürün için

        // Toplam satış gelirini hesapla
        double toplamSatisGeliri = 0.0;
        for (int i = 0; i < urunAdlari.length; i++)
        {
            double urunToplamFiyat = urunFiyatlari[i] * gunlukSatisMiktarlari[i];
            toplamSatisGeliri += urunToplamFiyat;
        }

        // Toplam satış gelirini yazdır
        System.out.println("Toplam Satış Geliri: " + toplamSatisGeliri);**/




        //Restoranın menüsündeki yemekleri, fiyatlarını ve popülerlik derecelendirmelerini bir dizi ile tutan algoritma yazınız.

         /**String[] dishes = {"Izgara Tavuk", "Köfte", "Mantı", "Lahmacun", "Pide"};
         double[] prices = {25.0, 30.0, 35.0, 20.0, 28.0};
         int[] popularities = {4, 5, 3, 4, 4};


         System.out.println("Restoran Menüsü:");
         System.out.println("-----------------");
         for (int i = 0; i < dishes.length; i++)
         {
         System.out.println(dishes[i] + " - " + prices[i] + " TL (" + popularities[i] + "/5)");
         }**/

        //Kullanıcının seçtiği ürünleri, fiyatlarını ve sepete eklenen miktarları bir dizi ile tutan algoritma yazınız.
        /**String[] urunAdlari = {"Ürün 1", "Ürün 2", "Ürün 3"};
        double[] urunFiyatlari = {10.5, 20.0, 15.75};
        int[] sepetMiktarlari = new int[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < urunAdlari.length; i++) {
            System.out.print(urunAdlari[i] + " ürününden kaç tane eklemek istiyorsunuz? ");
            sepetMiktarlari[i] = scanner.nextInt();
        }

        System.out.println("Sepetinizdeki Ürünler:");
        for (int i = 0; i < urunAdlari.length; i++) {
            double toplamFiyat = urunFiyatlari[i] * sepetMiktarlari[i];
            System.out.println(urunAdlari[i] + " - " + sepetMiktarlari[i] + " adet - Toplam Fiyat: " + toplamFiyat + " " + "TL");
        }**/


        //Kullanıcının username, email, firstname, lastname ve password bilgilerini tutan bir ArrayList kullanarak giriş yapma algoritması yazınız.
        /**Scanner scanner = new Scanner(System.in);
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();
        ArrayList<String> firstnames = new ArrayList<>();
        ArrayList<String> lastnames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();


        usernames.add("user1");
        emails.add("user1@example.com");
        firstnames.add("User");
        lastnames.add("One");
        passwords.add("password1");

        usernames.add("user2");
        emails.add("user2@example.com");
        firstnames.add("User");
        lastnames.add("Two");
        passwords.add("password2");


        System.out.print("Username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();


        boolean isLoggedIn = false;
        for (int i = 0; i < usernames.size(); i++)
        {
            if (usernames.get(i).equals(inputUsername) && passwords.get(i).equals(inputPassword))
            {
                isLoggedIn = true;
                break;
            }
        }


        if (isLoggedIn)
        {
            System.out.println("Giriş başarılı. Hoş geldiniz, " + inputUsername + "!");
        }
        else
        {
            System.out.println("Giriş bilgileri hatalı.");
        }**/

        //Öğrenci adlarının ve notlarının olduğu bir Arraylist kullanarak belirli not aralığı altında kalan öğrenciyi listeden silme algoritması yazınız.
        /**ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Double> studentGrades = new ArrayList<>();


        studentNames.add("Ahmet");
        studentGrades.add(85.5);

        studentNames.add("Mehmet");
        studentGrades.add(60.0);

        studentNames.add("Ayşe");
        studentGrades.add(45.5);


        double minGrade = 50.0;


        for (int i = 0; i < studentGrades.size(); i++) {
            if (studentGrades.get(i) < minGrade) {
                studentNames.remove(i);
                studentGrades.remove(i);
                i--;
            }
        }

        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i) + " - " + studentGrades.get(i));
        }**/

        //Günlük görevlerimizi içeren ve bu görevlerin tamamlanma bilgisini tutan bir Arraylist oluşturunuz.ArrayList içinde bulunan görevleri güncelleyen,tamamlanan görevleri ise silen algoritmayı yazınız.
        /**Scanner scanner = new Scanner(System.in);

        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Boolean> isCompleted = new ArrayList<>();

        tasks.add("Alışveriş yap");
        isCompleted.add(false);

        tasks.add("E-postaları kontrol et");
        isCompleted.add(false);

        tasks.add("Kitap oku");
        isCompleted.add(false);


        System.out.println("\nGörevler:");
        System.out.println("----------");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i) + " - Tamamlandı: " + isCompleted.get(i));
        }


        while (true) {
            System.out.print("\nGüncellemek istediğiniz görevin numarasını girin (0 çıkış): ");
            int taskNumber = scanner.nextInt();

            if (taskNumber == 0) {
                break;
            }

            tasks.remove(taskNumber - 1);
            isCompleted.remove(taskNumber - 1);

            System.out.println("\nGüncellenen Görevler:");
            System.out.println("---------------------");

            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i) + " - Tamamlandı: " + isCompleted.get(i));
            }
        }**/

    }
}
