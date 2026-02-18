package factory;

import com.entities.Ders;
import java.time.LocalDateTime;

public class onlineDers extends Ders {

    private String platform;
    private LocalDateTime baslangicZamani;

    public onlineDers(String baslik, String aciklama, int ucret,
                      String ogretmen, String icerik, int sureDakika,
                      String platform, LocalDateTime baslangicZamani) {
        super(baslik, aciklama, ucret, ogretmen, icerik, sureDakika);
        this.platform = platform != null ? platform : "Platform belirtilmedi";
        this.baslangicZamani = baslangicZamani != null ? baslangicZamani : LocalDateTime.now();
    }

    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }

    public LocalDateTime getBaslangicZamani() { return baslangicZamani; }
    public void setBaslangicZamani(LocalDateTime baslangicZamani) { this.baslangicZamani = baslangicZamani; }

    @Override
    public void bilgiVer() {
        System.out.println("=== Online (Anlık) Ders ===");
        System.out.println("Başlık      : " + getBaslik());
        System.out.println("Ücret       : " + getUcret());
        System.out.println("Öğretmen    : " + getOgretmen());
        System.out.println("İçerik      : " + getIcerik());
        System.out.println("Süre (dk)   : " + getSureDakika());
        System.out.println("Platform    : " + platform);
        System.out.println("Başlangıç   : " + baslangicZamani);
    }
}
