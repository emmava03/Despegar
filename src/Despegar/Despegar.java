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
				.findElement(By.xpath("/html/body/nav/div[2]/div/div[3]/ul/li[1]/a/label"));
		Hoteles.click();
		Thread.sleep(1000);
		WebElement imputTag = driver.findElement(
				By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/input"));
		Assert.assertTrue(imputTag.isDisplayed());
		imputTag.click();
		Thread.sleep(1000);
		imputTag.sendKeys("Buenos");
		Thread.sleep(1000);
		WebElement TituloResultado = driver.findElement(By.xpath("/html/body/div[12]/div/div[1]/ul/li[1]/span"));
		TituloResultado.click();
		WebElement EcalendarDespegarIr = driver.findElement(By.xpath(
				"/html/body/div[4]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/div/input"));
		EcalendarDespegarIr.click();
		Thread.sleep(1000);
		WebElement FechaEntradaDespegarIr = driver.findElement(
				By.xpath("/html/body/div[6]/div[4]/div[1]/div[2]/div[2]/div[3]/div[14]/div"));
		FechaEntradaDespegarIr.click();
		Thread.sleep(1000);
		WebElement FechaSalidaDespegarIr = driver
				.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[2]/div[2]/div[3]/div[10]/div"));
		FechaSalidaDespegarIr.click();
		Thread.sleep(1000);
		WebElement aplicarFecha = driver
				.findElement(By.xpath("/html/body/div[6]/div[4]/div[2]/div[1]/button/em"));
		aplicarFecha.click();
		WebElement Hab = driver
				.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div/div"));
		Hab.click();
		WebElement HabAdultos = driver.findElement(
				By.xpath("/html/body/div[6]/div[5]/div/div/div[1]/div[2]/div[1]/div[2]/div/button[2]"));
		Thread.sleep(1000);
		HabAdultos.click();
		WebElement HabMenores = driver.findElement(
				By.xpath("/html/body/div[6]/div[5]/div/div/div[1]/div[2]/div[2]/div[2]/div/button[2]"));
		Thread.sleep(1000);
		HabMenores.click();
		WebElement SelectMenor = driver.findElement
				(By.xpath("/html/body/div[6]/div[5]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/select"));
		Thread.sleep(1000);
		SelectMenor.click();
		WebElement EdadMenor9 = driver.findElement
				(By.xpath("/html/body/div[6]/div[5]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/select/option[11]"));
		Thread.sleep(1000);
		EdadMenor9.click();
		WebElement aplicarHab = driver
				.findElement(By.xpath("/html/body/div[6]/div[5]/div/div/div[2]/a[1]/em"));
		aplicarHab.click();
		WebElement aplicarTodo = driver
				.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/button/em"));
		aplicarTodo.click();
		Thread.sleep(2000);
		WebElement VerDetalles = driver.findElement(By.xpath(
				"/html/body/aloha-app-root/aloha-results/div/div/div/div[2]/div[2]/aloha-list-view-container/div[2]/div[1]/aloha-cluster-container/div/div/div[2]/aloha-cluster-pricebox-container/div/div[2]/div[2]/aloha-button/button/em"));
		VerDetalles.click();
		Thread.sleep(3000);
		Assert.assertTrue(VerDetalles.isDisplayed());
		driver.quit();
		
	}
}