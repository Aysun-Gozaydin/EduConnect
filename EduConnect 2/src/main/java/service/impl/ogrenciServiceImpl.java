package service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import com.*;
import com.entities.ogrenci;
import repository.*;
import dto.*;
import service.*;
@Service 
public class ogrenciServiceImpl implements ogrenciService {
	
	private static volatile ogrenciServiceImpl instance;
	private final ogrenciRepository ogrenciRepository;
	
	
	
	public ogrenciServiceImpl(ogrenciRepository ogrenciRepository) {
		this.ogrenciRepository= ogrenciRepository;
		
				instance=this;    
				//Service anatasyonu sayesinde oluşan beani kullan demek istiyor bu satırda 
		
		
	}
	
	public static ogrenciServiceImpl getInstance() {
		
		if(instance == null) {
			synchronized(ogrenciServiceImpl.class) {
				if(instance == null) {
					throw new IllegalStateException("Spring henüz ogrenciServiceImpl nesnesini oluşturmadı!!!"); //Bu satırda nesne oluşturmamamızın ebebi spring kendisi oluşturuyor çünkü biz tekrardan oluşturursak hata alırırz          
				}
			}
		}
		
		return instance;
	}

	@Override
	public List<ogrenciDto> tumOgrencileriGetir(){
		return null;
	}
	
	@Override
	public ogrenciDto ogrenciBul(Long kullaniciId){
		return null;
	}
	
	@Override
	public ogrenciDto ogrenciKaydet(ogrenciDto dto) {
		return null;
	}
	
	@Override
	public void ogrenciSil(Long kullaniciId) {
		
	}
	
	private ogrenciDto ogrenciSwapDto(ogrenci ogrenci) {
		ogrenciDto dto= new ogrenciDto();
		dto.setKullaniciId(ogrenci.getKullaniciId());
		dto.setKullaniciAd(ogrenci.getKullaniciAd());
		dto.setKullaniciSoyad(ogrenci.getKullaniciSoyad());
		dto.setOgrenciNo(ogrenci.getOgrenciNo());
		
		return dto;
	}
	
	//private ogrenci DtoSwapOgrenci(ogrenciDto dto) {//hocaya sorulacak
	//	ogrenci ogrenci = new ogrenci();
		//ogrenci.set
	//}

}
