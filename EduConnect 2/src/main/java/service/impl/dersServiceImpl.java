package service.impl;

import factory.*;
import repository.*;
import org.springframework.stereotype.Service;
import com.entities.Ders;
import service.dersService;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

@Service
public class dersServiceImpl implements dersService {

    private final List<Ders> dersListesi = new ArrayList<>();
    
 
    private static volatile dersServiceImpl instance;
    private final dersRepository dersRepository;
    
    public dersServiceImpl(dersRepository dersRepository) {
        this.dersRepository = dersRepository;

                instance = this;
            
    }

    public static dersServiceImpl getInstance() {
        if(instance == null) {
            synchronized(dersServiceImpl.class) {
                if(instance == null) {
                    throw new IllegalStateException("Spring nesnesi daha oluşturulmadı!");
                }
            }
        }
        return instance;
    }


    @Override
    public Ders dersOlustur(String tip, String baslik, String aciklama, int ucret,
                            String ogretmen, String icerik, int sureDakika, Object... extraArgs) {

        dersFabrikasi fabrika = hangiFabrika(tip);
        Ders ders;

        switch (tip.toLowerCase()) {
            case "quiz" -> {
                int soruSayisi = extraArgs.length > 0 && extraArgs[0] instanceof Integer ? (Integer) extraArgs[0] : 10;
                ders = fabrika.dersOlustur(baslik, aciklama, ucret, ogretmen, icerik, sureDakika, soruSayisi);
            }
            case "kayıtlı" -> {
                LocalDateTime eklenmeTarihi = extraArgs.length > 0 && extraArgs[0] instanceof LocalDateTime
                        ? (LocalDateTime) extraArgs[0] : LocalDateTime.now();
                ders = fabrika.dersOlustur(baslik, aciklama, ucret, ogretmen, icerik, sureDakika, eklenmeTarihi);
            }
            case "online" -> {
                String platform = extraArgs.length > 0 && extraArgs[0] instanceof String ? (String) extraArgs[0] : "Zoom";
                LocalDateTime baslangic = extraArgs.length > 1 && extraArgs[1] instanceof LocalDateTime
                        ? (LocalDateTime) extraArgs[1] : LocalDateTime.now();
                ders = fabrika.dersOlustur(baslik, aciklama, ucret, ogretmen, icerik, sureDakika, platform, baslangic);
            }
            default -> throw new IllegalArgumentException("Geçersiz ders tipi: " + tip);
        }

        dersListesi.add(ders);
        return ders;
    }

    @Override
    public DersKimligi dersKimligiOlustur(String tip, String ogretmen, String bolum, Object... extraArgs) {
        dersFabrikasi fabrika = hangiFabrika(tip);

        return switch (tip.toLowerCase()) {
            case "quiz" -> {
                int soruSayisi = extraArgs.length > 0 && extraArgs[0] instanceof Integer ? (Integer) extraArgs[0] : 10;
                yield fabrika.kimlikOlustur(ogretmen, bolum, soruSayisi);
            }
            case "kayıtlı" -> {
                LocalDateTime eklenmeTarihi = extraArgs.length > 0 && extraArgs[0] instanceof LocalDateTime
                        ? (LocalDateTime) extraArgs[0] : LocalDateTime.now();
                yield fabrika.kimlikOlustur(ogretmen, bolum, 0, eklenmeTarihi); // 0 → soruSayısı kullanılmaz
            }
            case "online" -> {
                String platform = extraArgs.length > 0 && extraArgs[0] instanceof String ? (String) extraArgs[0] : "Zoom";
                yield fabrika.kimlikOlustur(ogretmen, bolum, 0, platform); // 0 → soruSayısı kullanılmaz
            }
            default -> throw new IllegalArgumentException("Geçersiz ders tipi: " + tip);
        };
    }

    @Override
    public List<Ders> tumDersleriGetir() {
        return dersListesi;
    }

    private dersFabrikasi hangiFabrika(String tip) {
        return switch (tip.toLowerCase()) {
            case "online" -> new OnlineDersFabrikası();
            case "kayıtlı" -> new kayitliDersFabrikasi();
            case "quiz" -> new quizDersFabrikasi();
            default -> throw new IllegalArgumentException("Geçersiz ders tipi: " + tip);
        };
    }
}
