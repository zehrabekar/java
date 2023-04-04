package KontrolYapilari;

import java.util.Scanner;

public class KullanicidanVeriAlma {

    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in); // kullanıcıdan veri girişi olacağı için -> in
/*
        // eğer int değer girişi istersem:
        int kullaniciSayisi = tara.nextInt(); // girilen değer kullaniciSayisi değişkenine atanır
        System.out.println("kullanıcının girdiği değer : " + kullaniciSayisi);
        // console kısmında imleç yanıp söndü 6 değerini girdim ve kullanıcının girdiği değer : 6 olarak çıktı gösterdi

        double kullaniciDouble = tara.nextDouble();
        System.out.println("kullanıcının girdiği double değer : " +kullaniciDouble); //noktalı bir değer girdim */
/*
        String isim = tara.next();
        System.out.println("girilen isim : " + isim);
        //console'a zehra bekar yazmama rağmen sadece zehra kelimesini gösterdi. next() sadece ilk kelimeyi alır
        // yazdığım bütün kelimeleri göstersin istersem nextLine();
        String isimSoyisim = tara.nextLine();
        System.out.println("girilen isim soyisim: " + isimSoyisim);*/
        /* bu şekilde next(); ve nextLine(); i art arda yazınca next için girdiğim iki kelimelik değerin önce ilk kelimesini, daha sonra ikisini birden gösterdi
        yani nextline için değer girmemi beklemedi. bu hatayı düzeltmek için next ve nextline arasına  tara.nextLine(); yazıp boş çalıştırmalıyız  */
/*
        String isim = tara.next();
        System.out.println("girilen isim : " + isim);

        tara.nextLine();

        String isimSoyisim = tara.nextLine();
        System.out.println("girilen isim soyisim: " + isimSoyisim);

        //tara.nextChar(); YOK. bu yüzden next().charAt() kullanabiliriz. burada charAt() içine ilgilendiğimiz harfe ulaşmak için girdiğimiz metinde o harfin index no yazmalıyız
        char harf = tara.next().charAt(0);
        System.out.println("girilen harf : " +harf); // zehra yazdım girilen harf : z çıktısını verdi
*/

    }
}
/* Scanner Sınıfı :
scanner sınıfı ile kullanıcının consoledan veri girmesi sağlanır.
Scanner tara = new Scanner(System.in); -> tara yerine herhangi başka bir isim de yazılabilir
buradaki tara nesnedir
String isim =tara.next(); -> yazılanlardan sadece ilk kelimeyi alır
String tamAd =tara.nextLine(); ->yazılanların hepsini alır

Diğer veri türleri için farklı metotlar bulunur -> nextBoolean, nextLong, nextInt gibi.

Scanner sınıfı java.util adlı package altındadır
paketler = klasörler
belli amaçlara hizmet eden sınıflar packageların altındadır.

 */