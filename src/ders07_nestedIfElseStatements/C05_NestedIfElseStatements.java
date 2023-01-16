package ders07_nestedIfElseStatements;

public class C05_NestedIfElseStatements {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, 10 urunden az ise  %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, 10 urunden az ise  %10 indirim yapin

        int urunAdedi = 30;
        boolean kartVarMi = false;
        double listeFiyati = 12.5;
        double toplamFiyat = 0;

        //ana değişken kart olsun
        if (kartVarMi) {
            //kart var
            if (urunAdedi < 0) {
                System.out.println("hatalı ürün adeti girişi");
            } else if (urunAdedi < 10) {
                toplamFiyat = urunAdedi * listeFiyati * 0.85;
                System.out.println("%15 indirimli : " + toplamFiyat);
            } else {
                toplamFiyat = urunAdedi * listeFiyati * 0.80;
                System.out.println("%20 indirimli : " + toplamFiyat);
            }

        } else {
            //kart yok
            if (urunAdedi < 0) {
                System.out.println("hatalı ürün adeti girişi");
            } else if (urunAdedi < 10) {
                toplamFiyat = urunAdedi * listeFiyati * 0.90;
                System.out.println("%15 indirimli : " + toplamFiyat);
            } else {
                toplamFiyat = urunAdedi * listeFiyati * 0.85;
                System.out.println("%20 indirimli : " + toplamFiyat);

            }
        }
    }
}
