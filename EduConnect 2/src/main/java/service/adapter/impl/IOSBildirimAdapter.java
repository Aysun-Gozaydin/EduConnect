package service.adapter.impl;

import service.adapter.BildirimAdapter;

public class IOSBildirimAdapter implements BildirimAdapter{

	@Override
	public void gonder(String mesaj) {
		System.out.println("[iOS Bildirim] " + mesaj);
		
	}

}