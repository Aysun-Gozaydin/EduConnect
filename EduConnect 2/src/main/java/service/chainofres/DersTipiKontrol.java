package service.chainofres;


import com.entities.DersTalepBilgisi;

public class DersTipiKontrol extends DersHandler {

    @Override
    public boolean handle(DersTalepBilgisi talep) {

        if (talep.getTercihDersTipi() == null) {
            System.out.println("Ders tipi belirtilmemiş!");
            return false;
        }

        System.out.println("Ders tipi kontrolü başarılı.");
        return nextHandle(talep);
    }
}
