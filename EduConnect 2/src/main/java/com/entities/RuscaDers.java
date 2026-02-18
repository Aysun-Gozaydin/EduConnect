package com.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("RUSCA")
public class RuscaDers extends Ders {
    private String seviye;

    public RuscaDers() {}

    public RuscaDers(String baslik, String aciklama, int ucret, String seviye,
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
        System.out.println("Rusça Ders - Başlık: " + getBaslik() + " | Seviye: " + seviye);
    }
}
