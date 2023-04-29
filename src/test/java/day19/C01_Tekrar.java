package day19;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C01_Tekrar extends TestBase {

    //    https://the-internet.herokuapp.com/tables sayfasına gidin
//    Task 1 : Table1’i yazdırın
//    Task 2 : 3. Satır verilerini yazdırın
//    Task 3 : Son satırın verilerini yazdırın
//    Task 4 : 5. Sütun verilerini yazdırın
//    Task 5 : Iki parametreli bir Java metodu oluşturalım: printData
//    Parameter 1 = satır numarası
//    Parameter 2 = sütun numarası
//    printData(2,3);  => 2. satır, 3. sütundaki veriyi yazdırsın.




    @Test
    public void name() {

        //    https://the-internet.herokuapp.com/tables sayfasına gidin
        driver.get(" https://the-internet.herokuapp.com/tables");
        //    Task 1 : Table1’i yazdırın
        WebElement table1 = driver.findElement(By.xpath("(//table)[1]"));
        System.out.println(table1.getText());
 //    Task 2 : 3. Satır verilerini yazdırın
       List<WebElement>  satır3 = driver.findElements(By.xpath("//tbody[1]/tr[3]//td"));
        satır3.forEach(t-> System.out.print(t.getText()+" - "));

//    Task 3 : Son satırın verilerini yazdırın
      List<WebElement> sonSatır =  driver.findElements(By.xpath("//tbody[1]//tr[last()]//td"));
      sonSatır.forEach(t-> System.out.print(t.getText()+" - "));
//    Task 4 : 5. Sütun verilerini yazdırın
        List <WebElement> sutun5 = driver.findElements(By.xpath("//tbody[1]//td[5]"));
        sutun5.forEach(t-> System.out.println(t.getText()+" - "));
//    Task 5 : Iki parametreli bir Java metodu oluşturalım: printData
//    Parameter 1 = satır numarası
//    Parameter 2 = sütun numarası
//    printData(2,3);  => 2. satır, 3. sütundaki veriyi yazdırsın.


    }

    @Test
    public void printDAta() {
        driver.get(" https://the-internet.herokuapp.com/tables");
        printDAta(2,3);
    }

    public void printDAta(int satir, int sutun){
        WebElement satirSutun = driver.findElement(By.xpath("(//tbody)[1]//tr["+satir+"]//td["+sutun+"]"));
        System.out.println(satirSutun.getText());
    }
}
