package com.entities;

import java.sql.Date;

public class mesaj {
	
	 private Long mesajId;
	    private String icerik;
	    private Date gönderimTarihi;

	    public mesaj() {
	    }

	    public mesaj(Long mesajId, String icerik, Date gönderimTarihi) {
	        this.mesajId = mesajId;
	        this.icerik = icerik;
	        this.gönderimTarihi = gönderimTarihi;
	    }

	    public Long getMesajId() {
	        return mesajId;
	    }

	    public String getIcerik() {
	        return icerik;
	    }

	    public Date getGönderimTarihi() {
	        return gönderimTarihi;
	    }

	    public void setMesajId(Long mesajId) {
	        this.mesajId = mesajId;
	    }

	    public void setIcerik(String icerik) {
	        this.icerik = icerik;
	    }

	    public void setGönderimTarihi(Date gönderimTarihi) {
	        this.gönderimTarihi = gönderimTarihi;
	    }
	    
	    
	    
	    public void Gonder(){
	        
	    }
	    
	    public String Al(){
	        
	       return "a";
	    }

}
