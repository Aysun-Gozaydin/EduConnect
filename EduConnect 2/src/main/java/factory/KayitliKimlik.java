package factory;

import java.time.LocalDateTime;

public class KayitliKimlik implements DersKimligi {
    private final String ogretmen;
    private final String alan;
    private final LocalDateTime eklenmeTarihi;

    public KayitliKimlik(String ogretmen, String alan, LocalDateTime eklenmeTarihi) {
        this.ogretmen = ogretmen;
        this.alan = alan;
        this.eklenmeTarihi = eklenmeTarihi != null ? eklenmeTarihi : LocalDateTime.now();
    }

    @Override
    public void kimlikYazdir() {
        System.out.println("=== Kayıtlı Ders Kimliği ===");
        System.out.println("Öğretmen: " + ogretmen);
        System.out.println("Bölüm: " + alan);
        System.out.println("Eklenme Tarihi: " + eklenmeTarihi);
    }
}
