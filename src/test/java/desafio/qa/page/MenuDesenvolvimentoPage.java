package desafio.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import desafio.qa.core.CoreDriver;
import desafio.qa.core.CorePage;

/** 
 * <h1>Classe page que contém o mapeamento dos elementos da subCategoria Desenvolvimento e com os métodos de interação com a tela.</h1>
 * @author Thalya
 * */

public class MenuDesenvolvimentoPage extends CorePage<MenuDesenvolvimentoPage> {
	
	protected WebDriver driver;

	public MenuDesenvolvimentoPage() {
		this.driver = CoreDriver.getDriver();
		PageFactory.initElements(CoreDriver.getDriver(), this);
	}

	//MAPEAMENTO
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Todos em Desenvolvimento']")
	private WebElement subCategoriaProdutividadeEscritorio;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Desenvolvimento web']")
	private WebElement subCategoriaDesenvolvimentoWeb;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Data Science']")
	private WebElement subCategoriaDataScience;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Aplicativos móveis']")
	private WebElement subCategoriaAplicativosMoveis;

	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Linguagens de programação']")
	private WebElement subCategoriaLinguagemProgramacao;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Desenvolvimento de games']")
	private WebElement subCategoriaDesenvolvimentoGames;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Bancos de dados']")
	private WebElement subCategoriaBancoDados;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Teste de software']")
	private WebElement subCategoriaTesteSoftware;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Engenharia de software']")
	private WebElement subCategoriaEngenhariaSoftware;
	
	// MÈTODOS
	
	public void acessarSubCategoriaProdutividadeEscritorio() {
		aguardarElementoVisivel(subCategoriaProdutividadeEscritorio);
		moverCursorPara(subCategoriaProdutividadeEscritorio);
		click(subCategoriaProdutividadeEscritorio);
	}
	
	public void moverCursorParaSubCategoriaProdutividadeEscritorio() {
		aguardarElementoVisivel(subCategoriaProdutividadeEscritorio);
		moverCursorPara(subCategoriaProdutividadeEscritorio);
	}
	
	public void acessarSubCategoriaDesenvolvimentoWeb() {
		aguardarElementoVisivel(subCategoriaDesenvolvimentoWeb);
		moverCursorPara(subCategoriaDesenvolvimentoWeb);
		click(subCategoriaDesenvolvimentoWeb);
	}
	
	public void moverCursorParaSubCategoriaDesenvolvimentoWeb() {
		aguardarElementoVisivel(subCategoriaDesenvolvimentoWeb);
		moverCursorPara(subCategoriaDesenvolvimentoWeb);
	}
	
	public void acessarSubCategoriaDataScience() {
		aguardarElementoVisivel(subCategoriaDataScience);
		moverCursorPara(subCategoriaDataScience);
		click(subCategoriaDataScience);
	}
	
	public void moverCursorParaSubCategoriaDataScience() {
		aguardarElementoVisivel(subCategoriaDataScience);
		moverCursorPara(subCategoriaDataScience);
	}
	
	public void acessarSubCategoriaAplicativosMoveis() {
		aguardarElementoVisivel(subCategoriaAplicativosMoveis);
		moverCursorPara(subCategoriaAplicativosMoveis);
		click(subCategoriaAplicativosMoveis);
	}
	
	public void moverCursorParaSubCategoriaAplicativosMoveis() {
		aguardarElementoVisivel(subCategoriaAplicativosMoveis);
		moverCursorPara(subCategoriaAplicativosMoveis);
	}
	
	public void acessarSubCategoriaLinguagemProgramacao() {
		aguardarElementoVisivel(subCategoriaLinguagemProgramacao);
		moverCursorPara(subCategoriaLinguagemProgramacao);
		click(subCategoriaLinguagemProgramacao);
	}
	
	public void moverCursorParaSubCategoriaLinguagemProgramacao() {
		aguardarElementoVisivel(subCategoriaLinguagemProgramacao);
		moverCursorPara(subCategoriaLinguagemProgramacao);
	}
	
	public void acessarSubCategoriaDesenvolvimentoGames() {
		aguardarElementoVisivel(subCategoriaDesenvolvimentoGames);
		moverCursorPara(subCategoriaDesenvolvimentoGames);
		click(subCategoriaDesenvolvimentoGames);
	}
	
	public void moverCursorParaSubCategoriaDesenvolvimentoGames() {
		aguardarElementoVisivel(subCategoriaDesenvolvimentoGames);
		moverCursorPara(subCategoriaDesenvolvimentoGames);
	}
	
	public void acessarSubCategoriaBancoDados() {
		aguardarElementoVisivel(subCategoriaBancoDados);
		moverCursorPara(subCategoriaBancoDados);
		click(subCategoriaBancoDados);
	}
	
	public void moverCursorSubCategoriaBancoDados() {
		aguardarElementoVisivel(subCategoriaBancoDados);
		moverCursorPara(subCategoriaBancoDados);
	}
	
	public void acessarSubCategoriaTesteSoftware() {
		aguardarElementoVisivel(subCategoriaTesteSoftware);
		moverCursorPara(subCategoriaTesteSoftware);
		click(subCategoriaTesteSoftware);
	}
	
	public void moverCursorParaSubCategoriaTesteSoftware() {
		aguardarElementoVisivel(subCategoriaTesteSoftware);
		moverCursorPara(subCategoriaTesteSoftware);
	}
	
	public void acessarSubCategoriaEngenhariaSoftware() {
		aguardarElementoVisivel(subCategoriaEngenhariaSoftware);
		moverCursorPara(subCategoriaEngenhariaSoftware);
		click(subCategoriaEngenhariaSoftware);
	}
	
	public void moverCursorParaSubCategoriaEngenhariaSoftware() {
		aguardarElementoVisivel(subCategoriaEngenhariaSoftware);
		moverCursorPara(subCategoriaEngenhariaSoftware);
	}
}
