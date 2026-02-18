package factory;

public class quizKimlik implements DersKimligi {
    private final String ogretmen;
    private final String alan;
    private final int soruSayisi;

    public quizKimlik(String ogretmen, String alan, int soruSayisi) {
        this.ogretmen = ogretmen;
        this.alan = alan;
        this.soruSayisi = soruSayisi;
    }

    @Override
    public void kimlikYazdir() {
        System.out.println("=== Quiz Ders Kimliği ===");
        System.out.println("Öğretmen: " + ogretmen);
        System.out.println("Bölüm: " + alan);
        System.out.println("Soru Sayısı: " + soruSayisi);
    }
}
