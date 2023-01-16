package ders15_overloading_whileLoop;

public class C09_StringTerseCevirme {
    public static void main(String[] args) {

        String str= "Java Candir";

        String tersStr = stringiTersCevir(str);
        System.out.println(tersStr); // ridnaC avaJ

    }
    public static String stringiTersCevir(String str){
        String tersStr="";
        int index=str.length()-1;

        while (index>=0){
            tersStr+=str.substring(index,index+1);
            index--;
        }
        return tersStr;

    }

}
