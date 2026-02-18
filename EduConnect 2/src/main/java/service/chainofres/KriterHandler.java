package service.chainofres;

import com.entities.Ders;
import com.entities.DersTalepBilgisi;

public class KriterHandler extends DersHandler {

    private Ders ders;

    public KriterHandler(Ders ders) {
        this.ders = ders;
    }

    @Override
    public boolean handle(DersTalepBilgisi talep) {

        if (!ders.getBaslik().contains(talep.getOgrenciSeviyesi())) {
            return false;
        }


        if (ders.getUcret() > talep.getOgrenciButce()) {
            return false;
        }


        if (ders.getSureDakika() > talep.getTercihSure()) {
            return false;
        }

     
        if (talep.getTercihDersTipi() != null && !talep.getTercihDersTipi().isEmpty()) {
 
            if (!ders.getBaslik().toLowerCase().contains(talep.getTercihDersTipi().toLowerCase())) {
                return false;
            }
        }

        return nextHandle(talep);
    }

    public Ders getDers() {
        return ders;
    }
}
