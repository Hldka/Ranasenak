package day1910arryarrylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Deneme {
    public static void main(String[] args) {int arr[][] = { {3,2,1},{1,2,3} };

        System.out.println(arr.length);


        /*
        for (int i = 1; i < arr.length; i++) {
            for (int k = 1; k < arr[0].length; k++) { if (arr[i][k] % 2 == 1){
                arr[i][k] = arr[i][k] + 1; }
                if (arr[i][k] % 2 == 0){ arr[i][k] = arr[i][k] * 2;
                } }
        }
        System.out.println(Arrays.deepToString(arr)); */
        ArrayList<String> list = new ArrayList<String>();
        list.add("A"); list.add("B"); list.add("C"); list.add("D"); list.remove(3); list.remove("A"); System.out.println(list);

        System.out.println();
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D"); System.out.println(list1.remove(2));

        System.out.println(list1);
        System.out.println(list1.remove(2));
        System.out.println(list1);


    }
}





