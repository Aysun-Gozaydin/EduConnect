package service.adapter.impl;

import service.adapter.BildirimAdapter;
import service.android.AndroidPushService;

public class AndroidBildirimAdapter implements BildirimAdapter {

    private final AndroidPushService androidPushService;

    public AndroidBildirimAdapter(AndroidPushService androidPushService) {
        this.androidPushService = androidPushService;
    }

    @Override
    public void gonder(String mesaj) {

        androidPushService.push(mesaj, 1);
    }
}
