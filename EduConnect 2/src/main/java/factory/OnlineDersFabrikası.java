package factory;

import com.entities.Ders;
import java.time.LocalDateTime;

public class OnlineDersFabrikası implements dersFabrikasi {

    @Override
    public Ders dersOlustur(String baslik, String aciklama, int ucret, String ogretmen, String icerik, int sureDakika, Object... extraArgs) {
        String platform = extraArgs.length > 0 && extraArgs[0] instanceof String ? (String) extraArgs[0] : "Zoom";
        return new onlineDers(baslik, aciklama, ucret, ogretmen, icerik, sureDakika, platform, LocalDateTime.now());
    }

    @Override
    public DersKimligi kimlikOlustur(String ogretmen, String alan, int soruSayisi, Object... extraArgs) {
        String platform = extraArgs.length > 0 && extraArgs[0] instanceof String ? (String) extraArgs[0] : "Zoom";
        return new OnlineKimlik(ogretmen, alan, platform);
    }
}
