package service;

import com.entities.odeme;

import service.odeme.ContextOdeme;
import service.odeme.*;

public class OdemeService { // temsili main sınıfı
	
	

	public boolean odemeYap(odeme odeme, String odemeYontemi) {
	ContextOdeme islem=new ContextOdeme();
	
	if (odemeYontemi == null) {
        throw new IllegalArgumentException("Ödeme yöntemi null olamaz.");
    }
	
	switch (odemeYontemi){
	case "KrediKartı":
		islem.setStrateji(new KrediKartıOdeme());
		break;
		
	case "KriptoOdeme":
		islem.setStrateji(new KriptoOdeme());
		break;
		
	case "PaypalOdeme":
		islem.setStrateji(new PaypalOdeme());
		break;
		
	 default:
         System.out.println("Geçersiz ödeme yöntemi: " + odemeYontemi);
         return false;	
	}
	
	return islem.odemeYap(odeme);

	}

}
