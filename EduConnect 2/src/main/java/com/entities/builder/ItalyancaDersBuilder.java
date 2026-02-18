package com.entities.builder;


import com.entities.Ders;
import com.entities.ItalyancaDers;

public class ItalyancaDersBuilder extends DersBuilder {

	protected String seviye;

	public ItalyancaDersBuilder seviye(String seviye) {
	    this.seviye = seviye;
	    return this;
	}
		@Override
		public Ders build() {
			return new ItalyancaDers(
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
