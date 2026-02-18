package service.odeme;

import com.entities.odeme;

public class PaypalOdeme implements OdemeStratejisi {

    @Override
    public boolean odemeYap(odeme odeme) {
        System.out.println("Paypal ile ödeme yapıldı");
        return true;
    }
}
