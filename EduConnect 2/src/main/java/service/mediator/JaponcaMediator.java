package service.mediator;

import java.util.List;

import com.entities.*;
import service.chainofres.DersZinciriKurucu;
import service.chainofres.KriterHandler;
public class JaponcaMediator implements DilMediator {

    @Override
    public List<Ders> uygunDersleriBul(
            DersTalepBilgisi talep,
            List<Ders> mevcutDersler) {

        var chain = DersZinciriKurucu.olusturZincir();
        if (!chain.handle(talep)) {
            System.out.println("Japonca için talep geçersiz.");
            return List.of();
        }

        return mevcutDersler.stream()
                .filter(d -> d instanceof JaponcaDers)
                .filter(d -> new KriterHandler(d).handle(talep))
                .toList();
    }
}
