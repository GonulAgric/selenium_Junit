package Utilities;



    import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

        import java.time.Duration;
    import java.util.ArrayList;
    import java.util.List;

public abstract class TestBase {
        //TestBase class'ından Obje oluşturmanın önüne geçilmesi için abstract yapılabilir
        //Orn: TestBase base = new TestBase()
        //Bu class'a extends ettiğimiz test classlarından ulaşabiliriz
        protected static WebDriver driver;
        @Before
        public void setUp() throws Exception {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        @After
        public void tearDown() throws Exception {
            //Thread.sleep(3000);
            //driver.quit();
        }

        //SwitchTo : sayfalar arası gecıs methodu
        //indeks 0 dan baslar
        //girilen indeksteki window handle degerını alarak o sayfaya gecıs yapar.

        public static void switchToWindow(int sayfaIndeksi){
            List<String> windowHandleList=new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(windowHandleList.get(sayfaIndeksi));
        }
    }


