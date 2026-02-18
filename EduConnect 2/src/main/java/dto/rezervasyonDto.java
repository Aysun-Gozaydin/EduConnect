package dto;

import java.sql.Date;

public class rezervasyonDto {

    private Long rezervasyonId;
    private Date tarih;
    private String durum;

    public rezervasyonDto() {
    }

    public rezervasyonDto(Long rezervasyonId, Date tarih, String durum) {
        this.rezervasyonId = rezervasyonId;
        this.tarih = tarih;
        this.durum = durum;
    }

    public Long getRezervasyonId() {
        return rezervasyonId;
    }

    public void setRezervasyonId(Long rezervasyonId) {
        this.rezervasyonId = rezervasyonId;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }
}
