package ders29_stringBuilder_accsessModifier;

import java.util.ArrayList;
import java.util.List;

public class C06 {
    /*
    Büyuk projelerde datayı görme veya datayı değiştirme
    yetkilerini birbirinden bağımsız  olarak düzenlemek istenebilir
    Access modifier ile class üyelerine başka classlardan erişim sınırlandırılabilir
    ANCAK
    ulaşılabilen dataya hem okuma hem yazma yapilabilirken
    ulasılamayan data ne okunabilir ne de değiştirilebilir

    gerçek hayatttaki ihtiyaçlar düşünüldüğünde
    Javaya yetki sınırlamayı uyarlamak istersek

    - Eğer okuma ve yazma
     */
    // get ve set daha önceki java objelerinde karşımıza çıkmıştı

    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(5);

       // sayilar.get(1)=10; get okumaya izin var ama değer atamaya yani yazmaya izin yok

       // System.out.println(sayilar.set(1)); set varsa MUTLAKA değer atamalısın


    }
}
