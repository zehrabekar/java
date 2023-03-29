package veriable;

public class TypeCasting {

    public static void main(String[] args) {
        int sayi = 10;
        double noktaliSayi = 25.25;

        /*
        noktaliSayi = sayi; // sağdakinin değeri soldakine atanır
        System.out.println("noktali sayının değeri : " + noktaliSayi); //10
        */

        /*
        sayi = noktaliSayi; // hata verdi */

        sayi = (int) noktaliSayi; // yandaki kırmızı lamba işaretine tıklayıp cast to int seçtik
        // bu çevirebildiğin kadar int e çevir demek
        System.out.println("sayi değeri : " + sayi); // 25

        byte byteSayi = 5;
        float ondalikliSayi = 130.25f;
        byteSayi = (byte) ondalikliSayi; // cast to byte
        System.out.println("byte sayının değeri : " + byteSayi); // -126 . anlamsız bir değer verdi

    }
}

/*
tip dönüşümleri
-javada küçük olan tamsayı veri türü otomatik olarak büyük olan veri türüne dönüştürülür.
long veri tipine sahip değişkene integer bir sayı atayabiliriz
-tam sayı tutan byte, short, int, long veri tipine sahip değişkenlere noktalı ifadeler içere float ve double değerler
atanamaz. böyle dürümda virgülden sonraki kısım kaybedilir. örnek :
int sayi = (int) 7,75 (sayi değişkenine atanan değer 7 olur)

 */