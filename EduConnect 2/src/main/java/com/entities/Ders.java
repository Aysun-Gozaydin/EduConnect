package com.entities;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ders_tipi")
public abstract class Ders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long dersId;

    public String baslik;

    public  String aciklama;

    public int ucret;

    public String ogretmen;     
    public String icerik;      
    public int sureDakika;      

    public Ders() {}
    
    @Transient
    private DersTalepBilgisi talepBilgisi;
    public DersTalepBilgisi getTalepBilgisi() {
        return talepBilgisi;
    }

    public void setTalepBilgisi(DersTalepBilgisi talepBilgisi) {
        this.talepBilgisi = talepBilgisi;
    }


    public Ders(String baslik, String aciklama, int ucret,
                String ogretmen, String icerik, int sureDakika) {
        this.baslik = baslik;
        this.aciklama = aciklama;
        this.ucret = ucret;
        this.ogretmen = ogretmen;
        this.icerik = icerik;
        this.sureDakika = sureDakika;
    }


    public Ders(String baslik, String aciklama, int ucret) {
        this(baslik, aciklama, ucret, null, null, 0);
    }

    public Long getDersId() { 
    	return dersId;
    	}
    public String getBaslik() { 
    	return baslik; 
    	}
    public String getAciklama() {
    	return aciklama;
    	}
    public int getUcret() { 
    	return ucret; 
    	}

    public String getOgretmen() { 
    	return ogretmen; 
    	}
    public String getIcerik() {
    	return icerik; 
    	}
    public int getSureDakika() { 
    	return sureDakika;
    	}

    public void setDersId(Long dersId) { 
    	this.dersId = dersId;
    	}
    public void setBaslik(String baslik) {
    	this.baslik = baslik;
    	}
    public void setAciklama(String aciklama) { 
    	this.aciklama = aciklama;
    	}
    public void setUcret(int ucret) { 
    	this.ucret = ucret; 
    	}

    public void setOgretmen(String ogretmen) { 
    	this.ogretmen = ogretmen;
    	}
    public void setIcerik(String icerik) { 
    	this.icerik = icerik;
    	}
    public void setSureDakika(int sureDakika) { 
    	this.sureDakika = sureDakika;
    	}

   
    public void ogrenciEkle(Object ogrenci){
      
    }

    
    public abstract void bilgiVer();
}
