package kasim30_UcakBileti;

import java.util.HashMap;
import java.util.Scanner;

public class Musteri {




    HashMap<String,String> kullanicilar= new HashMap<>();
    Scanner scan = new Scanner(System.in);
    public void musteriKontrol(){
        System.out.println("Kullanıcı adi giriniz");
        String userName = scan.nextLine();
        if (!kullanicilar.containsKey(userName)) {
            System.out.println("Kullanıcı adı kayıtlı değil.");

            musteriKayit();
        }else {
            System.out.println("Şifre giriniz : ");

            String password = scan.next();
            if (kullanicilar.get(userName).equals(password)){
                System.out.println("Sisteme başaryla giriş yaptınız.");
            }else {
                while (!kullanicilar.get(userName).equals(password)){

                    System.out.println("Şifreyi yanlış girdiniz. Tekrar deneyiniz.");
                    password=scan.next();
                }
            }
        }
    }
    public void musteriKayit(){
        System.out.println("kullanıcı adı giriniz: ");
        String userName= scan.nextLine();
        if (kullanicilar.containsKey(userName)){
            System.out.println("Bu isimde kullanıcı yayıtlıdır. Lütfen Tekrar kullanıcı adı giriniz.");
            musteriKayit();

        } else {
            System.out.println("Şifre giriniz : ");
            String password= scan.next();
            kullanicilar.put(userName,password);
            System.out.println("Kullanıcı yapılmıştır");
        }

    }

}
