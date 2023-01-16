package ders25_staticKeyword;

public class AAHemRunner {
    public static void main(String[] args) {

        AAHem h1=new AAHem();
        h1.personelIsim="Ayşe";
        h1.personelAdresi="Ulus";
        h1.personelTelefon="5057820222";
        System.out.println(h1);


        AAHem h2=new AAHem();
        System.out.println(h2);
        h2.personelIsim="Hatice";
        h2.personelAdresi="Sincan";
        h2.personelTelefon="5057820200";
        AAHem.bashekimIsmi="Yasar Kemal";

        System.out.println("h1 : " + h1);
        System.out.println("h2 : " + h2);

        AAHem h3=new AAHem();

        System.out.println("h3 : " + h3);
        h3.hastaneIsmi="Java Hastanesi";

        System.out.println(h2.hastaneIsmi);



    }
}
