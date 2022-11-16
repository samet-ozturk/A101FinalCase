# A101FinalCase


## Proje: Hepsiburada.com üzerinden sepete ürün eklenmesi 

1. Kullanıcı girişi yapılarak sepete ürün eklenmesi
- Kullanıcı Hepsiburada.com sitesini ziyaret eder.
- Kullanıcı giriş işlemi yapılır.
- Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı doğrulanır
- Kullanıcı, burada satın almak istediği ürün için arama yapacaktır.
- Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
- Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
- Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.

2.Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme

- Kullanıcı Hepsiburada.com sitesini ziyaret eder.
- Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
- Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
- Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.

## Kullanılan Teknolojiler

- Java dilinde geliştirildi ve Maven Repo kullanıldı.
- Yazılan senaryo için Selenium ve JUnit/Testng kullanıldı.
- Assertions kullanarak senaryonun doğru çalışırlığı kontrol edildi.
- Page object model uygulandı.
- Loglama yapıldı.
- OOP prensiplerine uygun geliştirildi.


### Bu Projeyi Çalıştırırken Dikkat Etmeniz Gerekenler

###2 Adet CASE Bulunmakta;
- 1. Kullanıcı girişi yapılarak sepete ürün eklenmesi
- 2. Kullanıcı girişi yapılmadan belirtilen ürünü sepete eklenmesi

-----

**Proje'nin 1. Case'ini (login işlemli) çalıştırmak isterseniz şunu yapın**
- src/test/java/casestudy/runners/cucumberRunner.java içerisine gidin,
- "tags = "@scenario2"," kodunu silin veya yorum satırına alın ve Run diyerek 1. Case'i çalıştırabilirsiniz.
![Image](https://imgyukle.com/f/2022/11/16/JyMwLn.png)



**Proje'nin 2. Case'ini (loginsiz olan) çalıştırmak isterseniz ise direkt çalıştırabilirsiniz.**





