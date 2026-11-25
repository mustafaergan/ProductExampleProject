# Product Example Project

Ürün, müşteri ve sipariş kayıtlarını yöneten küçük bir Spring Boot REST API örneği. JPA ilişkilerini
(çoktan çoğa, birden çoğa) ve katmanlı yapıyı (controller, service, repository) göstermek için yazıldı.

> **Not:** Bu depo 2024 yılında örnek amaçlı yazıldı ve artık güncellenmiyor. Zamanla bağımlılıklarında güvenlik
> açıkları çıkabilir; üretimde kullanmayın.

## İçerik

- `entity/`: `Product`, `Customer` ve `CustomerOrder`. Müşteri ile ürün arasında çoktan çoğa, müşteri ile
  sipariş arasında birden çoğa ilişki vardır.
- `controller/`: REST uç noktaları
  - `api/v1/products`: listeleme, tek kayıt, ekleme, güncelleme, silme
  - `api/v1/orders`: listeleme, tek kayıt, ekleme, güncelleme, silme
  - `api/v1/customers`: listeleme, tek kayıt, ekleme
- `service/`, `repository/`: iş katmanı ve Spring Data JPA depoları
- `httpvalue`: IntelliJ HTTP Client ile denemek için örnek istekler
- `docker-compose.yml`: yerel PostgreSQL veritabanı

## Teknolojiler

- Java 17, Spring Boot 3.3.4, Spring Data JPA, Lombok
- PostgreSQL
- Gradle 8.10 (wrapper ile)

## Çalıştırma

1. Veritabanını başlatın:

   ```bash
   docker compose up -d
   ```

   Veritabanı adı, kullanıcı ve şifre `docker-compose.yml` ile `src/main/resources/application.properties`
   içinde yerel geliştirme için yazılmıştır; kendi ortamınızda kendi değerlerinizi kullanın ve iki dosyayı
   birbiriyle uyumlu tutun.

2. Uygulamayı başlatın (port 8080):

   ```bash
   ./gradlew bootRun
   ```

Tablolar `spring.jpa.hibernate.ddl-auto=update` ayarıyla açılışta otomatik oluşturulur.
