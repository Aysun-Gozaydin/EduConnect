package factory;

import com.entities.Ders;
import java.time.LocalDateTime;

public class kayitliDersFabrikasi implements dersFabrikasi {

    @Override
    public Ders dersOlustur(String baslik, String aciklama, int ucret, String ogretmen, String icerik, int sureDakika, Object... extraArgs) {
        LocalDateTime eklenme = extraArgs.length > 0 && extraArgs[0] instanceof LocalDateTime ? (LocalDateTime) extraArgs[0] : LocalDateTime.now();
        return new kayitliDers(baslik, aciklama, ucret, ogretmen, icerik, sureDakika, eklenme);
    }

    @Override
    public DersKimligi kimlikOlustur(String ogretmen, String alan, int soruSayisi, Object... extraArgs) {
        LocalDateTime eklenme = extraArgs.length > 0 && extraArgs[0] instanceof LocalDateTime ? (LocalDateTime) extraArgs[0] : LocalDateTime.now();
        return new KayitliKimlik(ogretmen, alan, eklenme);
    }
}
