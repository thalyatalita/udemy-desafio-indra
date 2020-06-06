package desafio.qa.page;

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
 * <h1>Classe page que contém o mapeamento dos elementos da subCategoria TI e
 * Software e com os métodos de interação com a tela.</h1>
 * 
 * @author Thalya
 */
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

	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Arduino']")
	private WebElement cursoArduino;

	@FindBy(xpath = "//h1[contains(text(),'Cursos de Arduino')]")
	private WebElement titulo2;

	// MÈTODOS PARA ACESSAR PAGE DE CADA CATEGORIA
	
	public void acessarSubCategoriaTodos() {
		aguardarElementoVisivel(todos);
		click(todos);
	}

	public void acessarSubCertificacaoTI() {
		aguardarElementoVisivel(certificacaoTi);
		click(certificacaoTi);
	}

	public void acessarSubCategoriaRedeSeguranca() {
		aguardarElementoVisivel(redeSeguranca);
		click(redeSeguranca);
	}

	public void acessarSubCategoriaHardware() {
		aguardarElementoVisivel(hardware);
		click(hardware);
	}

	public void acessarSubCategoriaSistemaOperacionais() {
		aguardarElementoVisivel(sistemasOperacionais);
		click(sistemasOperacionais);
	}

	public void acessarSubCategoriaOutros() {
		aguardarElementoVisivel(outros);
		click(outros);
	}

	// MÉTODO PARA ACESSAR TELA DO TOPICO DA CATEGORIA

	public void acessarTopicoCurso() {
		aguardarElementoVisivel(cursoArduino);
		click(cursoArduino);
	}

	// MÉTODOS PARA VALIDAR TITULO

	public void validarTitulo(String texto) {
		WebDriverWait driverWait = new WebDriverWait(CoreDriver.getDriver(), 30);
		driverWait.until(ExpectedConditions.visibilityOf(titulo));
		Assert.assertEquals(texto, titulo.getText());
	}

	public void validarTituloDois(String texto) {
		WebDriverWait driverWait = new WebDriverWait(CoreDriver.getDriver(), 30);
		driverWait.until(ExpectedConditions.visibilityOf(titulo2));
		Assert.assertEquals(texto, titulo2.getText());
	}

	// MÈTODOS PARA MOVER CURSOR DO MOUSE PARA SUBCATEGORIA
	
	public void moverCursorSubCategoriaTodos() {
		aguardarElementoVisivel(todos);
		moverCursorPara(todos);
	}

	public void moverCursorSubCertificacaoTI() {
		aguardarElementoVisivel(certificacaoTi);
		moverCursorPara(certificacaoTi);
	}

	public void moverCursorSubCategoriaRedeSeguranca() {
		aguardarElementoVisivel(redeSeguranca);
		moverCursorPara(redeSeguranca);
	}

	public void moverCursorSubCategoriaHardware() {
		aguardarElementoVisivel(hardware);
		moverCursorPara(hardware);
	}

	public void moverCursorSubCategoriaSistemaOperacionais() {
		aguardarElementoVisivel(sistemasOperacionais);
		moverCursorPara(sistemasOperacionais);
	}

	public void moverCursorSubCategoriaOutros() {
		aguardarElementoVisivel(outros);
		moverCursorPara(outros);
	}
}
