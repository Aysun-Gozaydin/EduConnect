package factory;

import com.entities.Ders;
import java.time.LocalDateTime;

public class kayitliDers extends Ders {

    
    private LocalDateTime eklenmeTarihi;

    public kayitliDers(String baslik, String aciklama, int ucret, String ogretmen, String icerik, int sureDakika, LocalDateTime eklenmeTarihi) {
        super(baslik, aciklama, ucret, ogretmen, icerik, sureDakika); // artık doğru sırada
        this.eklenmeTarihi = eklenmeTarihi != null ? eklenmeTarihi : LocalDateTime.now();
    }


    public LocalDateTime getEklenmeTarihi() {
        return eklenmeTarihi;
    }

    public void setEklenmeTarihi(LocalDateTime eklenmeTarihi) {
        this.eklenmeTarihi = eklenmeTarihi;
    }

    @Override
    public void bilgiVer() {
        System.out.println("=== Kayıtlı Ders (Önceden Eklenmiş) ===");
        System.out.println("Başlık      : " + getBaslik());
        System.out.println("Ücret       : " + getUcret());
        System.out.println("Öğretmen    : " + getOgretmen());
        System.out.println("İçerik      : " + getIcerik());
        System.out.println("Süre (dk)   : " + getSureDakika());
        System.out.println("EklenmeTarihi: " + eklenmeTarihi);
    }
}
