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
 * <h1>Classe page que contém o mapeamento dos elementos do menu Categoria e com os métodos de interação com a tela.</h1>
 * @author Thalya
**/

public class MenuCategoriaPage extends CorePage<MenuCategoriaPage> {
	
	protected WebDriver driver;
	
	public MenuCategoriaPage() {
		this.driver = CoreDriver.getDriver();
		PageFactory.initElements(CoreDriver.getDriver(), this);
	}
	
	//MAPEAMENTO DE LABELS DO MENU CATEGORIA
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Categorias']")
	private WebElement categoria;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Desenvolvimento']")
	private WebElement categoriaDesenvolvimento;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Negócios']")
	private WebElement categoriaNegocio;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Finanças e contabilidade']")
	private WebElement categoriaFinancas;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='TI e software']")
	private WebElement categoriaTI;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Produtividade no escritório']")
	private WebElement categoriaProdutividade;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Desenvolvimento pessoal']")
	private WebElement categoriaDesenvolvimentoPessoal;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Design']")
	private WebElement categoriaDesign;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Marketing']")
    private WebElement categoriaMarketing;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Estilo de vida']")
	private WebElement categoriaEstiloVida;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Fotografia']")
	private WebElement categoriaFotografia;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Saúde e fitness']")
	private WebElement categoriaSaudeFitness;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Música']")
	private WebElement categoriaMusica;
	
	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Ensino e estudo acadêmico']")
	private WebElement categoriaEnsinoEstudoAcademico;
	
	@FindBy(xpath = "//h1[contains(text(),'Cursos de TI e software')]")
	private WebElement titulo;

	// MÈTODOS
	
	public void menuCategoria() {
		aguardarElementoVisivel(categoria);
		moverCursorPara(categoria);
	}
	
	public void validarTitulo(String texto) {
		WebDriverWait driverWait = new WebDriverWait(CoreDriver.getDriver(), 30);
		driverWait.until(ExpectedConditions.visibilityOf(titulo));
		Assert.assertEquals(texto, titulo.getText());
	}
	
	public void acessarCategoriaDesenvolvimento() {
		aguardarElementoVisivel(categoriaDesenvolvimento);
		click(categoriaDesenvolvimento);
	}
	
	public void moverCursoParaCategoriaDesenvolvimento() {
		aguardarElementoVisivel(categoriaDesenvolvimento);
		moverCursorPara(categoriaDesenvolvimento);
	}
	
	public void acessarCategoriaNegocio() {
		aguardarElementoVisivel(categoriaNegocio);
		click(categoriaNegocio);
	}
	
	public void moverCursoParaCategoriaNegocio() {
		aguardarElementoVisivel(categoriaNegocio);
		moverCursorPara(categoriaNegocio);
	}
	
	public void acessarCategoriaFinancas() {
		aguardarElementoVisivel(categoriaFinancas);
		click(categoriaFinancas);
	}
	
	public void moverCursorParaCategoriaFinancas() {
		aguardarElementoVisivel(categoriaFinancas);
		moverCursorPara(categoriaFinancas);
	}
	
	public void acessarCategoriaTI() {
		aguardarElementoVisivel(categoriaTI);
		click(categoriaTI);
	}
	
	public void moverCursorParaCategoriaTI() {
		aguardarElementoVisivel(categoriaTI);
		moverCursorPara(categoriaTI);
	}
	
	public void acessarCategoriaProdutividade() {
		aguardarElementoVisivel(categoriaProdutividade);
		click(categoriaProdutividade);
	}
	
	public void moverCursorParaCategoriaProdutividade() {
		aguardarElementoVisivel(categoriaProdutividade);
		moverCursorPara(categoriaProdutividade);
	}
	
	public void acessarCategoriaDesenvolviementoPessoal() {
		aguardarElementoVisivel(categoriaDesenvolvimentoPessoal);
		click(categoriaDesenvolvimentoPessoal);
	}
	
	public void moverCursorParaCategoriaDesenvolviementoPessoal() {
		aguardarElementoVisivel(categoriaDesenvolvimentoPessoal);
		moverCursorPara(categoriaDesenvolvimentoPessoal);
	}
	
	public void acessarCategoriaDesign() {
		aguardarElementoVisivel(categoriaDesign);
		click(categoriaDesign);
	}
	
	public void moverCursorParaCategoriaDesign() {
		aguardarElementoVisivel(categoriaDesign);
		moverCursorPara(categoriaDesign);
	}
	
	public void acessarCategoriaMarketing() {
		aguardarElementoVisivel(categoriaMarketing);
		click(categoriaMarketing);
	}
	
	public void moverCursorParaCategoriaMarketing() {
		aguardarElementoVisivel(categoriaMarketing);
		moverCursorPara(categoriaMarketing);
	}
	
	public void acessarCategoriaEstiloVida() {
		aguardarElementoVisivel(categoriaEstiloVida);
		click(categoriaEstiloVida);
	}
	
	public void moverCursorParaCategoriaEstiloVida() {
		aguardarElementoVisivel(categoriaEstiloVida);
		moverCursorPara(categoriaEstiloVida);
	}
	
	public void acessarCategoriaFotografia() {
		aguardarElementoVisivel(categoriaFotografia);
		click(categoriaFotografia);
	}
	
	public void moverCursorParaCategoriaFotografia() {
		aguardarElementoVisivel(categoriaFotografia);
		moverCursorPara(categoriaFotografia);
	}
	
	public void acessarCategoriaSaudeFitness() {
		aguardarElementoVisivel(categoriaSaudeFitness);
		click(categoriaSaudeFitness);
	}
	
	public void moverCursorParaCategoriaSaudeFitness() {
		aguardarElementoVisivel(categoriaSaudeFitness);
		moverCursorPara(categoriaSaudeFitness);
	}
	
	public void acessarCategoriaMusica() {
		aguardarElementoVisivel(categoriaMusica);
		click(categoriaMusica);
	}
	
	public void moverCursorParaCategoriaMusica() {
		aguardarElementoVisivel(categoriaMusica);
		moverCursorPara(categoriaMusica);
	}
	
	public void acessarCategoriaEnsinoEstudoAcademico() {
		aguardarElementoVisivel(categoriaEnsinoEstudoAcademico);
		click(categoriaEnsinoEstudoAcademico);
	}	
	
	public void moverCursorParaCategoriaEnsinoEstudoAcademico() {
		aguardarElementoVisivel(categoriaEnsinoEstudoAcademico);
		moverCursorPara(categoriaEnsinoEstudoAcademico);
	}	

}
