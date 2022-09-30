package tricentis.vehicle.pages;

import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterVehicleDataPage {
	WebDriver driver;

	public void acessarTricentis(String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		// Acessar pagina
		driver.get(url);
		Thread.sleep(5000);
	}

	public void btnNextAbaInsuranceData() throws InterruptedException {
		// Pressionar botao Next
		driver.findElement(By.id("nextenterinsurantdata")).click();
		Thread.sleep(1000);
	}

	public void btnNextAbaProductData() throws InterruptedException {
		// Pressionar botao Next
		driver.findElement(By.id("nextenterproductdata")).click();
		Thread.sleep(1000);
	}

	public void btnNextPriceDataOption() throws InterruptedException {
		// Pressionar botao Next
		driver.findElement(By.id("nextselectpriceoption")).click();
		Thread.sleep(1000);
	}

	public void btnSendEmail() throws InterruptedException {
		// Pressionar botao Send
		driver.findElement(By.id("sendemail")).click();
		Thread.sleep(1000);
	}

	public void btnNextAbaSendQuote() throws InterruptedException {
		// Pressionar botao Next
		driver.findElement(By.id("nextsendquote")).click();
		Thread.sleep(1000);
	}

	public void preencherAbaVehicleData() throws InterruptedException {
		// Selecionar Marca
		driver.findElement(
				By.xpath("//label[contains(text(), 'Make')]/following-sibling::select//option[@value='default']"))
				.click();
		Thread.sleep(1000);

		// Escolher uma opção
		driver.findElement(By.xpath("//option[@value='Honda']")).click();
		Thread.sleep(1000);

		// Selecionar Modelo
		driver.findElement(
				By.xpath("//label[contains(text(), 'Model')]/following-sibling::select//option[@value='default']"))
				.click();
		Thread.sleep(1000);

		// Escolher uma opção
		driver.findElement(By.xpath("//option[@value='Scooter']")).click();
		Thread.sleep(1000);

		// Preencher Cilindradas
		driver.findElement(By.xpath("//label[contains(text(), 'Cylinder Capacity')]/following-sibling::input"))
				.sendKeys("125");
		Thread.sleep(1000);

		// Preencher Performance
		driver.findElement(By.xpath("//label[contains(text(), 'Engine Performance')]/following-sibling::input"))
				.sendKeys("300");
		Thread.sleep(1000);

		// Data de Fabricacao
		driver.findElement(By.id("dateofmanufacture")).sendKeys("05/11/2022");
		Thread.sleep(1000);

		// Selecionar assentos
		driver.findElement(By.xpath(
				"//label[contains(text(), 'Number of Seats')]/following-sibling::select[@id='numberofseats']/option[@value='default']"))
				.click();
		Thread.sleep(1000);

		// Escolher uma opção
		driver.findElement(By.xpath("//option[@value='2']")).click();
		Thread.sleep(1000);

		// Selecionar opção de volante
		driver.findElement(By.xpath("//input[@id='righthanddriveno']/following-sibling::span")).click();
		Thread.sleep(1000);

		// Selecionar numero de assentos da motocicleta
		driver.findElement(By.xpath(
				"//label[contains(text(), 'Number of Seats')]/following-sibling::select[@id='numberofseatsmotorcycle']/option [@value='2']"))
				.click();
		Thread.sleep(1000);

		// Selecionar tipo combustivel
		driver.findElement(
				By.xpath("//label[contains(text(), 'Fuel Type')]/following-sibling::select//option[@value='default']"))
				.click();
		Thread.sleep(1000);

		// Escolher uma opcao
		driver.findElement(By.xpath("//option[@value='Gas']")).click();
		Thread.sleep(1000);

		// Preencher payload
		driver.findElement(By.xpath("//label[contains(text(), 'Payload')]/following-sibling::input")).sendKeys("250");
		Thread.sleep(1000);

		// Preencher Peso Total
		driver.findElement(By.xpath("//label[contains(text(), 'Total Weight')]/following-sibling::input"))
				.sendKeys("300");
		Thread.sleep(1000);

		// Preencher Preco de Tabela
		driver.findElement(By.xpath("//label[contains(text(), 'List Price')]/following-sibling::input"))
				.sendKeys("15000");
		Thread.sleep(1000);

		// Preencher Kilometragem anual
		driver.findElement(By.xpath("//label[contains(text(), 'Annual Mileage')]/following-sibling::input"))
				.sendKeys("80000");
		Thread.sleep(1000);

	}

	public void preencherAbaInsurantData() throws InterruptedException {
		// Preencher Primeiro Nome
		driver.findElement(By.xpath("//label[contains(text(), 'First Name')]/following-sibling::input"))
				.sendKeys("Mona	");
		Thread.sleep(1000);

		// Preencher Ultimo Nome
		driver.findElement(By.xpath("//label[contains(text(), 'Last Name')]/following-sibling::input"))
				.sendKeys("Leitner");
		Thread.sleep(1000);

		// Preencher Data de Nascimento
		driver.findElement(By.xpath("//label[contains(text(), 'Date of Birth')]/following-sibling::input"))
				.sendKeys("11/06/1987");
		Thread.sleep(1000);

		// Selecionar Genero
		driver.findElement(By.xpath("//input[@id='genderfemale']/following-sibling::span")).click();
		Thread.sleep(1000);

		// Selecionar Pais
		driver.findElement(
				By.xpath("//label[contains(text(), 'Country')]/following-sibling::select//option[@value='default']"))
				.click();
		Thread.sleep(1000);

		// Escolher uma opcao
		driver.findElement(By.xpath("//option[@value='Brazil']")).click();
		Thread.sleep(1000);

		// Preencher Codigo Postal
		driver.findElement(By.xpath("//label[contains(text(), 'Zip Code')]/following-sibling::input"))
				.sendKeys("04675");
		Thread.sleep(1000);

		// Selecionar Occupation
		driver.findElement(
				By.xpath("//label[contains(text(), 'Occupation')]/following-sibling::select//option[@value='default']"))
				.click();
		Thread.sleep(1000);

		// Escolher uma opcao
		driver.findElement(By.xpath("//option[@value='Employee']")).click();
		Thread.sleep(1000);

		// Hobbies
		List<WebElement> hobbies = driver.findElements(By.xpath("//input[@name='Hobbies']/following-sibling::span"));
		int min = 1;
		int count = 1;
		int max = hobbies.size();
		int random = new Random().nextInt(max - min) + min;

		for (WebElement hobbie : hobbies) {
			if (count == random) {
				hobbie.click();
				break;
			}
			count++;
		}

	}

	public void preencherAbaProductData() throws InterruptedException {

		// Preencher Data de Inicio
		driver.findElement(By.xpath("//label[contains(text(), 'Start Date')]/following-sibling::input"))
				.sendKeys("12/01/2022");
		Thread.sleep(1000);

		// Selecionar Soma de Seguro
		driver.findElement(By.xpath(
				"//label[contains(text(), 'Insurance Sum')]/following-sibling::select//option[@value='default']"))
				.click();
		Thread.sleep(1000);

		// Escolher uma opcao
		driver.findElement(By.xpath("//option[@value='5000000']")).click();
		Thread.sleep(1000);

		// Selecionar Classificacao de Merito
		driver.findElement(By
				.xpath("//label[contains(text(), 'Merit Rating')]/following-sibling::select//option[@value='default']"))
				.click();
		Thread.sleep(1000);

		// Escolher uma opcao
		driver.findElement(By.xpath("//option[@value='Bonus 1']")).click();
		Thread.sleep(1000);

		// Selecionar Seguro Contra Danos
		driver.findElement(By.xpath(
				"//label[contains(text(), 'Damage Insurance')]/following-sibling::select//option[@value='default']"))
				.click();
		Thread.sleep(1000);

		// Escolher uma opcao
		driver.findElement(By.xpath("//option[@value='Full Coverage']")).click();
		Thread.sleep(1000);

		// Selecionar Produto Opcional
		driver.findElement(By.xpath("//input[@id='LegalDefenseInsurance']/following-sibling::span")).click();
		Thread.sleep(1000);

		// Selecionar Carro Cortesia
		driver.findElement(By
				.xpath("//label[contains(text(), 'Courtesy Car')]/following-sibling::select//option[@value='default']"))
				.click();
		Thread.sleep(1000);

		// Escolher uma opcao
		driver.findElement(By.xpath("//option[@value='No']")).click();
		Thread.sleep(1000);

	}

	public void preencherAbaSelectPriceOption() throws InterruptedException {
		// Selecionar Opcao de Preco
		driver.findElement(By.xpath("//input[@id= 'selectsilver']/following-sibling::span")).click();
		Thread.sleep(1000);

	}

	public void preencherAbaSendQuote() throws InterruptedException {

		// Preencher Data de Inicio
		driver.findElement(By.xpath("//label[contains(text(), 'E-Mail')]/following-sibling::input"))
				.sendKeys("monacorsi@yahoo.com.br");
		Thread.sleep(1000);

		// Preencher Data de Inicio
		driver.findElement(By.xpath("//label[contains(text(), 'Username')]/following-sibling::input"))
				.sendKeys("testemona");
		Thread.sleep(1000);

		// Preencher Data de Inicio
		driver.findElement(By.xpath("//label[contains(text(), 'Password')]/following-sibling::input"))
				.sendKeys("Senha123");
		Thread.sleep(1000);

		// Preencher Data de Inicio
		driver.findElement(By.xpath("//label[contains(text(), 'Confirm Password')]/following-sibling::input"))
				.sendKeys("Senha123");
		Thread.sleep(1000);

	}

	public void validarEmailSuccess(String msg) throws InterruptedException {
		int cont = 0;
		
		// Aguardando loading
		while (driver.findElements(By.xpath("//h2[contains(text(), 'success')]")).isEmpty() && cont < 10) {
			Thread.sleep(5000);
			cont++;
		}

		// Validar Mensagem de Sucesso
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(), 'success')]")).getText()
				.equalsIgnoreCase(msg));
	}
}
