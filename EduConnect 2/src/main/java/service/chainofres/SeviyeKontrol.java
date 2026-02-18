package service.chainofres;

import com.entities.DersTalepBilgisi;

public class SeviyeKontrol extends DersHandler {

    @Override
    public boolean handle(DersTalepBilgisi talep) {

        if (talep.getOgrenciSeviyesi() == null || talep.getOgrenciSeviyesi().isEmpty()) {
            System.out.println(" Öğrenci seviyesi belirtilmemiş!");
            return false;
        }

        System.out.println(" Seviye kontrolü başarılı.");
        return nextHandle(talep);
    }
}
