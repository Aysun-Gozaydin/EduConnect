package service.odeme.state;

import com.entities.odeme;
import service.odeme.ContextOdeme;

public class BeklemedeOdeme implements OdemeDurumu {

    @Override
    public boolean odemeYap(ContextOdeme context, odeme odeme) {

        boolean sonuc = context.getStrateji().odemeYap(odeme);

        if (sonuc) {
            odeme.setDurum("BASARILI");
            context.setDurum(new BasariliOdeme());
            System.out.println("Ödeme başarılı");
        } else {
            odeme.setDurum("BASARISIZ");
            context.setDurum(new BasarisizOdeme());
            System.out.println("Ödeme başarısız");
        }

        return sonuc;
    }

    @Override
    public void iadeEt(ContextOdeme context, odeme odeme) {
        throw new IllegalStateException("Beklemedeki ödeme iade edilemez");
    }
}
