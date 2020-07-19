# chain-of-responsibility-design-pattern-example

Chain of responsibility (sorumluluk zinciri) tasarım kalıbı ile amaç, bir isteğin sistem üzerinde uygun çözüm bulunana kadar birden fazla nesne tarafından değerlendirilmesidir.


Sisteme gönderilen bir isteğin hangi nesne tarafından cevaplanması gerektiğini bilmediğimiz durumlarda Chain of Responsibility tasarım kalıbı kullanılır.


Projede birden fazla koşullu metot yazmak istendiğinde her koşul için if-else blokları açılmalı ve kontrol yapılmalıdır. Chain of Responsibility ile bir çözüm sıralaması getirilir ve bu kod karmaşası önlenmiş olur.


Bu örnekte; bir şirket içinde farklı seviyelerde problemler ve onları çözebilecek farklı seviyede kişiler (handle) oluşturarak zincir haline getirdik.
Metoda bir problem seviyesi geldiğinde ilk handle sınıfından başlayarak bu problemi çözebilecek sınıfa kadar zincir yapısı çalışmaya devam edecektir.
Doğru çözümü bulduğunda zinciri bitirecek, eğer çözümsüz kalırsa buna göre bir uyarı verecektir.
