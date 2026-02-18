package service.chainofres;

import com.entities.DersTalepBilgisi;

public class EgitimSuresiKontrol extends DersHandler {

    @Override
    public boolean handle(DersTalepBilgisi talep) {

        if (talep.getTercihSure() <= 0) {
            System.out.println(" Tercih edilen süre geçersiz!");
            return false;
        }


        System.out.println(" Eğitim süresi kontrolü başarılı.");
        return nextHandle(talep);
    }
}
