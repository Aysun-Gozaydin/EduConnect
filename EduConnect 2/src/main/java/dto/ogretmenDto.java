package dto;


import lombok.Data;

import lombok.Getter;

import lombok.Setter;


@Getter
@Setter
@Data
public class ogretmenDto {

	    private Long kullaniciId;
	    private String kullaniciAd;
	    private String kullaniciSoyad;
	    private String uzmanlikAlani;
	    
    
	    
	    public ogretmenDto() {
	    }
	    
	    public ogretmenDto(Long kullaniciId, String kullaniciAd, String kullaniciSoyad, String uzmanlikAlani) {
	        this.kullaniciId = kullaniciId;
	        this.kullaniciAd = kullaniciAd;
	        this.kullaniciSoyad = kullaniciSoyad;
	        this.uzmanlikAlani= uzmanlikAlani;
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


	    public String getUzmanlikAlani() {
	        return uzmanlikAlani;
	    }


	    public void setUzmanlikAlani(String uzmanlikAlani) {
	        this.uzmanlikAlani = uzmanlikAlani;
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
}
