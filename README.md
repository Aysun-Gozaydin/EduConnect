# EduConnect

EduConnect, **Java Spring Boot** kullanılarak geliştirilen ve **GoF (Gang of Four) tasarım kalıplarının** gerçek bir uygulama yapısı üzerinde öğrenilmesini ve uygulanmasını amaçlayan bir backend projesidir.

Proje; öğrenciler ve öğretmenlerin dersler üzerinden etkileşim kurabildiği, ders talepleri, ödeme işlemleri ve bildirim gibi süreçlerin yer aldığı bir eğitim platformu yapısını ele almaktadır.

## Projenin Amacı

Projenin temel amacı yalnızca bir CRUD uygulaması geliştirmek değil, farklı yazılım tasarım problemlerinde **tasarım kalıplarının ne zaman ve neden kullanılabileceğini** uygulamalı olarak öğrenmektir.

## Kullanılan Tasarım Kalıpları

Projede farklı tasarım ihtiyaçlarına yönelik çeşitli GoF tasarım kalıpları uygulanmıştır:

- **Builder & Factory:** Farklı ders türlerinin esnek şekilde oluşturulması için kullanıldı.
- **Strategy:** Kredi kartı, PayPal ve kripto para gibi farklı ödeme yöntemlerinin yönetilmesi için kullanıldı.
- **State:** Beklemede, başarılı, başarısız ve iade edildi gibi ödeme durumlarının yönetilmesi için kullanıldı.
- **Observer:** Ders taleplerindeki değişikliklere bağlı olarak bildirimlerin yönetilmesi için kullanıldı.
- **Adapter:** Android ve iOS gibi farklı bildirim platformlarının ortak bir yapı üzerinden kullanılabilmesi için uygulandı.
- **Chain of Responsibility:** Ders seçim kriterlerinin farklı kontrol adımlarından geçirilmesi için kullanıldı.
- **Mediator:** Farklı dil bileşenleri arasındaki iletişimin yönetilmesi için uygulandı.

## Kullanılan Teknolojiler

- Java
- Spring Boot
- Maven
- Nesne Yönelimli Programlama (OOP)
- GoF Tasarım Kalıpları

## Proje Yapısı

Proje içerisinde entity, service ve tasarım kalıplarına ait yapılar ayrı paketler altında organize edilmiştir.

Öne çıkan paketler:

```text
factory/
service/adapter/
service/chainofres/
service/mediator/
service/observer/
service/odeme/
