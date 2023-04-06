package GenelTekrar;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class sorular {
    public static void main(String[] args) {

        //1:
        Scanner deger = new Scanner(System.in);
/*
        System.out.println("ortalaması alınacak sayılardan birinciyi giriniz");
        int sayi1 = deger.nextInt();
        System.out.println("ortalaması alınacak sayılardan ikinciyi giriniz");
        int sayi2 = deger.nextInt();
        System.out.println("ortalaması alınacak sayılardan üçüncüyü giriniz");
        int sayi3 = deger.nextInt();

        double ortalama = (sayi1 + sayi2 + sayi3) / 3.0; //küsürü görebilmek için bölme işleminin en az bir tarafını double'a çevirmemiz lazım
        // System.out.println("ortalama : " + ortalama);
        // System.out.printf(""); formatlı şekilde yazdır demektir.
        // virgülden sonra sadece iki rakam görünsün istersek :
        System.out.printf("%.2f",ortalama);


        //2:
        System.out.println("3 kenar uzunluğu giriniz");
        int kenar1 = deger.nextInt();
        int kenar2 = deger.nextInt();
        int kenar3 = deger.nextInt();

        if(kenar1==kenar2 && kenar1==kenar3){
            System.out.println("bu eşkenar bir üçgendir");
        }else if((kenar1==kenar2 && kenar1!=kenar3) || (kenar1==kenar3 && kenar1!=kenar2) || (kenar2==kenar3 && kenar2!=kenar1)){
            System.out.println("bu ikizkenar bir üçgendir");
        }else{
            System.out.println("bu çeşitkenar bir üçgendir");
        }


        //3:
        System.out.println("lütfen vize notunuzu giriniz");
        int vize = deger.nextInt();
        System.out.println("lütfen final notunuzu giriniz");
        int finall = deger.nextInt();

        int gecmeNotu = (vize *40/100) + (finall * 60/100) ;

        if(gecmeNotu<50){
            System.out.println("dersten kaldınız, ortalamanız : " +gecmeNotu);
        }else{
            System.out.println("dersten geçtiniz, ortalamanız :" +gecmeNotu);
        }


        //4:
        System.out.println("for döngüsü");
        for(int i=0; i<5; i++){
            System.out.println("zehra " + i);
        }

        System.out.println("******************");

        System.out.println("while döngüsü");
        int i =0;
        while(i<5){
            System.out.println("zehra " + i);
            i++;
        }

        System.out.println("******************");

        System.out.println("do-while döngüsü");
        int a = 0;
        do{
            System.out.println("zehra " + a);
            a++;
        }while(a<5);


        //5:
        int toplam = 0;
        for(int i=1; i<100; i++){
            toplam = toplam + i;
        }
        System.out.println("1den 100e kadar olan sayıların toplamı "+toplam);


        //6:
        String yazdirilacakMetin = "";
        for(int i =1; i<=10; i++) {
            if(i==10){
                yazdirilacakMetin = yazdirilacakMetin + i;
            }else{
                yazdirilacakMetin = yazdirilacakMetin + i + ", ";
            }
        }
        System.out.println("1den 10a kadar olan sayılar : " + yazdirilacakMetin);

        //7:
        System.out.println("faktöriyeli alınacak bir sayı giriniz");
        int faktoriyelSayisi = deger.nextInt();
        int sonuc=1;
        for(int i=1; i<=faktoriyelSayisi; i++){
            sonuc = sonuc*i;
        }
        System.out.println("girdiğiniz sayının faktöriyeli : " + sonuc);

        //8:
        System.out.println("x değeri giriniz");
        int x = deger.nextInt();

        System.out.println("y değeri giriniz");
        int y = deger.nextInt();

        int hesap = 0;

        if(x>0 && y<0){
            hesap = (4*x)+(2*y)+4;
        } else if(x>0 && y==0){
            hesap = (2*x)-(y)+3;
        }else if(x<0 && y>0){
            hesap = (3*x)+(4*y)+3;
        }else{
            System.out.println("x ve ynin 0dan büyük olduğu durumlarda sonuç 0dır.");
        }
        System.out.println("x değeri : " + x + ", y değeri : " + y + ", sonuc : " + hesap);


        //9:
        System.out.println("notunuzu giriniz");
        int not = deger.nextInt();
        int harfNotu = not/10;
        System.out.println("notunuz : " + not );

        switch (harfNotu){
            case 10 :  System.out.println("harf notunuz AA"); break;
            case 9 :  System.out.println("harf notunuz AA"); break;
            case 8:  System.out.println("harf notunuz BA"); break;
            case 7 :  System.out.println("harf notunuz BB"); break;
            case 6 :  System.out.println("harf notunuz BC"); break;
            case 5 :  System.out.println("harf notunuz CC"); break;
            case 4 :  System.out.println("harf notunuz CD"); break;
            case 3 :  System.out.println("harf notunuz DD"); break;

        }


            //10
            String yazdirilacakMetin="";
            for(int i=1; i<=10; i++){

                for(int j=1; j<=10;j++){
                    yazdirilacakMetin = yazdirilacakMetin +(i + "*" + j) + "=" + (i*j) + "\t";
                }
            }
             System.out.println(yazdirilacakMetin);


        //11: çalışmıyor düzeltilecek
        int uretilenSayi = (int) Math.random() * 101 ;
        int tahmin = -1;
        int tahminSayisi = 0;

        while(tahmin!=uretilenSayi){
            tahmin = deger.nextInt();
            tahminSayisi++;
        }

        if(tahmin==uretilenSayi){
            System.out.println("tebrikler,bildiniz. üretilen sayı " + uretilenSayi + " , tahmininiz" + tahmin + "tahmin sayınız " + tahminSayisi);
        }else if(tahmin < uretilenSayi){
            System.out.println("daha yüksek bir sayı tahmin ediniz");
        } else if (tahmin > uretilenSayi) {
            System.out.println("daha düşük bir sayı tahmin ediniz");
        }

        //12:
        System.out.println("sayı giriniz");
        int girilenSayi = deger.nextInt();
        int carpimSonucu = 1;

        while (girilenSayi!=0){
            carpimSonucu = carpimSonucu * girilenSayi;
            girilenSayi = deger.nextInt();
        }
        System.out.println("çarpım sonucu : " + carpimSonucu);




*/

        //13:







    }

}
/*
1-klavyeden girilen 3 sayının ortalamasını alan uygulama.
2-klavyeden kenarları girilen üçgenin çeşidini yazdıran uygulama
3-klavyeden girilen vize ve final notlarına göre öğrencinin dersi geçip geçmediğini söyleyen uygulama. geçme notu 50, final %60 vize %40 etkiler
4-kendi adımı tüm döngülerle ekrana 5 kere yazdıran uygulama
5-1den 100e kadar olan sayıların toplamını bulan uygulama
6-1den 10'a kadar olan sayıları sıra ile ve aralarında virgül olacak şekilde for döngüsü ile yazdıran uygulama
7-klavyeden girilen bir sayının faktöriyelini alan uygulama
8:tanımı verilen f(x,y) fonksiyonunu klavyeden girilen x ve y değerleri için hesaplayan uygulama
x>0, y<0 ise f(x,y) = 4x+2y+4
x>0, y=0 ise f(x,y) = 2x-y+3
x<0, y>0 ise f(x,y) = 3x+4y+3
9-100lük sistemde verilen notları harfli sistemde gösteren uygulama
10-çarpım tablosunu oluşturan uygulama
11-sistem yüze kadar bir sayı üretsin.kullanıcı bu sayıyı tahmin etmeye çalışsın. kullanıcının girdiği değere göre kullanıcıyı arttırıp azaltması
için uyaralım. kullanıcı sayıyı bulana kadar tahmin etmeye devam etsin ve kaç denemede bulduğunu yazdıralım
12-kullanıcıdan sürekli sayı alan ve 0a bastığında girilen sayıların çarpımını sonuç olarak gösteren uygulama
13-kullanıcıdan aldığımız iki int değerin ebobunu bulan uygulama
14-girilen bir metnin polindrom olup olmadığını kontrol eden uygulama (polindrom : tersten okunuşu ile düz okunuşu aynı olan kelimeler. örnek :kaçak)
15-kullanıcıdan alınan integer değere kadar olan asal sayıları yazdıran program
16-1+2+4+7+11+16+20+23+25+26+28+31+35=? işleminin sonucunu bulan uygulama
 */