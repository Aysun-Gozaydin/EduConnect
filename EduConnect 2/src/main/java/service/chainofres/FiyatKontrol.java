package service.chainofres;

import com.entities.DersTalepBilgisi;

public class FiyatKontrol extends DersHandler {

    @Override
    public boolean handle(DersTalepBilgisi talep) {

        if (talep.getOgrenciButce() <= 0) {
            System.out.println(" Bütçe sıfır veya negatif olamaz!");
            return false;
        }

        

        System.out.println(" Fiyat kontrolü başarılı.");
        return nextHandle(talep);
    }
}
