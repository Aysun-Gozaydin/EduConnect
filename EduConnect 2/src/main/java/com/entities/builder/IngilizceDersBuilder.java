package com.entities.builder;

import com.entities.Ders;
import com.entities.IngilizceDers;

public class IngilizceDersBuilder extends DersBuilder {

	protected String seviye;

	public IngilizceDersBuilder seviye(String seviye) {
	    this.seviye = seviye;
	    return this;
	}
	@Override
	public Ders build() {
		return new IngilizceDers(
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
