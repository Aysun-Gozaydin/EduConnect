package service.odeme.state;

import com.entities.odeme;
import service.odeme.ContextOdeme;

public class BasariliOdeme implements OdemeDurumu {

    @Override
    public boolean odemeYap(ContextOdeme context, odeme odeme) {
        throw new IllegalStateException("Ödeme zaten başarılı");
    }

    @Override
    public void iadeEt(ContextOdeme context, odeme odeme) {
        odeme.setDurum("IADE_EDILDI");
        context.setDurum(new IadeEdildiOdeme());
        System.out.println("Ödeme iade edildi");
    }
}
