package service.odeme;

import com.entities.odeme;
import service.odeme.state.BeklemedeOdeme;
import service.odeme.state.OdemeDurumu;

public class ContextOdeme {

    private OdemeStratejisi strateji;
    private OdemeDurumu durum;

    public ContextOdeme() {
        this.durum = new BeklemedeOdeme();
    }

    public void setStrateji(OdemeStratejisi strateji) {
        this.strateji = strateji;
    }

    public OdemeStratejisi getStrateji() {
        return strateji;
    }

    public void setDurum(OdemeDurumu durum) {
        this.durum = durum;
    }

    public boolean odemeYap(odeme odeme) {
        return durum.odemeYap(this, odeme);
    }

    public void iadeEt(odeme odeme) {
        durum.iadeEt(this, odeme);
    }
}
