package KontrolYapilari;

import java.util.Scanner;

public class BolumSonuSorular {
    public static void main(String[] args) {

        // vücut kitle endeksini hesaplayan program. endex = (kilo / ((boy/100)karesi) )
        System.out.println("vücut kitle endex programına hoşgeldiniz");
        System.out.println("boyunuzu cm cinsinden giriniz");

        int boy = 0;
        double kilo = 0;

        Scanner endeks = new Scanner(System.in);

        boy = endeks.nextInt();
        System.out.println("boyunuz : " + boy);

        System.out.println("kilonuzu giriniz");
        kilo = endeks.nextDouble();
        System.out.println("kilonuz : " + kilo);

        double endex = 0;
        double cmtometre = (double) boy/100.0; //burada bölümün noktalı ifade vermesi için ikisinden birini ya da ikisini de double çevirmemiz lazım, ikisini de çevirdim.
        double boyKaresi = Math.pow(cmtometre,2);
        endex = kilo / boyKaresi;
        System.out.println(endex);

        if(endex < 15){
            System.out.println("çok ciddi derece düşük kilolu");
        }else if (endex>15 && endex <16){
            System.out.println("ciddi derece düşük kilolu");
        }else if (endex>16 && endex <18.5){
            System.out.println("düşük kilolu");
        }else if (endex>18.5 && endex <25){
            System.out.println("normal kilolu");
        }else if (endex>25 && endex <30){
            System.out.println("fazla kilolu");
        }else {
            System.out.println("aşırı kilolu");
        }

        /*sistemin ürettiği iki basamaklı sayıyı kullanıcının tahmin ederek bulmasını ve şartlara göre puan kazanmasını sağlayan program:
        -kullanıcı sayıyı bilirse 1000 tl,
        -65 yerine 56 tahmin ettiyse 500 tl
        -sadece bir basamağını bilirse 100 tl
         */


        Scanner sayi = new Scanner(System.in);

        int sistemSayisi = (int) (Math.random() * 99 + 1);
        System.out.println("sistemin ürettiği sayıyı tahmin ediniz");
        int kullaniciSayisi = sayi.nextInt();
        System.out.println("kullanıcı sayısı : " + kullaniciSayisi);
        System.out.println("sistem sayısı : " + sistemSayisi);

        int sistemSayisiBirlerBasamak = sistemSayisi%10;
        int sistemSayisionlarBasamak = sistemSayisi/10;

        int kullaniciSayisiBirlerBasamak = kullaniciSayisi%10;
        int kullaniciSayisiOnlarBasamak = kullaniciSayisi/10;

        if(sistemSayisi == kullaniciSayisi){
            System.out.println("1000 tl kazandınız");
        }else if(sistemSayisiBirlerBasamak==kullaniciSayisiOnlarBasamak && sistemSayisionlarBasamak==kullaniciSayisiBirlerBasamak){
            System.out.println("500 tl kazandiniz");
        }else if (kullaniciSayisiBirlerBasamak==sistemSayisiBirlerBasamak || kullaniciSayisiOnlarBasamak==sistemSayisionlarBasamak || kullaniciSayisiBirlerBasamak==sistemSayisionlarBasamak|| kullaniciSayisiOnlarBasamak==sistemSayisiBirlerBasamak){
            System.out.println("100 tl kazandiniz");
        }else{
            System.out.println("maalesef bir şey kazanamadınız");
        }


    }
}
