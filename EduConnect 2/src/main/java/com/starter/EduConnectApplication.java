package com.starter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import com.entities.AlmancaDers;
import com.entities.Ders;
import com.entities.DersTalepBilgisi;
import com.entities.IngilizceDers;
import com.entities.odeme;
import com.entities.builder.AlmancaDersBuilder;

import factory.dersFactory;
import factory.dersFabrikasi;
import factory.DersKimligi;

import service.adapter.impl.AndroidBildirimAdapter;
import service.adapter.impl.IOSBildirimAdapter;
import service.android.AndroidPushService;
import service.chainofres.KriterHandler;
import service.mediator.DilMediator;
import service.mediator.MediatorFactory;
import service.notification.BildirimService;
import service.observer.DersTalepSubject;
import service.observer.impl.AdminLogObserver;
import service.observer.impl.OgrenciEmailObserver;
import service.odeme.ContextOdeme;
import service.odeme.KrediKartıOdeme;
import service.odeme.KriptoOdeme;
import service.odeme.PaypalOdeme;
import service.odeme.state.BeklemedeOdeme;

@SpringBootApplication(
    exclude = {
        DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
    }
)
public class EduConnectApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EduConnectApplication.class, args);
    }

    @Override
    public void run(String... args) {
    	List<Ders> tumDersler = new ArrayList<>();

    	tumDersler.add(new AlmancaDers(
    	        "Almanca A1",
    	        "Temel Almanca",
    	        150,
    	        "A1",
    	        "Hans Müller",
    	        "A1 Gramer",
    	        40
    	));

    	tumDersler.add(new AlmancaDers(
    	        "Almanca A2",
    	        "Orta Seviye Almanca",
    	        250,
    	        "A2",
    	        "Hans Müller",
    	        "A2 Gramer",
    	        60
    	));

    	tumDersler.add(new IngilizceDers(
    	        "İngilizce B1",
    	        "Orta Seviye İngilizce",
    	        200,
    	        "B1",
    	        "John Smith",
    	        "B1 Grammar",
    	        45
    	));


        /* ================= BUILDER TEST ================= */
        System.out.println("\n\n=== BUILDER DENEME BAŞLADI ===");

        Ders ders = new AlmancaDersBuilder()
                .seviye("A1")
                .ucret(600)
                .ogretmen("Hans Müller")
                .baslik("Almanca A1")
                .aciklama("Başlangıç seviyesi Almanca")
                .icerik("Temel gramer ve konuşma")
                .sureDakika(60)
                .build();

        ders.bilgiVer();
        Ders ders2= new AlmancaDersBuilder()
                .seviye("B2")
                
                .ogretmen("Gamze Nur Polat")
                .ucret(1000)
                .baslik("Almanca B2")
                .aciklama("İleri seviyesi Almanca")
                .icerik("Detaylı gramer ve konuşma")
                .sureDakika(180)
                .build();

        ders2.bilgiVer();

        System.out.println("=== BUILDER DENEME BİTTİ ===\n");

        /* ================= OBSERVER + ADAPTER TEST ================= */
        System.out.println("\n\n\n=== OBSERVER + ADAPTER DENEME BAŞLADI ===");

        BildirimService iosBildirimService = new BildirimService(new IOSBildirimAdapter());
        AndroidPushService androidPushService = new AndroidPushService();
        AndroidBildirimAdapter androidAdapter = new AndroidBildirimAdapter(androidPushService);
        BildirimService androidBildirimService = new BildirimService(androidAdapter);

        OgrenciEmailObserver iosOgrenciObserver = new OgrenciEmailObserver(iosBildirimService);
        OgrenciEmailObserver androidOgrenciObserver = new OgrenciEmailObserver(androidBildirimService);
        AdminLogObserver adminLogObserver = new AdminLogObserver();

        DersTalepSubject subject = new DersTalepSubject();
        subject.addObserver(iosOgrenciObserver);
        subject.addObserver(androidOgrenciObserver);
        subject.addObserver(adminLogObserver);

        subject.notifyObservers("Yeni ders talebi oluşturuldu: Almanca A1");

        System.out.println("=== OBSERVER + ADAPTER DENEME BİTTİ ===\n");

        /* ================= ABSTRACT FACTORY TEST ================= */
        System.out.println("\n\n\n=== ABSTRACT FACTORY DENEME BAŞLADI ===");

        dersFabrikasi onlineFabrika = dersFactory.getFactory("online");
        Ders onlineDers = onlineFabrika.dersOlustur(
                "Java OOP",
                "Abstract Factory Online Ders",
                500,
                "Aysun Hoca",
                "Factory Pattern",
                90,
                "Zoom"
        );

        DersKimligi onlineKimlik = onlineFabrika.kimlikOlustur(
                "Aysun Hoca",
                "Yazılım",
                0,
                "Zoom"
        );

        System.out.println("\n--- Online Ders ---");
        onlineDers.bilgiVer();
        onlineKimlik.kimlikYazdir();

        dersFabrikasi kayitliFabrika = dersFactory.getFactory("kayitli");
        Ders kayitliDers = kayitliFabrika.dersOlustur(
                "Python Temelleri",
                "Kayıtlı Ders",
                300,
                "Mehmet Hoca",
                "Python Basics",
                120
        );

        DersKimligi kayitliKimlik = kayitliFabrika.kimlikOlustur(
                "Mehmet Hoca",
                "Programlama",
                0
        );

        System.out.println("\n--- Kayıtlı Ders ---");
        kayitliDers.bilgiVer();
        kayitliKimlik.kimlikYazdir();

        dersFabrikasi quizFabrika = dersFactory.getFactory("quiz");
        Ders quizDers = quizFabrika.dersOlustur(
                "Java Quiz",
                "OOP Quiz",
                100,
                "Ali Hoca",
                "OOP Soruları",
                30,
                20
        );

        DersKimligi quizKimlik = quizFabrika.kimlikOlustur(
                "Ali Hoca",
                "Yazılım",
                20
        );

        System.out.println("\n--- Quiz Ders ---");
        quizDers.bilgiVer();
        quizKimlik.kimlikYazdir();

        System.out.println("=== ABSTRACT FACTORY DENEME BİTTİ ===");
        
        /* ================= MEDIATOR + CHAIN (İKİ İSTEK) TEST ================= */
        System.out.println("\n\n\n=== MEDIATOR + CHAIN (İKİ İSTEKLİ SENARYO) DENEME BAŞLADI ===");


     DilMediator mediator = MediatorFactory.getMediator("almanca");

     DersTalepBilgisi uygunTalep = new DersTalepBilgisi();
     uygunTalep.setOgrenciSeviyesi("A1");
     uygunTalep.setOgrenciButce(300);
     uygunTalep.setTercihSure(60);
     uygunTalep.setTercihDersTipi("Online");

     List<Ders> uygunDersler =
             mediator.uygunDersleriBul(uygunTalep, tumDersler);


     System.out.println("\n2. istek ");
     
     DersTalepBilgisi uygunsuzTalep = new DersTalepBilgisi();
     uygunsuzTalep.setOgrenciSeviyesi("A1");
     uygunsuzTalep.setOgrenciButce(50);   
     uygunsuzTalep.setTercihSure(0);      
     uygunsuzTalep.setTercihDersTipi("Online");

     List<Ders> uygunOlmayanlar =
             mediator.uygunDersleriBul(uygunsuzTalep, tumDersler);

     if (uygunOlmayanlar.isEmpty()) {
         System.out.println("\n✖ 2. İstek: Uygun ders bulunamadı");
     } else {
         uygunOlmayanlar.forEach(Ders::bilgiVer);
     }

     System.out.println("\n ÖZET:");
     System.out.println("✔ 1 uygun istek işlendi");
     System.out.println("✖ 1 istek zincirde elendi");

     System.out.println("=== MEDIATOR + CHAIN (İKİ İSTEKLİ SENARYO) DENEME BİTTİ ===");

        System.out.println("\n\n\n=== STATE + STRATEGY DENEME BAŞLADI ===");

     odeme odeme1 = new odeme();
     odeme1.setTutar(500);

     ContextOdeme context = new ContextOdeme();

     context.setDurum(new BeklemedeOdeme());
     System.out.println("Başlangıç durumu: BEKLEMEDE");

     System.out.println("\n--- Kredi Kartı ile Ödeme ---");
     context.setStrateji(new KrediKartıOdeme());
     context.odemeYap(odeme1);

     try {
         context.odemeYap(odeme1);
     } catch (Exception e) {
         System.out.println("Beklenen hata: " + e.getMessage());
     }


     context.iadeEt(odeme1);
     System.out.println("Son durum: " + odeme1.getDurum());


     System.out.println("\n--- Kripto ile Ödeme ---");

     odeme odeme2 = new odeme();
     odeme2.setTutar(300);

     ContextOdeme context2 = new ContextOdeme();
     context2.setStrateji(new KriptoOdeme());

     context2.odemeYap(odeme2);
     System.out.println("Son durum: " + odeme2.getDurum());


   
     System.out.println("\n--- Paypal ile Ödeme ---");

     odeme odeme3 = new odeme();
     odeme3.setTutar(400);

     ContextOdeme context3 = new ContextOdeme();
     context3.setStrateji(new PaypalOdeme());

     context3.odemeYap(odeme3);
     System.out.println("Son durum: " + odeme3.getDurum());

     System.out.println("\n\n=== STATE + STRATEGY DENEME BİTTİ ===");


 }
}
