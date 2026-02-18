package factory;

import com.entities.Ders;
import java.time.LocalDateTime;

public class quizDersFabrikasi implements dersFabrikasi {

    @Override
    public Ders dersOlustur(String baslik, String aciklama, int ucret, String ogretmen, String icerik, int sureDakika, Object... extraArgs) {
        int soruSayisi = extraArgs.length > 0 && extraArgs[0] instanceof Integer ? (Integer) extraArgs[0] : 10;
        return new quizDers(baslik, aciklama, ucret, ogretmen, icerik, sureDakika, soruSayisi, LocalDateTime.now());
    }

    @Override
    public DersKimligi kimlikOlustur(String ogretmen, String alan, int soruSayisi, Object... extraArgs) {
        return new quizKimlik(ogretmen, alan, soruSayisi);
    }
}
