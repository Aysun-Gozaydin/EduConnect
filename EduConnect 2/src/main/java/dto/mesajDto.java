package dto;

import java.sql.Date;

public class mesajDto {

    private Long mesajId;
    private String icerik;
    private Date gonderimTarihi;

    public mesajDto() {
    }

    public mesajDto(Long mesajId, String icerik, Date gonderimTarihi) {
        this.mesajId = mesajId;
        this.icerik = icerik;
        this.gonderimTarihi = gonderimTarihi;
    }

    public Long getMesajId() {
        return mesajId;
    }

    public void setMesajId(Long mesajId) {
        this.mesajId = mesajId;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public Date getGonderimTarihi() {
        return gonderimTarihi;
    }

    public void setGonderimTarihi(Date gonderimTarihi) {
        this.gonderimTarihi = gonderimTarihi;
    }
}
