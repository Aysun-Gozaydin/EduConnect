package com.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ogrenci extends kullanici{
	
	    private int ogrenciNo;
	    private Date kayitTarihi;
	    private List<rezervasyon> rezervasyonlar= new ArrayList<>();
	   

	    
	    
	    public ogrenci() {
	    }
	    
	    public ogrenci(int ogrenciNo, Date kayitTarihi, Long kullaniciId, String kullaniciAd, String kullaniciSoyad, String email, String sifre) {
	        super(kullaniciId, kullaniciAd, kullaniciSoyad, email, sifre);
	        this.ogrenciNo = ogrenciNo;
	        this.kayitTarihi = kayitTarihi;
	    }
	    
	  
	    

	    public int getOgrenciNo() {
	        return ogrenciNo;
	    }

	    public Date getKayitTarihi() {
	        return kayitTarihi;
	    }

	    public void setOgrenciNo(int ogrenciNo) {
	        this.ogrenciNo = ogrenciNo;
	    }

	    public void setKayitTarihi(Date kayitTarihi) {
	        this.kayitTarihi = kayitTarihi;
	    }
	    
	    

}
