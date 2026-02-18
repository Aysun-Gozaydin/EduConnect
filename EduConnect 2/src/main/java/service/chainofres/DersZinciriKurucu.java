package service.chainofres;

public class DersZinciriKurucu {

    public static DersHandler olusturZincir() {

        DersHandler seviye = new SeviyeKontrol();
        DersHandler fiyat = new FiyatKontrol();
        DersHandler sure = new EgitimSuresiKontrol();
        DersHandler tipi = new DersTipiKontrol();

    
        seviye.setNext(fiyat);
        fiyat.setNext(sure);
        sure.setNext(tipi);

  
        return seviye;
    }
}
