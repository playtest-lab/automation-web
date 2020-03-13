import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {

    @Test
    public void LoginTest(){

        System.setProperty("webdriver.chrome.driver", "/home/usertqi/Documentos/chromedriver");
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://www.trabalhabrasil.com.br/");

        navegador.findElement(By.linkText("ENTRAR")).click();

        String confirmacao = navegador.findElement(By.id("btnLoginContinuar")).getText();

        assertEquals("CONTINUAR", confirmacao);
    }



}
