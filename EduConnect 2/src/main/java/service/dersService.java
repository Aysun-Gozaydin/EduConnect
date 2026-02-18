package service;

import factory.DersKimligi;
import com.entities.Ders;
import java.util.List;

public interface dersService {


    Ders dersOlustur(String tip, String baslik, String aciklama, int ucret, String ogretmen, String icerik, int sureDakika, Object... extraArgs);


    DersKimligi dersKimligiOlustur(String tip, String ogretmen, String bolum, Object... extraArgs);


    List<Ders> tumDersleriGetir();
}
