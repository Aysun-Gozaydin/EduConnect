package factory;

import com.entities.Ders;

public interface dersFabrikasi {

    Ders dersOlustur(String baslik, String aciklama, int ucret,
                     String ogretmen, String icerik, int sureDakika,
 Object... extraArgs);

    DersKimligi kimlikOlustur(String ogretmen, String alan, 
    		int soruSayisi,  Object... extraArgs);
}
