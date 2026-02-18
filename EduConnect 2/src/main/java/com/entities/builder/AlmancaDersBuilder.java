package com.entities.builder;

import com.entities.AlmancaDers;
import com.entities.Ders;

public class AlmancaDersBuilder extends DersBuilder {

	protected String seviye;

	public AlmancaDersBuilder seviye(String seviye) {
	    this.seviye = seviye;
	    return this;
	}

	
	@Override
	public Ders build() {
		
		return new AlmancaDers(baslik, aciklama,ucret, seviye,ogretmen,icerik, sureDakika );
	}

}
