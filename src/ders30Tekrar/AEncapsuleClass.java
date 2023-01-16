package ders30Tekrar;

public class AEncapsuleClass {
    private String hastaneIsmi= "Yildiz Hastanesi";

    public void setHastaUcreti(int hastaUcreti) {
        this.hastaUcreti = hastaUcreti;
    }

    public String getHastaneIsmi() {
        return hastaneIsmi;
    }

    // hastane ismigörülebilsin ama değiştirilemesin
    // getter methodu lazım
    private int hastaUcreti;
    // hasta ucretleri de giriş yapılabilsin
    // persınel hasta ücretlerini göremesin
    // setter merthodu lazım

    private String hemsireIsmi;
    private String hemsireAdresi;
    // bu instance variable'lara herkes ulasabilsin
    // bu durumda public yapmak akla gelen ilk cozum olacaktir
    // bu variable'lari puplic yapmak yerine
    // private yapip, getter ve setter oluşturmak da
    // ayni islevi gorur


    public String getHemsireIsmi() {
        return hemsireIsmi;
    }

    public void setHemsireIsmi(String hemsireIsmi) {
        this.hemsireIsmi = hemsireIsmi;
    }

    public String getHemsireAdresi() {
        return hemsireAdresi;
    }

    public void setHemsireAdresi(String hemsireAdresi) {
        this.hemsireAdresi = hemsireAdresi;
    }
}
