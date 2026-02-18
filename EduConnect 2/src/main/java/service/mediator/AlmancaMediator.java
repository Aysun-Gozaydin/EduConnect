package service.mediator;

import com.entities.*;
import service.chainofres.KriterHandler;
import service.chainofres.DersZinciriKurucu;

import java.util.List;

public class AlmancaMediator implements DilMediator {

    @Override
    public List<Ders> uygunDersleriBul(
            DersTalepBilgisi talep,
            List<Ders> mevcutDersler) {

        var chain = DersZinciriKurucu.olusturZincir();
        if (!chain.handle(talep)) {
            System.out.println("Almanca için talep geçersiz.");
            return List.of();
        }

        return mevcutDersler.stream()
                .filter(d -> d instanceof AlmancaDers)
                .filter(d -> new KriterHandler(d).handle(talep))
                .toList();
    }
}
