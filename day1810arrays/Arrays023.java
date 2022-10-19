package day1810arrays;

import java.util.Arrays;

public class Arrays023 {
    public static void main(String[] args) {
        /*
        Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı bulunuz.
Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
         */
        int sr[] = {-12, 18, -5, 23, -2};
        Arrays.sort(sr);
        for (Integer i = 0; i < sr.length; i++) {
            if (sr[i] < 0 && sr[i + 1] > 0) {
                System.out.println("maximum negative" + sr[i]);
                System.out.println("minimum positive" + sr[i + 1]);
            }
        }
//String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini alınız.
      String [] arr={" ask","yasam","karan","Mutluluk","korku","kizma"};
       




    }}