package service.odeme.state;

import com.entities.odeme;
import service.odeme.ContextOdeme;

public class IadeEdildiOdeme implements OdemeDurumu {

    @Override
    public boolean odemeYap(ContextOdeme context, odeme odeme) {
        throw new IllegalStateException("İade edilmiş ödeme tekrar yapılamaz");
    }

    @Override
    public void iadeEt(ContextOdeme context, odeme odeme) {
        throw new IllegalStateException("Ödeme zaten iade edildi");
    }
}
