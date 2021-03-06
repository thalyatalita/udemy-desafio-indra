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
 * <h1>Classe page que cont�m o mapeamento dos elementos do menu Categoria e com os m�todos de intera��o com a tela.</h1>
 * @author Thalya
 **/

public class CategoriaPage extends CorePage<CategoriaPage> {

	protected WebDriver driver;

	public CategoriaPage() {
		this.driver = CoreDriver.getDriver();
		PageFactory.initElements(CoreDriver.getDriver(), this);
	}

	// MAPEAMENTO DE LABELS DO MENU CATEGORIA

	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Categorias']")
	private WebElement categoria;

	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Desenvolvimento']")
	private WebElement categoriaDesenvolvimento;

	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Neg�cios']")
	private WebElement categoriaNegocio;

	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Finan�as e contabilidade']")
	private WebElement categoriaFinancas;

	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='TI e software']")
	private WebElement categoriaTI;

	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Produtividade no escrit�rio']")
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

	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Sa�de e fitness']")
	private WebElement categoriaSaudeFitness;

	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='M�sica']")
	private WebElement categoriaMusica;

	@FindBy(xpath = "//*[contains(@class,'header')]//*[text()='Ensino e estudo acad�mico']")
	private WebElement categoriaEnsinoEstudoAcademico;

	@FindBy(xpath = "//h1[contains(text(),'Cursos de TI e software')]")
	private WebElement titulo;

	@FindBy(name = "q")
	private WebElement inputPalavraChave;

	@FindBy(xpath = "//h1[@class='udlite-heading-xl']")
	private WebElement mensagem;
	
	// METODOS POR BUSCA PALAVRA CHAVE
	
	public void buscarPorPalavraChave() {
		aguardarElementoVisivel(inputPalavraChave);
		preencherCampo(inputPalavraChave, "azure devops");
		pressionaEnter(inputPalavraChave);
	}

	public void resultadoNaoEncontrado(String texto) {
		aguardarElementoVisivel(inputPalavraChave);
		preencherCampo(inputPalavraChave, "asdjkl");
		pressionaEnter(inputPalavraChave);
		aguardarElementoVisivel(mensagem);
		Assert.assertEquals(texto, mensagem.getText());
	}

	// 
	public void menuCategoria() {
		aguardarElementoVisivel(categoria);
		moverCursorPara(categoria);
	}

	public void validarTitulo(String texto) {
		WebDriverWait driverWait = new WebDriverWait(CoreDriver.getDriver(), 30);
		driverWait.until(ExpectedConditions.visibilityOf(titulo));
		Assert.assertEquals(texto, titulo.getText());
	}

	// METODOS
	public void acessarCategoriaDesenvolvimento() {
		aguardarElementoVisivel(categoriaDesenvolvimento);
		click(categoriaDesenvolvimento);
	}

	public void acessarCategoriaNegocio() {
		aguardarElementoVisivel(categoriaNegocio);
		click(categoriaNegocio);
	}

	public void acessarCategoriaFinancas() {
		aguardarElementoVisivel(categoriaFinancas);
		click(categoriaFinancas);
	}

	public void acessarCategoriaTI() {
		aguardarElementoVisivel(categoriaTI);
		click(categoriaTI);
	}

	public void acessarCategoriaProdutividade() {
		aguardarElementoVisivel(categoriaProdutividade);
		click(categoriaProdutividade);
	}

	public void acessarCategoriaDesenvolviementoPessoal() {
		aguardarElementoVisivel(categoriaDesenvolvimentoPessoal);
		click(categoriaDesenvolvimentoPessoal);
	}
	
	public void acessarCategoriaDesign() {
		aguardarElementoVisivel(categoriaDesign);
		click(categoriaDesign);
	}
	
	public void acessarCategoriaMarketing() {
		aguardarElementoVisivel(categoriaMarketing);
		click(categoriaMarketing);
	}
	
	public void acessarCategoriaEstiloVida() {
		aguardarElementoVisivel(categoriaEstiloVida);
		click(categoriaEstiloVida);
	}
	
	public void acessarCategoriaFotografia() {
		aguardarElementoVisivel(categoriaFotografia);
		click(categoriaFotografia);
	}
	
	public void acessarCategoriaSaudeFitness() {
		aguardarElementoVisivel(categoriaSaudeFitness);
		click(categoriaSaudeFitness);
	}
	
	public void acessarCategoriaMusica() {
		aguardarElementoVisivel(categoriaMusica);
		click(categoriaMusica);
	}
	
	public void acessarCategoriaEnsinoEstudoAcademico() {
		aguardarElementoVisivel(categoriaEnsinoEstudoAcademico);
		click(categoriaEnsinoEstudoAcademico);
	}
	
	// METODOS PARA MOVER O CURSOR
	
	public void moverCursorParaCategoriaProdutividade() {
		aguardarElementoVisivel(categoriaProdutividade);
		moverCursorPara(categoriaProdutividade);
	}
	
	public void moverCursorParaCategoriaTI() {
		aguardarElementoVisivel(categoriaTI);
		moverCursorPara(categoriaTI);
	}
	
	public void moverCursoParaCategoriaDesenvolvimento() {
		aguardarElementoVisivel(categoriaDesenvolvimento);
		moverCursorPara(categoriaDesenvolvimento);
	}
	
	public void moverCursoParaCategoriaNegocio() {
		aguardarElementoVisivel(categoriaNegocio);
		moverCursorPara(categoriaNegocio);
	}
	
	public void moverCursorParaCategoriaFinancas() {
		aguardarElementoVisivel(categoriaFinancas);
		moverCursorPara(categoriaFinancas);
	}

	public void moverCursorParaCategoriaDesign() {
		aguardarElementoVisivel(categoriaDesign);
		moverCursorPara(categoriaDesign);
	}

	public void moverCursorParaCategoriaMarketing() {
		aguardarElementoVisivel(categoriaMarketing);
		moverCursorPara(categoriaMarketing);
	}

	public void moverCursorParaCategoriaEstiloVida() {
		aguardarElementoVisivel(categoriaEstiloVida);
		moverCursorPara(categoriaEstiloVida);
	}

	public void moverCursorParaCategoriaFotografia() {
		aguardarElementoVisivel(categoriaFotografia);
		moverCursorPara(categoriaFotografia);
	}

	public void moverCursorParaCategoriaSaudeFitness() {
		aguardarElementoVisivel(categoriaSaudeFitness);
		moverCursorPara(categoriaSaudeFitness);
	}

	public void moverCursorParaCategoriaMusica() {
		aguardarElementoVisivel(categoriaMusica);
		moverCursorPara(categoriaMusica);
	}

	public void moverCursorParaCategoriaEnsinoEstudoAcademico() {
		aguardarElementoVisivel(categoriaEnsinoEstudoAcademico);
		moverCursorPara(categoriaEnsinoEstudoAcademico);
	}
	
	public void moverCursorParaCategoriaDesenvolviementoPessoal() {
		aguardarElementoVisivel(categoriaDesenvolvimentoPessoal);
		moverCursorPara(categoriaDesenvolvimentoPessoal);
	}

}
