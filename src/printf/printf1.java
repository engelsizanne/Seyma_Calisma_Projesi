package printf;

public class printf1 {
    public static void main(String[] args) {
        String urun[] = {"Domates", "Biber", "Patlican", "Elma", "Armut"};
        double brFiyat[] = {2.3, 2.29, 4.1, 2, 3};
        double miktar[] = {1, 2, 3.5, 2.5, 6};

        System.out.println("Urun       miktar     br_fiyat   urun_top");
        System.out.println("==========================================");

        for (int i = 0; i < urun.length; i++) {
            System.out.printf("%-10s  kg%5.2f    €%5.2f     €%05.2f\n", urun[i], miktar[i], brFiyat[i], miktar[i] * brFiyat[i]);

        }
        System.out.println("==========================================");
        double toplamUrunMiktari = 0;
        for (int i = 0; i < miktar.length; i++) {
            toplamUrunMiktari = miktar[i];
        }
        double toplamOdenecekPara = 0;
        for (int i = 0; i < miktar.length; i++) {
            toplamOdenecekPara = miktar[i] * brFiyat[i];

        }
        System.out.printf("Genel toplam  :       %5.2fkg     €%5.2f", toplamUrunMiktari, toplamOdenecekPara);
    }
}
