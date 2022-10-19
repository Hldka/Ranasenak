package day1910arryarrylist;

import java.sql.Array;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //5) String’ lerden oluşan bir arrayde
        // kullanılan öğelerin toplam karakter sayısını bulunuz.
        // Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26
        String [] str={"Kemal","Jonathan","Mark","Angie","Veli"};
        System.out.println("icindeki eleman sayisi: "+str.length);
        int tplm=0;
        for (String w:str) {tplm=tplm+w.length();

        }
        System.out.println("hepsindeki toplam karakter: "+tplm);
        //6) Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.
        String [] str1={"Kemal","Jonathan","Mark","Angie","Veli"};
        int k=0;
        String l="";
        for (String w:str1) {if (w.startsWith("a")||w.startsWith("A")){
          k++;
        }


        } System.out.println(k);

//7) Verilen bir String'deki sesli harf sayısını bulunuz.

        String dh="Aglamak istemiyorsan sende aglama ";
        String []dh1=dh.split("");
       int counter=0;
        for (String w: dh1 ) { switch (w){
            case "a":
            case "e":
            case "i":
            case "o":
            case "ü":
        counter++;
    }
        }
        System.out.println(counter);
        System.out.println();
        //8) İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
       String [] rs={"Kral","Yasa","kaymak","Kayik","kay"};
       for (int i=0;i<rs.length;i++) {
           String ilkchar = rs[i].substring(0, 1);
           String sonch = rs[i].substring(rs[i].length() - 1);
           if (ilkchar.equalsIgnoreCase(sonch)) {
               System.out.println(rs[i]);
           }}

//9) Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız.
           String[] dk = {"Lea", "leo", "Matheo", "Mark", "Joseph"};
           String s = "Leo";

int conter=0;
        for (String w:dk) {if (s.equalsIgnoreCase(w)){conter++;}

        }if (conter>0){
            System.out.println(s+"arrayde vardir");
        }else {
            System.out.println(s+"  arrayde yoktur");
        }
     //10) Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız.
        int tpl=0;
        for (String w:dk
             ) {tpl=tpl+w.length();

        }
        System.out.println(tpl);
        //11) Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
        // Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
int[]sy={5,0,2,0,3};
int frst=0;
int lastIn=sy.length-1;
int[]ysy=new int[5];
        for (int i=0;i<sy.length;i++){if (sy[i]!=0){
            ysy[frst]=sy[i]; frst++;}else { lastIn--;}}
        System.out.println(Arrays.toString(ysy));


        //12) Kullanıcıdan aldığınız tamsayılar ile bir
        // array oluşturunuz ve bu arraydeki en küçük ve en büyük öğeler arasındaki farkı konsolda yazdırınız.

        //13) Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
        //Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.

    }}
