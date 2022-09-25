Feature: Kullanici bir ürün secip sepete ekleyebilmeli ve odeme yapabilmelidir
  @a101
  Scenario: Kullanici istedigi urunu alabilmedir
    Given  Kullanici "anaSayfa"ya gider
    And Cookies kabul eder
    Then Kullanici uye olmadan Giyim Aksesuardan Kadin ic giyim kismindan dizalti corap bolumunu secer
    And Tum dizalti siyah coraplar secilir
    Then Secilen urun sepete eklenir
     And Sepeti Goruntule butonuna tiklar
     And Sepeti Onayla butonuna tiklar
     Then uye olmadan devam et butonuna tiklar
    And gelen ekrana gecerli bir email girer
    And gelen ekrana gecerli bilgiler girerek bir adres olusturur
    Then Odeme ekranina gelir
    And kullanici siparisi tamamla butonuna tiklar
    And odeme ekranina gidildigi dogrulanir

