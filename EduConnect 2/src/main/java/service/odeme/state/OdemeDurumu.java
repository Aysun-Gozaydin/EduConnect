package service.odeme.state;

import com.entities.odeme;
import service.odeme.ContextOdeme;

public interface OdemeDurumu {

    boolean odemeYap(ContextOdeme context, odeme odeme);
    void iadeEt(ContextOdeme context, odeme odeme);
}
