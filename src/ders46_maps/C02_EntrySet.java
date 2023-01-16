package ders46_maps;

import ders44_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {
        // Ogrenci map'inde sirali olarak
        //tum ögrencilerin
        //bolüm,sinif,sube,isim,soyisim ve numaralarini yazdırın

        Map<Integer,String> ogrenciMapi= MapDepo.ornekMapOlustur();

        ogrenciMapi.put(109,"Adem-Demir-11-D-Soz");

        // Soz, 11, D, Adem Demir, 109
        // Bu formatta Stringler ousturup bir treeSet'e atayan
        // ve bu seti bize döndüren bir method olusturalım



        Set<String> siraliOgrenciListesi= MapDepo.siraliOgrenciListesiOlustur(ogrenciMapi);

        System.out.println(siraliOgrenciListesi);





    }
}
