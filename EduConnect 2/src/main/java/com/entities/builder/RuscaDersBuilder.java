package com.entities.builder;

import com.entities.RuscaDers;
import com.entities.Ders;

public class RuscaDersBuilder extends DersBuilder {

	protected String seviye;

	public RuscaDersBuilder seviye(String seviye) {
	    this.seviye = seviye;
	    return this;
	}
    @Override
    public Ders build() {
        return new RuscaDers(
                baslik,
                aciklama,
                ucret,
                seviye,
                ogretmen,
                icerik,
                sureDakika
        );
    }
}
