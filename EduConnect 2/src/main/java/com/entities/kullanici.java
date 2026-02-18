package com.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public abstract class kullanici {
	
	    private Long kullaniciId;
	    private String kullaniciAd;
	    private String kullaniciSoyad;
	    private String email;
	    private String sifre;
	    private LocalDateTime sonGiris;

	    
	    
	    public kullanici() {
	    }
	    
	    public kullanici(Long kullaniciId, String kullaniciAd, String kullaniciSoyad, String email, String sifre) {
	        this.kullaniciId = kullaniciId;
	        this.kullaniciAd = kullaniciAd;
	        this.kullaniciSoyad = kullaniciSoyad;
	        this.email = email;
	        this.sifre = sifre;
	    }

	    public Long getKullaniciId() {
	        return kullaniciId;
	    }

	    public String getKullaniciAd() {
	        return kullaniciAd;
	    }

	    public String getKullaniciSoyad() {
	        return kullaniciSoyad;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getSifre() {
	        return sifre;
	    }
	    public LocalDateTime getSonGiris() {
	        return sonGiris;
	    }

	    public void setKullaniciId(Long kullaniciId) {
	        this.kullaniciId = kullaniciId;
	    }

	    public void setKullaniciAd(String kullaniciAd) {
	        this.kullaniciAd = kullaniciAd;
	    }

	    public void setKullaniciSoyad(String kullaniciSoyad) {
	        this.kullaniciSoyad = kullaniciSoyad;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public void setSifre(String sifre) {
	        this.sifre = sifre;
	    }
	    
	    

	   public boolean GirisYap(String email , String sifre){
	       if(this.email.equals(email) && this.sifre.equals(sifre)){
	           this.sonGiris=LocalDateTime.now();
	           System.out.println("Sn. "+ this.kullaniciAd+" "+ this.kullaniciSoyad+ " sisteme başarıyla giriş yaptınız...");
	           return true;
	       }
	       else{
	           System.out.println("Sisteme giriş yapamadınız. Bilgilerinizi kontrol edip tekrar deneyiniz!!!");
	                  
	       }
	       return false;
	   }
	   
	   @Override
	   public String toString(){
	    return "Kullanici{" +
	            "id=" + this.kullaniciId +
	            ", ad=" + this.kullaniciAd+
	            ", soyad="+ this.kullaniciSoyad+
	            ", email="+ this.email +
	            "}";
	            
	}
	   
	    
	    

}
