package service;
import java.util.List;


import dto.*;
public interface ogrenciService {

	List<ogrenciDto> tumOgrencileriGetir();
	ogrenciDto ogrenciBul(Long kullaniciId);
	ogrenciDto ogrenciKaydet(ogrenciDto dto);
	
	void ogrenciSil(Long kullaniciId);
}
