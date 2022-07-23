package day8_practice;

import java.util.ArrayList;
import java.util.List;

public class Q03_ArrayList {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
        int input []= {1,2,3,4,5,6,8,8};
        int n=4;

        List<Integer> list = new ArrayList<>();
        for (int  each :input  ) {
            list.add(each);
        }
        List<Integer> maxList =new ArrayList<>();
        int count=1;
        while(count<=n){
            int max = list.get(0); // listin ilk elemani max olsun
            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i)>max && !(maxList.contains(list.get(i)))){ // listenin herhangi elemani max dan buyulse
                    max = list.get(i); // max artık o eleman olsun
                }
            }

            maxList.add(max);
            list.remove(list.indexOf(max)); // max liste eklenen sayiyi kaldırdık
            count++;
        }
        System.out.println("Array in max " + n+ " elemani " +maxList);

    }
}
