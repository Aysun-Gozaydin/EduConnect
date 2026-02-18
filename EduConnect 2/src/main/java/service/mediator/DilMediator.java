package service.mediator;

import com.entities.Ders;
import com.entities.DersTalepBilgisi;
import java.util.List;

public interface DilMediator {

    List<Ders> uygunDersleriBul(
            DersTalepBilgisi talep,
            List<Ders> mevcutDersler
    );
}
