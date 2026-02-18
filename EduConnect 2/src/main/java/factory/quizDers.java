package factory;

import com.entities.Ders;
import java.time.LocalDateTime;

public class quizDers extends Ders {

    private int soruSayisi;
    private LocalDateTime quizTarihi;

    public quizDers(String baslik, String aciklama, int ucret,
                    String ogretmen, String icerik, int sureDakika,
                    int soruSayisi, LocalDateTime quizTarihi) {
        super(baslik, aciklama, ucret, ogretmen, icerik, sureDakika);
        this.soruSayisi = soruSayisi;
        this.quizTarihi = quizTarihi != null ? quizTarihi : LocalDateTime.now();
    }

    public int getSoruSayisi() { return soruSayisi; }
    public void setSoruSayisi(int soruSayisi) { this.soruSayisi = soruSayisi; }

    public LocalDateTime getQuizTarihi() { return quizTarihi; }
    public void setQuizTarihi(LocalDateTime quizTarihi) { this.quizTarihi = quizTarihi; }

    @Override
    public void bilgiVer() {
        System.out.println("=== Quiz Yapılan Ders ===");
        System.out.println("Başlık      : " + getBaslik());
        System.out.println("Ücret       : " + getUcret());
        System.out.println("Öğretmen    : " + getOgretmen());
        System.out.println("İçerik      : " + getIcerik());
        System.out.println("Süre (dk)   : " + getSureDakika());
        System.out.println("Soru Sayısı : " + soruSayisi);
        System.out.println("Quiz Tarihi : " + quizTarihi);
    }
}
