package KontrolYapilari;

public class MathSinifi {
    public static void main(String[] args) {
        System.out.println("pi sayısı : " + Math.PI); //3.141592653589793
        System.out.println("e sayısı : " + Math.E); //2.718281828459045
        System.out.println("-5 in mutlak değeri : " + Math.abs(-5)); //5
        System.out.println("4.3'ün yuvarlandığı sayı : " + Math.ceil(4.3)); //5.0
        System.out.println("-4.3'ün yuvarlandığı sayı : " + Math.ceil(-4.3)); //-4.0
        System.out.println("-2'nin küpü : " + Math.pow(2,3)); //8.0 (parantez içine önce üssü alınacak sayı sonra kaçıncı üssünün alınacağı yazılır)
        System.out.println("16'nın karekökü : " + Math.sqrt(16)); //4.0
        System.out.println("2 mi büyük 3 mü : " + Math.max(2,3)); //3
        System.out.println("2 mi küçük 3 mü : " + Math.min(2,3)); //2

        int onaKadarSayi = (int) (Math.random() * 10 +1);
        System.out.println("üretilen sayı : " + onaKadarSayi);

        int ikiyeKadarSayi = (int) (Math.random() * 2 +1);
        System.out.println("üretilen sayı : " + ikiyeKadarSayi);

        // 0 dahil 10'a kadar sayı üretsin istiyorsak :
        int sayi = (int) (Math.random() * 11);
        System.out.println("sayı : " + sayi);

        // 0 dahil 100'e kadar sayi üretmek istiyorsak : Math.random() * 101 (üst sınır +1)
        // 0 hariç 100'e kadar sayi üretmek istiyorsak : Math.random() * 100 + 1  ( ( Math.random() * 100 )+ 1 )
    }
}
/* Math Sınıfı :
Matematiksel işlemleri yapabilmemiz için kullanılır
java.lang paketinde old. için sınıfı kullanırken import etmek gerekmez

Math.PI = 3.14
math sınıfına ait birkaç metot:
Abs(x) : x değişkeninin mutlak değeri
Ceil(x) :  x değişkenini bir üst tam sayıya dönüştürür
exp(x) : x'in kuvvetlerini hesaplamada kullanılır
Pow(x,y) : x'in y kuvveti
sqrt(x) : x'in karekökü
Max(x,y) , Min (x,y) : büyük ve küçük değer için kullanılır
Math.random() : rastgele sayı üretmek için kullanılır.0 ve 1 arasında double değer üretir
0-0.9999999999 arasında sayı üretir

 */


















