package service.observer.impl;

import service.observer.TalepObserver;

public class AdminLogObserver implements TalepObserver {

    @Override
    public void guncelleme(String mesaj) {
        System.out.println("[ADMIN LOG] " + mesaj);
    }
}
