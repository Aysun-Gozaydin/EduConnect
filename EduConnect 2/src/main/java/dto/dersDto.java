package dto;

public class dersDto {

    private Long dersId;
    private String baslik;
    private String aciklama;
    private int ucret;
    private String ogretmen;
    private String icerik;
    private int sureDakika;

    public dersDto() {
    }

    public dersDto(Long dersId, String baslik, String aciklama, int ucret,
                   String ogretmen, String icerik, int sureDakika) {
        this.dersId = dersId;
        this.baslik = baslik;
        this.aciklama = aciklama;
        this.ucret = ucret;
        this.ogretmen = ogretmen;
        this.icerik = icerik;
        this.sureDakika = sureDakika;
    }

    public Long getDersId() {
        return dersId;
    }

    public void setDersId(Long dersId) {
        this.dersId = dersId;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public String getOgretmen() {
        return ogretmen;
    }

    public void setOgretmen(String ogretmen) {
        this.ogretmen = ogretmen;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public int getSureDakika() {
        return sureDakika;
    }

    public void setSureDakika(int sureDakika) {
        this.sureDakika = sureDakika;
    }
}
