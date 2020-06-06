package desafio.qa.menu.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import desafio.qa.core.CoreDriver;
import desafio.qa.core.CorePage;

/** 
 * <h1>Classe page que contém o mapeamento dos elementos da subCategoria TI e Software e com os métodos de interação com a tela.</h1>
 * @author Thalya
 * */
public class MenuTiSoftwarePage extends CorePage<MenuTiSoftwarePage> {
	
	protected WebDriver driver;

	public MenuTiSoftwarePage() {
		this.driver = CoreDriver.getDriver();
		PageFactory.initElements(CoreDriver.getDriver(), this);
	}
	
	// MAPEAMENTO
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Todos em TI e software']")
	private WebElement todos;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Certificação em TI']")
	private WebElement certificacaoTi;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Rede e segurança']")
	private WebElement redeSeguranca;

	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Hardware']")
	private WebElement hardware;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Sistemas operacionais']")
	private WebElement sistemasOperacionais;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Outro']")
	private WebElement outros;
	
	@FindBy(xpath = "//h1[contains(text(),'Cursos de Hardware')]")
	private WebElement titulo;
	
	
	public void validarTitulo(String texto) {
		WebDriverWait driverWait = new WebDriverWait(CoreDriver.getDriver(), 30);
		driverWait.until(ExpectedConditions.visibilityOf(titulo));
		Assert.assertEquals(texto, titulo.getText());
	}
	
	
	// MÈTODOS PARA ACESSAR PAGE DE CADA CATEGORIA
	
	public void acessarSubCategoriaTodos() {
		aguardarElementoVisivel(todos);
		moverCursorPara(todos);
		click(todos);
	}
	
	public void acessarSubCertificacaoTI() {
		aguardarElementoVisivel(certificacaoTi);
		moverCursorPara(certificacaoTi);
		click(certificacaoTi);
	}
	
	public void acessarSubCategoriaRedeSeguranca() {
		aguardarElementoVisivel(redeSeguranca);
		moverCursorPara(redeSeguranca);
		click(redeSeguranca);
	}
	
	public void acessarSubCategoriaHardware() {
		aguardarElementoVisivel(hardware);
		moverCursorPara(hardware);
		click(hardware);
	}
	
	public void acessarSubCategoriaSistemaOperacionais() {
		aguardarElementoVisivel(sistemasOperacionais);
		moverCursorPara(sistemasOperacionais);
		click(sistemasOperacionais);
	}
	
	public void acessarSubCategoriaOutros() {
		aguardarElementoVisivel(outros);
		moverCursorPara(outros);
		click(outros);
	}

}
