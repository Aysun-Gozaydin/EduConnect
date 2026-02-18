package com.entities.builder;

import com.entities.Ders;

public abstract class DersBuilder {
    public Long dersId;
    public String baslik;
    public String aciklama;
    public int ucret;
    public String ogretmen;     
    public String icerik;      
    public int sureDakika;      
    

    public DersBuilder baslik(String baslik) {
    	this.baslik=baslik;
    	return this;
    }
    
    public DersBuilder aciklama(String aciklama) {
    	this.aciklama=aciklama;
    	return this;
    }
    
    public DersBuilder ucret(int ucret) {
    	this.ucret=ucret;
    	return this;
    }
    
    public DersBuilder ogretmen(String ogretmen) {
    	this.ogretmen=ogretmen;
    	return this;
    }
    
    public DersBuilder icerik(String icerik) {
    	this.icerik=icerik;
    	return this;
    }
    
    public DersBuilder sureDakika(int sureDakika) {
    	this.sureDakika=sureDakika;
    	return this;
    }
    
    
    public abstract Ders build();
    
    
    
    
}
