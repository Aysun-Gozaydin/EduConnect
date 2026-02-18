package service;

import java.util.List;
import dto.*;

public interface ogretmenService {
	
	List<ogretmenDto> tumOgretmenleriGetir();
	ogretmenDto ogretmenBul(Long kullaniciId);
	ogretmenDto ogretmenKaydet(ogretmenDto dto);
	void ogretmenSil(Long kullaniciId);
	

}
