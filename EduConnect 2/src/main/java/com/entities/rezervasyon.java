package com.entities;

import java.sql.Date;

public class rezervasyon {
	
	 private Long rezervasyonId;
	    private Date tarih;
	    private String durum;

	    public rezervasyon() {
	    }

	    public rezervasyon(Long rezervasyonId, Date tarih, String durum) {
	        this.rezervasyonId = rezervasyonId;
	        this.tarih = tarih;
	        this.durum = durum;
	    }

	    
	    
	    public Long getRezervasyonId() {
	        return rezervasyonId;
	    }

	    public Date getTarih() {
	        return tarih;
	    }

	    public String getDurum() {
	        return durum;
	    }

	    public void setRezervasyonId(Long rezervasyonId) {
	        this.rezervasyonId = rezervasyonId;
	    }

	    public void setTarih(Date tarih) {
	        this.tarih = tarih;
	    }

	    public void setDurum(String durum) {
	        this.durum = durum;
	    }
	    
	    
	        
	    public void Onayla(){
	        
	    }
	    
	    public void İptalEt(){
	        
	    }
	    
	    

}
