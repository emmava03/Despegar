package Despegar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Despegar
{

	@Test(description = "Busqueda de hospedaje en Despegar.com")
	public void ValidarBusquedaDespegar() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.despegar.com.ar/");
		WebElement Hoteles = driver
				.findElement(By.cssSelector(".header-products-container [href='//www.despegar.com.ar/hoteles/']"));
		Hoteles.click();
		Thread.sleep(1000);
		WebElement imputTag = driver.findElement(
				By.xpath("//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div[2]/div[1]/div/div/div/input"));
		Assert.assertTrue(imputTag.isDisplayed());
		imputTag.click();
		Thread.sleep(1000);
		imputTag.sendKeys("Córdoba");
		Thread.sleep(1000);
		WebElement TituloResultado = driver.findElement(By.xpath("/html/body/div[12]/div/div[1]/ul/li[1]/span"));
		TituloResultado.click();
		WebElement EcalendarDespegarIr = driver.findElement(By.xpath(
				"//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div[2]/div[2]/div/div[1]/div/div/div/div/input"));
		EcalendarDespegarIr.click();
		Thread.sleep(1000);
		WebElement FechaEntradaDespegarIr = driver.findElement(
				By.xpath("//*[@id=\"component-modals\"]/div[4]/div[1]/div[2]/div[1]/div[3]/div[23]/div[1]"));
		FechaEntradaDespegarIr.click();
		Thread.sleep(1000);
		WebElement FechaSalidaDespegarIr = driver
				.findElement(By.xpath("//*[@id=\"component-modals\"]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div"));
		FechaSalidaDespegarIr.click();
		Thread.sleep(1000);
		WebElement aplicarFecha = driver
				.findElement(By.xpath("//*[@id=\"component-modals\"]/div[4]/div[2]/div[1]/button/em"));
		aplicarFecha.click();
		WebElement Hab = driver
				.findElement(By.xpath("//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div[2]/div[3]/div/div"));
		Hab.click();
		WebElement HabAdultos = driver.findElement(
				By.xpath("//*[@id=\"component-modals\"]/div[5]/div/div/div[1]/div[2]/div[1]/div[2]/div/button[2]"));
		Thread.sleep(1000);
		HabAdultos.click();
		WebElement aplicarHab = driver
				.findElement(By.xpath("//*[@id=\"component-modals\"]/div[5]/div/div/div[2]/a[1]"));
		aplicarHab.click();
		WebElement aplicarTodo = driver
				.findElement(By.xpath("//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div[2]/button/em"));
		aplicarTodo.click();
		Thread.sleep(2000);
		WebElement VerDetalles = driver.findElement(By.xpath(
				"/html/body/aloha-app-root/aloha-results/div/div/div/div[2]/div[2]/aloha-list-view-container/div[2]/div[1]/aloha-cluster-container/div/div/div[2]/aloha-cluster-pricebox-container/div/div[2]/div[2]/aloha-button/button/em"));
		VerDetalles.click();
		Thread.sleep(3000);
		driver.quit();
		
	}
}