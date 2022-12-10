package tekrarMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map<I extends Number, S> {/*
Verilen map'te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.
map-> { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
Istenen dil =› java Sonuc -> [Ali, Veli] */

    public static void main(String[] args) {
        HashMap<Integer,String> map1=new HashMap<>();
        map1.put(101,"Ali,Can,java");
        map1.put(102,"Veli,Yan,java");
        map1.put(103,"Ali,Yan,C#");
        String istenilenDil="JAVA";
        List<String> isimlist=javaBilenler(map1,istenilenDil);
        System.out.println("Java"+isimlist);




    }

    private static List<String> javaBilenler(HashMap<Integer, String> map1, String istenilenDil) {
        List<String> isimlerListesi=new ArrayList<>();
        for (String w:map1.values()){
            String arr[]=w.split(",");
            if (arr[2].equalsIgnoreCase(istenilenDil)){
                isimlerListesi.add(arr[0]);
            }
        }return isimlerListesi;
    }

}
