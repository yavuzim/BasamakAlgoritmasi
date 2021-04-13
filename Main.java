import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BasamakSayisi(1453);
    }

    static void BasamakSayisi(int sayi) {
        Boolean kontrol = true;
        int sonuc = 1, kalan = 0;
        ArrayList<Integer> kalanlar = new ArrayList<>();
        while (kontrol) {
            kalan = sayi % 10; //
            sonuc = sayi / 10;
            sayi = sonuc;
            kalanlar.add(kalan);
            if (sonuc == 0) {
                kontrol = false;
            }
        }
        ArrayList<Integer> sifirlar = new ArrayList<>();
        for (int i = kalanlar.size() - 1; i > -1; i--) {
            sifirlar.add(0);
        }
        if (sifirlar.size() == kalanlar.size()) {
            sifirlar.remove(0);
            for (int j = kalanlar.size() - 1; j > -1; j--) {
                System.out.print(kalanlar.get(j));
                for (int k = 0; k < sifirlar.size(); k++) {
                    System.out.print(sifirlar.get(k));
                    if (k + 1==sifirlar.size())
                        sifirlar.remove(0);
                }
                System.out.println();
            }
        }
    }
}