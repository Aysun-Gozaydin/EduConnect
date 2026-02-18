package com.entities;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class ogretmen extends kullanici {
	
	    private String uzmanlikAlani;
	    private int deneyimYili;

	    public ogretmen() {
	        super();
	    }

	    public ogretmen(String uzmanlikAlani, int deneyimYili, Long kullaniciId, String kullaniciAd, String kullaniciSoyad, String email, String sifre) {
	        super(kullaniciId, kullaniciAd, kullaniciSoyad, email, sifre);
	        this.uzmanlikAlani = uzmanlikAlani;
	        this.deneyimYili = deneyimYili;
	    }

	    public String getUzmanlikAlani() {
	        return uzmanlikAlani;
	    }

	    public int getDeneyimYili() {
	        return deneyimYili;
	    }

	    public void setUzmanlikAlani(String uzmanlikAlani) {
	        this.uzmanlikAlani = uzmanlikAlani;
	    }

	    public void setDeneyimYili(int deneyimYili) {
	        this.deneyimYili = deneyimYili;
	    }

	    
	    public void dersOlustur(String dersAdi){
	        System.out.println(getKullaniciAd()+" adli ogretmen "+dersAdi+" adli dersi olusturdu");
	    }
	    
	    
	    public void odevOlustur(String odevBasligi, LocalDateTime teslimTarihi){
	      System.out.println(getKullaniciAd()+" adli ogretmen "+odevBasligi+" adli dersi olusturdu");   
	    }
	    
	    public void sinavOlustur(String sinavAdi, LocalDateTime sinavTarihi){
	        System.out.println(getKullaniciAd()+" adli ogretmen "+sinavAdi+" adli sınavı olusturdu. Sinav tarihi"+sinavTarihi);
	    }
	    
	    public void notGir(String ogrenciAdi, double not){
	        System.out.println(getKullaniciAd()+" adli ögretmen "+ ogrenciAdi+ " adli ogrencisine"+not+" notunu girdi");
	    }
	    
	    
	    
	    
	    
	    @Override
	   public String toString(){
	    return "Kullanici{" +
	            "id=" + getKullaniciId() +
	            ", ad=" + getKullaniciAd()+
	            ", soyad="+ getKullaniciSoyad()+
	            ", email="+ getEmail() +
	            ", deneyim yılı=" + this.deneyimYili+
	            ", uzmanlık alanı=" +this.uzmanlikAlani+
	            "}";
	            
	}
	    

}
