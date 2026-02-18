package service.observer.impl;

import service.notification.BildirimService;
import service.observer.TalepObserver;

public class OgretmenBildirimObserver implements TalepObserver {

    private final BildirimService bildirimService;

    public OgretmenBildirimObserver(BildirimService bildirimService) {
        this.bildirimService = bildirimService;
    }

    @Override
    public void guncelleme(String mesaj) {
        bildirimService.bildirimGonder("Öğretmen Bildirimi: " + mesaj);
    }
}
