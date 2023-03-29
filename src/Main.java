public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("java öğreniyorum");
        System.out.print("zehra bekar");
        System.out.print("java dersleri \n"); // üst satırla yanyana yazdı. fakat sondaki \n karakteri sebebiyle imleci alt satıra aldı
        System.out.println("ilk projemiz");
        */

        int birinciSayi = 15;
        int ikinciSayi ;

        ikinciSayi = 30;
        birinciSayi = 50;

        int sayi1 =10, sayi2=20;

        System.out.println("birinci sayının değeri : " + birinciSayi + " , ikinci sayının değeri : " + ikinciSayi);
    }
}

/*
çıktı :
java öğreniyorum
zehra bekarjava dersleri
ilk projemiz */


/*
Sınıf isimlendirmeleri :
-büyük harfle başlanır
-iki kelimeden oluşuyorsa birleşik ve ilk harfleri büyük yazılır. örnek : HelloWorld , IlkSinif, OgrenciDetay
-türkçe karakter kullanılmaz .

*Bir sınıfın çalışabilmesi için main isimli metota sahip olmalıdır, burası uygulamanın başlangıç noktasıdır.
*Birden fazla main metotu olabilir.
*statement : bir aksiyonu veya aksiyonlar sırasını belirtir.merhaba dünya ifadesinin gösterilmesine statement denir.her bir statement ; ile sonlanır.
*javada bazı kelimeler reserved words olrak geçer. Bu kelimelerin java için anlamı vardır . o yüzden değişken , metot , sınıf vs gibi şeyler oluştururken bu isimleri
kullanmamalıyız . örnek : class , static, public, void ...
hatalı kullanım örneği (değişken) : int void = 10 -> yapılamaz
*süslü parantezlerden sonra ; kullanılmaz
*sout + tab =  System.out.println();
* System.out.println(); -> imleci bir alt satıra alır
 System.out.print(); imleci aynı satırda bırakır

*/
//2.ders-değişkenler
/*
-sayi1 ile Sayi1 farklı değişken isimleridir. büyük/küçük harf duyarlılığı vardır
-aynı kod bloğu içinde (süslü parantez) aynı isimde değişken tanımlanamaz
- boşluk, /,*,-,+ gibi karakterleri isimlendirmede kullanamayız
-değişken tanımlama formülü :
değişkentürü değişkenadı = değeri
örnek: int sayi = 10
-değişken isimlendirme rakamla başlayamaz

-javadaki sayısal veri tipleri ve küçükten büyüğe hafızada kapladığı alan sıralaması:
byte - short - int - long - float - double

-literal kavramı: programın içinde tanımlı olan sabit değerlere denir.(36,524200,5.9)
int i = 36;
long y = 524200;
double v = 5.9;

-float bir değer için f/F, double için d/D kullanmalıyız. örnek :
float :250.5f
double : 524.985d

-sayısal veri tipleri kullanılırken ilk değer atanmazsa java otomatik 0 değerini atar.

 */