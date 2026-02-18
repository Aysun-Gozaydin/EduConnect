package service.observer.impl;

import service.notification.BildirimService;
import service.observer.TalepObserver;

public class OgrenciEmailObserver implements TalepObserver {

    private final BildirimService bildirimService;

    public OgrenciEmailObserver(BildirimService bildirimService) {
        this.bildirimService = bildirimService;
    }

    @Override
    public void guncelleme(String mesaj) {
        bildirimService.bildirimGonder("Öğrenci Email: " + mesaj);
    }
}
