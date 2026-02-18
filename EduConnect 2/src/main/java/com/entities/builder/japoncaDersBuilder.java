package com.entities.builder;

import com.entities.Ders;
import com.entities.JaponcaDers;

public class japoncaDersBuilder extends DersBuilder {

	protected String seviye;

	public japoncaDersBuilder seviye(String seviye) {
	    this.seviye = seviye;
	    return this;
	}
	@Override
	public Ders build() {
		return new JaponcaDers(
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
 