## Uygulamada Uyulması gereken kurallar

### Adres Kuralları
- 1 müşterinin 2 adet adresi olabilir(iş ve ev adresi)

- Müşteri ve Adress ilişkisinde ilişki sahibi adres olmalı(Many olan taraf adres)

### Müşteri Kuralları

- Müşteri Ekleme - Güncelleme Olmalı(Adress - telefon gibi alanlar değiştirilebilir)

- Silme işlemi yaparken müşterinin hesaplarında ki paraların kontrolu olmalı , hesaplarında para varsa ya da kredi kartı borcu varsa silinemez

### Müşteri - Hesap İlişkisi

- Bir müşterinin 2 tip hesabı olabilir (Vadesiz ve Birikim Hesabı)
    
    - Bir müşterinin vadesiz hesap olarak TL-EURO-DOLAR tipinde 3 hesapbı olabilir
    
    - Birikim hesabı içinde TL-EURO-DOLAR Olmalıdır
    
- Müşteri ile Hesap arasında Bire çok ilişki olmalı ( 1 Müşteri , Çok hesap)

- Birikim hesabı para transferine kapalı

- Hesaplara gelen havaleler farklı para birimindeyse mevcut kur'a bakılıcak , Örneğin müşterinin tl hesabına dolar geliyorsa https://api.exchangeratesapi.io/latest?base=TRY dolar kuruna burdan bakılıp karsılığı olan tl tutarı gönderilicek

- Hesaplar arası her türlü para transferi IBAN üzerinden olucak(Fonksiyon gönderen ve alan müşteri no'larını isticek bir tabloda sürekli tutulucak)

### Ödeme İşlemleri

- Bu tablo bankada yapılan tüm para transferlerini kayıt edicek,giden ya da gelen fark etmez

- Gönderen ve alanın müşteri numarasını , işlem tarihini , random bir makbuz nosunu , tutarı tutucak , gönderen hesap no ve alan hesap no da tabloda tutulucak

- Hesap ile Ödeme arasında 1'e çok ilişki olucak bir hesap birden fazla havale alabilir ya da havale yapabilir

### Kart İşlemleri

- 2 tip kart alıcak banka ve kredi kartı bu kartlar müşterinin hesaplarıyla ilişkili olucak

- Vadesiz mevduat hesabına bağlı kullanıcı hem banka kartı hemde kredi kartı alabilicek ama varolan vadesiz tl hesabına bağlı olmalı

- Bir banka hesabının 2 adet kartı olabilir , hesap 1 iken kart many olmalı



### Senaryolar

Bir müşteri oluşturulurken , id'si oluşunca verilen tckno : parolasını kendisi belirlicek.