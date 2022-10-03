import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        double toplam = 0;
        Scanner value = new Scanner(System.in);
        System.out.println("matematik notunu giriniz");
        matematik = value.nextInt();
        System.out.println("Fizik notunu giriniz");
        fizik = value.nextInt();
        System.out.println("kimya notunu giriniz");
        kimya = value.nextInt();
        System.out.println("turkce notunu giriniz");
        turkce = value.nextInt();
        System.out.println("tarih notunu giriniz");
        tarih = value.nextInt();
        System.out.println("muzik notunu giriniz");
        muzik = value.nextInt();
        toplam = matematik+fizik+kimya+tarih+turkce+muzik;
        double ort =0;
        ort = toplam/6;
        System.out.println("ortalama: "+ ort);
        String result;
        result = ort>60 ? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(result);

    }
}