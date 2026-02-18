package service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.*;
import com.entities.ogrenci;

import service.*;
import repository.*;
import dto.*;

@Service 
public class ogretmenServiceImpl implements ogretmenService{

	private static volatile ogretmenServiceImpl instance;
	private final ogretmenRepository ogretmenRepository;
	
	public ogretmenServiceImpl(ogretmenRepository ogretmenRepository) {
		this.ogretmenRepository=ogretmenRepository;
					instance=this;
	
	}
	 
	public static ogretmenServiceImpl getInstance(){
		if(instance==null) {
			
			synchronized(ogretmenServiceImpl.class) {
				if(instance==null) {
					throw new IllegalStateException("spring nesneyi daha oluşturmadi!");
				}
			}
		}
		return instance;
	}
	
	
	@Override
	public List<ogretmenDto> tumOgretmenleriGetir(){
		return null;
	}
	@Override
	public ogretmenDto ogretmenBul(Long kullaniciId) {
		return null;
	}
	@Override
	public ogretmenDto ogretmenKaydet(ogretmenDto dto) {
		return null;
	}
	@Override 
	public void ogretmenSil(Long kullaniciId) {
		
	}
	
	private ogretmenDto ogretmenSwapDto(com.entities.ogretmen ogretmen) {
		ogretmenDto dto= new ogretmenDto();
		dto.setKullaniciId(ogretmen.getKullaniciId());
		dto.setKullaniciAd(ogretmen.getKullaniciAd());
		dto.setKullaniciSoyad(ogretmen.getKullaniciSoyad());
		dto.setUzmanlikAlani(ogretmen.getUzmanlikAlani());
		
		return dto;
	}
	
	//private ogrenci DtoSwapOgrenci(ogrenciDto dto) {//hocaya sorulacak
	//	ogrenci ogrenci = new ogrenci();
		//ogrenci.set
	//}
	
	
	
	
	
	
	
}
