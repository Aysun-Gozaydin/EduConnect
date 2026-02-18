package service.odeme.state;

import com.entities.odeme;
import service.odeme.ContextOdeme;

public class BasarisizOdeme implements OdemeDurumu {

    @Override
    public boolean odemeYap(ContextOdeme context, odeme odeme) {
        System.out.println("Ödeme tekrar deneniyor...");
        context.setDurum(new BeklemedeOdeme());
        return context.odemeYap(odeme);
    }

    @Override
    public void iadeEt(ContextOdeme context, odeme odeme) {
        throw new IllegalStateException("Başarısız ödeme iade edilemez");
    }
}
