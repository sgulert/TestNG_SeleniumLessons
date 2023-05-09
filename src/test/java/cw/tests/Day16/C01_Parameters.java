package cw.tests.Day16;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C01_Parameters {

    @Test
    @Parameters("isim")
    public void parameterizedTest(String isim){
        System.out.println("isim = " + isim);

    }

    //parametrelerin sırasına göre xml dosyasından parametreler okunur

    //xml dosyası içerisinde parametre değerlerini her ne kadar string olarak girsek de
    // eğer çevrilebiliyorsa string dışındaki veri tipi ile de alabiliriz
    
    @Test
    @Parameters({"isim","soyisim","yas"})
    public void twoparametertest(String name, String surname, int age){
        System.out.println("name+surname = " + name+surname);
        System.out.println("age = " + age);
    }
}
