package day20_Exell;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_Tekrar  {

      /*
    Capitals.xlsx dosyasından 1. satır 2. sütundaki hücreyi yazdırın
    3. Satır 1. sütun değerini yazdırın ve "France" olduğunu test edin
    Kullanılan satır sayısın bulun
    Ülke-Başkent şeklinde verileri yazdırın
    */

    @Test
    public void name() throws IOException {


//    Capitals.xlsx dosyasından 1. satır 2. sütundaki hücreyi yazdırın
        FileInputStream fis=new FileInputStream("src/test/java/resources/Capitals.xlsx");
        Workbook workbook= WorkbookFactory.create(fis);
        Sheet sheet=workbook.getSheet("Sheet1");
        Row row=sheet.getRow(0);
        Cell cell=row.getCell(1);
        System.out.println(cell);
//    3. Satır 1. sütun değerini yazdırın ve "France" olduğunu test edin
        Cell cell2 = sheet.getRow(2).getCell(0);
        System.out.println(cell2);
        Assert.assertEquals("Farance",cell2.toString());
//    Kullanılan satır sayısın bulun
        int satirSayisi = cell2.getSheet().getPhysicalNumberOfRows();
        System.out.println(satirSayisi);
//    Ülke-Başkent şeklinde verileri yazdırın

    }
}
