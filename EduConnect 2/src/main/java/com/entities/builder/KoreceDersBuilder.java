package com.entities.builder;

import com.entities.Ders;
import com.entities.KoreceDers;

public class KoreceDersBuilder extends DersBuilder {

	protected String seviye;

	public KoreceDersBuilder seviye(String seviye) {
	    this.seviye = seviye;
	    return this;
	}
	@Override
	public Ders build() {
		return new KoreceDers(
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
