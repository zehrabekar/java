package KontrolYapilari;

public class Donguler {
    public static void main(String[] args) {

        //if-else : eğer yanı blok içinde ard arda if kullanılmışsa , else en yakındaki if için çalışır
        int sayi1 = 10;
        int sayi2 = 15;
        if (sayi1 < sayi2)
            if (sayi1 < 0)
                System.out.println("burası çalıştı");
            else
                System.out.println("else çalıştı");
    /*1. if doğru olduğu için altındaki if'e geçti. orada da else doğru olduğu için else çalıştı yazdı. 1. if doğru olmasaydı ekrana hiçbir şey yazdırmayacaktı
      çünkü else içteki if'e bağlı çalışır*/

        //kısa if (ternary) kullanımı :
        int a=10, b=6, c=0;
        if (a>b) {
            c=a-b;
        }else {
            c=a+b;
        }
        System.out.println("c :" +c);
        // kısa if ile:
        c= (a>b) ? (a-b) : (a+b);
        // ? = ise , : = else anlamına gelir
        System.out.println("ternary if ile c :" +c);

        /* switch-case:
        -koşula bağlanan değişken double veya float olamaz.örnek:
        double/float haftaninKacinciGunu
        switch(haftaninKacinciGunu) : olamaz
         */

        /* tekrarlanacak ifadenin bir sayısı varsa : for döngüsü,
           tekrarlanacak ifade bir koşula bağlıysa : while ve do-while döngüsü kullanılır.

            for(ilk atama ; döngü çalışma şartı ; her çalışma sonrası ne olacağı)
            for (int i = 0; i<10 ; i++){
                çalışması istenen kod
                } */

          //break:
        /*
          distakiFor:
            for ( int i=0; i<5; i++) {
                icerdekiFor:
                for (int j = 0; j < 3; j++) {
                    System.out.println("i : " + i + " , j : "+j);
                    if(i==1 && j==2){
                        break distakiFor;
                    }

                }
            }*/
        //burada for döngülerine içteki ve dıştaki diye etiketleyip break komutunun hangi for için çalışacağını yazdık
        //eğer etiket vermeseydik break komutu içteki for için çalışacaktı

    }

}
