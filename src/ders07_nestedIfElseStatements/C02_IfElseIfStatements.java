package ders07_nestedIfElseStatements;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, 10 urunden az ise  %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, 10 urunden az ise  %10 indirim yapin

        int urunAdedi=30;
        boolean kartVarMi=true;
        double listeFiyati= 12.5;
        double toplamFiyat=0;

        if (kartVarMi && urunAdedi>=10){
            toplamFiyat=listeFiyati*urunAdedi*(0.8);
            System.out.println("%20 indirimli : " + toplamFiyat);

        } else if (kartVarMi && urunAdedi<10 && urunAdedi>0) {
            toplamFiyat=listeFiyati*urunAdedi*(0.85);
            System.out.println("%15 indirimli : " + toplamFiyat);

        } else if (!kartVarMi && urunAdedi>=10){
            toplamFiyat=listeFiyati*urunAdedi*(0.85);
            System.out.println("%15 indirimli : " + toplamFiyat);
        } else if (!kartVarMi && urunAdedi<10 && urunAdedi>0) {
            toplamFiyat=listeFiyati*urunAdedi*(0.9);
            System.out.println("%10 indirimli : " + toplamFiyat);
        }else {
            System.out.println("Geçersiz giris");
        }


    }
}
