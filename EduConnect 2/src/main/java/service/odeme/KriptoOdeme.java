package service.odeme;

import com.entities.odeme;

public class KriptoOdeme implements OdemeStratejisi {

    @Override
    public boolean odemeYap(odeme odeme) {
        System.out.println("Kripto ile ödeme yapıldı");
        return true;
    }
}
