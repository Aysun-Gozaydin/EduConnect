package com.entities.builder;
import com.entities.HintceDers;
import com.entities.Ders;

public class HintceDersBuilder extends DersBuilder{

	protected String seviye;

	public HintceDersBuilder seviye(String seviye) {
	    this.seviye = seviye;
	    return this;
	}
	 
	    @Override
	    public Ders build() {
	        return new HintceDers(
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
