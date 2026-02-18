package service.notification;

import service.adapter.BildirimAdapter;

public class BildirimService {

    private final BildirimAdapter adapter;

    public BildirimService(BildirimAdapter adapter) {
        this.adapter = adapter;
    }

    public void bildirimGonder(String mesaj) {
        adapter.gonder(mesaj);
    }
}
