package tricentis.vehicle.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import tricentis.vehicle.pages.EnterVehicleDataPage;

public class VehicleInsuranceSteps {

	EnterVehicleDataPage page = new EnterVehicleDataPage();

	@Dado("que estou no site {string}")
	public void queEstouNoSite(String url) throws InterruptedException {
		page.acessarTricentis(url);
	}

	@Quando("preencho o formulário na aba Enter Vehicle Data")
	public void preenchoOFormulárioNaAbaEnterVehicleData() throws InterruptedException {
		page.preencherAbaVehicleData();
	}

	@Quando("pressiono o botão Next para a aba Insurant Data")
	public void pressionoOBotãoNextParaAAbaInsurantData() throws InterruptedException {
		page.btnNextAbaInsuranceData();
	}

	@Quando("preencho o formulário na aba Enter Insurant Data")
	public void preenchoOFormulárioNaAbaEnterInsurantData() throws InterruptedException {
		page.preencherAbaInsurantData();
	}

	@Quando("pressiono o botão Next para a aba Product Data")
	public void pressionoOBotãoNextParaAAbaProductData() throws InterruptedException {
		page.btnNextAbaProductData();
	}

	@Quando("preencho o formulário na aba Enter Product Data")
	public void preenchoOFormulárioNaAbaEnterProductData() throws InterruptedException {
		page.preencherAbaProductData();
	}

	@Quando("pressiono o botão Next para a aba Price Data Option")
	public void pressionoOBotãoNextParaAAbaPriceDataOption() throws InterruptedException {
		page.btnNextPriceDataOption();
	}

	@Quando("preencho o formulário na aba Enter Price Data Option")
	public void preenchoOFormulárioNaAbaEnterPriceDataOption() throws InterruptedException {
		page.preencherAbaSelectPriceOption();
	}

	@Quando("pressiono o botão Next para a aba Send Quote")
	public void pressionoOBotãoNextParaAAbaSendQuote() throws InterruptedException {
		page.btnNextAbaSendQuote();

	}

	@Quando("preencho o formulário na aba Send Quote")
	public void preenchoOFormulárioNaAbaSendQuote() throws InterruptedException {
		page.preencherAbaSendQuote();
	}

	@Quando("pressiono o botão Send")
	public void pressionoOBotãoSend() throws InterruptedException {
		page.btnSendEmail();
	}

	@Entao("valido se a mensagem {string} foi apresentada")
	public void validoSeAMensagemFoiApresentada(String msg) throws InterruptedException {
		page.validarEmailSuccess(msg);
	}

}
