package com.entities;

public class DersTalepBilgisi {

    private String ogrenciSeviyesi;
    private int ogrenciButce;
    private String tercihOgretmen;
    private String tercihDersTipi;
    private int tercihSure;

    public DersTalepBilgisi() {}

    public DersTalepBilgisi(String ogrenciSeviyesi, int ogrenciButce,
                            String tercihOgretmen, String tercihDersTipi,
                            int tercihSure) {

        this.ogrenciSeviyesi = ogrenciSeviyesi;
        this.ogrenciButce = ogrenciButce;
        this.tercihOgretmen = tercihOgretmen;
        this.tercihDersTipi = tercihDersTipi;
        this.tercihSure = tercihSure;
    }

    public String getOgrenciSeviyesi() { return ogrenciSeviyesi; }
    public void setOgrenciSeviyesi(String ogrenciSeviyesi) { this.ogrenciSeviyesi = ogrenciSeviyesi; }

    public int getOgrenciButce() { return ogrenciButce; }
    public void setOgrenciButce(int ogrenciButce) { this.ogrenciButce = ogrenciButce; }

    public String getTercihOgretmen() { return tercihOgretmen; }
    public void setTercihOgretmen(String tercihOgretmen) { this.tercihOgretmen = tercihOgretmen; }

    public String getTercihDersTipi() { return tercihDersTipi; }
    public void setTercihDersTipi(String tercihDersTipi) { this.tercihDersTipi = tercihDersTipi; }

    public int getTercihSure() { return tercihSure; }
    public void setTercihSure(int tercihSure) { this.tercihSure = tercihSure; }
}
