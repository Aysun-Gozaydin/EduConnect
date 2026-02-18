package dto;


import lombok.Data;
import lombok.Getter;

import lombok.Setter;


@Getter
@Setter
@Data
public class ogrenciDto {
	

    private Long kullaniciId;
    private String kullaniciAd;
    private String kullaniciSoyad;
    private int ogrenciNo;

    
    public ogrenciDto() {
    }
    
    public ogrenciDto(Long kullaniciId, String kullaniciAd, String kullaniciSoyad, int ogrenciNo) {
        this.kullaniciId = kullaniciId;
        this.kullaniciAd = kullaniciAd;
        this.kullaniciSoyad = kullaniciSoyad;
        this.ogrenciNo= ogrenciNo;
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
    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
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
