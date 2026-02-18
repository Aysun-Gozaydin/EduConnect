package service.impl;

import com.entities.DersTalepBilgisi;
import org.springframework.stereotype.Service;
import service.DersTalepService;
import service.observer.DersTalepSubject;

@Service
public class DersTalepServiceImpl implements DersTalepService {

    private final DersTalepSubject subject;

    public DersTalepServiceImpl(DersTalepSubject subject) {
        this.subject = subject;
    }

    @Override
    public String talepOlustur(DersTalepBilgisi talep) {

        System.out.println("Ders talebi oluşturuldu: " + talep.getOgrenciSeviyesi());

        subject.notifyObservers(
                "Yeni bir ders talebi oluşturuldu! Öğrenci Seviyesi: "
                        + talep.getOgrenciSeviyesi()
        );

        return "Talep başarıyla oluşturuldu.";
    }
}
