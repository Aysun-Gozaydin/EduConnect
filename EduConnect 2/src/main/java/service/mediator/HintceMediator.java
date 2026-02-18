package service.mediator;

import java.util.List;

import com.entities.*;
import service.chainofres.DersZinciriKurucu;
import service.chainofres.KriterHandler;

public class HintceMediator implements DilMediator {

	 @Override
	    public List<Ders> uygunDersleriBul(
	            DersTalepBilgisi talep,
	            List<Ders> mevcutDersler) {

	        var chain = DersZinciriKurucu.olusturZincir();
	        if (!chain.handle(talep)) {
	            System.out.println("Hintçe için talep geçersiz.");
	            return List.of();
	        }

	        return mevcutDersler.stream()
	                .filter(d -> d instanceof HintceDers)
	                .filter(d -> new KriterHandler(d).handle(talep))
	                .toList();
	    }
}
