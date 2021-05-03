

![bannerResim](https://i.ibb.co/qyk0t3j/Data-Access-2.jpg)

## :pushpin:  CoffeShop Proje Hakkında
 Nitelikli Yazılımcı Geliştirme kampına aittir.
 
 Bu projede Mernis ile Tc kimlik no doğrulanarak database kayıt simülasyonu gerçekleştirildi.

Kendi Projenize Mernisi dahil etmek için lütfen adımları takip ediniz.

### Adım 1- Java 8 jdk indirip kurulumu tamamlayınız.-->
[Java 8 JDK](https://www.oracle.com/tr/java/technologies/javase/javase-jdk8-downloads.html)

* * *

### Adım 2- Window -> Preferences
<img src="https://github.com/atakanreyhanioglu/CoffeShop/blob/main/MernisDahilEtmeAdimlari/1.png">
### Arama kısmına jre yazın ve Execution Enviroments ' a tıklayıp JavaSE 1.8 i seçerek kaydediniz.
<img src="https://github.com/atakanreyhanioglu/CoffeShop/blob/main/MernisDahilEtmeAdimlari/2.png">
<img src="https://github.com/atakanreyhanioglu/CoffeShop/blob/main/MernisDahilEtmeAdimlari/3.png">

* * *

### Adım 3- Kendi projeniz üzerinde sağ tıklayarak Properties(özellikler) açınız.
<img src="https://github.com/atakanreyhanioglu/CoffeShop/blob/main/MernisDahilEtmeAdimlari/4.png">
### Java Compiler resimde kırmızı seçili alandan tik işaretini kaldırınız ve java 1.8 i seçip kayıt ediniz.
<img src="https://github.com/atakanreyhanioglu/CoffeShop/blob/main/MernisDahilEtmeAdimlari/5.png">

* * *

### Adım 4- Kendi projeniz üzerinde sağ tık -> New -> Others seçiniz.
<img src="https://github.com/atakanreyhanioglu/CoffeShop/blob/main/MernisDahilEtmeAdimlari/6.png">
### Arama kısmına web service yazıp Web Service Client i seçip Next e tıklayınız.
<img src="https://github.com/atakanreyhanioglu/CoffeShop/blob/main/MernisDahilEtmeAdimlari/7.png">
### "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?WSDL" Url yi yapıştırınız ve kayıt ediniz.
<img src="https://github.com/atakanreyhanioglu/CoffeShop/blob/main/MernisDahilEtmeAdimlari/8.png">

* * *

### Adım 5- MernisServiceAdapter inize uygulamanızı yazınız. [Örnek](https://github.com/atakanreyhanioglu/CoffeShop/blob/main/src/Adapters/MernisServiceAdapter.java)




