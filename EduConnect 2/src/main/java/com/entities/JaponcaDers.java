package com.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("JAPONYA")
public class JaponcaDers extends Ders {
    private String seviye;

    public JaponcaDers() {}

    public JaponcaDers(String baslik, String aciklama, int ucret, String seviye,
                       String ogretmen, String icerik, int sureDakika) {
        super(baslik, aciklama, ucret, ogretmen, icerik, sureDakika);
        this.seviye = seviye;
    }

    public String getSeviye() { 
    	return seviye;
    	}
    public void setSeviye(String seviye) {
    	this.seviye = seviye; 
    	}

    @Override
    public void bilgiVer() {
        System.out.println("Japonca Ders | Başlık: " + getBaslik() +
                           " | Seviye: " + seviye +
                           " | Süre: " + getSureDakika() +
                           " dk | Ücret: " + getUcret() + "₺");
    }
}
