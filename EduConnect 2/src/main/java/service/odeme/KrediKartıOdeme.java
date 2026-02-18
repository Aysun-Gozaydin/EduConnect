package service.odeme;

import com.entities.odeme;

public class KrediKartıOdeme implements OdemeStratejisi {

    @Override
    public boolean odemeYap(odeme odeme) {
        System.out.println("Kredi kartı ile ödeme yapıldı");
        return true;
    }
}
