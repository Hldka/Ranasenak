import java.util.Scanner;

public class Halide {
    public static void main(String[] args) {
        System.out.println("Halide");
        /*
         Kullanıcıya kaç tane fibonacci sayısı görmek istediğini sorunuz.
         Ardından bu fibonacci sayılarını yazdıran kodu yazınız.
Örnek: kullanıcı 6 girerse çıktı 1 1 2 3 5 8 olacaktır.
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Kac tane Fibonacci görmek istersiniz ?");
        /*
 Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
 */
        System.out.println("kacinci sayiya kadar fibonacci istiyorsunuz");
        int sy=scan.nextInt();
        int fi=0;
        int fi2=1;
        for (int i=0;i<sy;i++){
            System.out.println(fi+" ");
            int sum=fi+fi2;
        fi=fi2;
        fi2=sum;

        }

/*  Problem Tanımı
        100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
         Ekran Çıktısı
        91
        78
        65
        52
        39
        26
        13       */
        int a=0;
        for (int i=100;i>0;i--)
            if (i % 13 == 0) {
                System.out.print(i+" ");

            }
        /*  Problem Tanımı
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.
       Örnek Ekran çıktısı
       1 2 3 4  5
       2 4 6 8 10
       3 6 9 12 15
       4 8 12 16 20
       5 10 15 20 25
       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana basan bir kod yazabilirsiniz.
    */
        System.out.println("Lütfen rakam giriniz ");
int rkm=scan.nextInt();
int h=0;
 for (int i=1;i<=rkm;i++){
     for (int k=1;k<=rkm;k++){
         System.out.print(i*k+" ");
     }
     System.out.println();
 }




    }}
