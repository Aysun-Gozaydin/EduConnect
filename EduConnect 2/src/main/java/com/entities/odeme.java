package com.entities;

import java.sql.Date;

public class odeme {

	 private Long odemeId;
	    private int tutar;
	    private Date tarih;
	    private String durum;

	    public odeme() {
	        this.durum = "BEKLEMEDE";
	    }


	    public odeme(Long odemeId, int tutar, Date tarih, String durum) {
	        this.odemeId = odemeId;
	        this.tutar = tutar;
	        this.tarih = tarih;
	        this.durum = "BEKLEMEDE";
	    }

	    public Long getOdemeId() {
	        return odemeId;
	    }

	    public int getTutar() {
	        return tutar;
	    }

	    public Date getTarih() {
	        return tarih;
	    }

	    public String getDurum() {
	        return durum;
	    }

	    public void setOdemeId(Long odemeId) {
	        this.odemeId = odemeId;
	    }

	    public void setTutar(int tutar) {
	        this.tutar = tutar;
	    }

	    public void setTarih(Date tarih) {
	        this.tarih = tarih;
	    }

	    public void setDurum(String durum) {
	        this.durum = durum;
	    }
	    
	    
}
