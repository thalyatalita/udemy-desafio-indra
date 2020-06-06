package desafio.qa.menu.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import desafio.qa.core.CoreDriver;
import desafio.qa.core.CorePage;

/** 
 * <h1>Classe page que cont�m o mapeamento dos elementos do menu Categoria e com os m�todos de intera��o com a tela.</h1>
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

	// M�TODOS
	
	public void acessarMenuCategoria() {
		aguardarElementoVisivel(categoria);
		moverCursorPara(categoria);
	}
	
	public void acessarCategoriaDesenvolvimento() {
		aguardarElementoVisivel(categoriaDesenvolvimento);
		moverCursorPara(categoriaDesenvolvimento);
		click(categoriaDesenvolvimento);
	}
	
	public void moverCursoParaCategoriaDesenvolvimento() {
		aguardarElementoVisivel(categoriaDesenvolvimento);
		moverCursorPara(categoriaDesenvolvimento);
	}
	
	public void acessarCategoriaNegocio() {
		aguardarElementoVisivel(categoriaNegocio);
		moverCursorPara(categoriaNegocio);
		click(categoriaNegocio);
	}
	
	public void moverCursoParaCategoriaNegocio() {
		aguardarElementoVisivel(categoriaNegocio);
		moverCursorPara(categoriaNegocio);
	}
	
	public void acessarCategoriaFinancas() {
		aguardarElementoVisivel(categoriaFinancas);
		moverCursorPara(categoriaFinancas);
		click(categoriaFinancas);
	}
	
	public void moverCursorParaCategoriaFinancas() {
		aguardarElementoVisivel(categoriaFinancas);
		moverCursorPara(categoriaFinancas);
	}
	
	public void acessarCategoriaTI() {
		aguardarElementoVisivel(categoriaTI);
		moverCursorPara(categoriaTI);
		click(categoriaTI);
	}
	
	public void moverCursorParaCategoriaTI() {
		aguardarElementoVisivel(categoriaTI);
		moverCursorPara(categoriaTI);
	}
	
	public void acessarCategoriaProdutividade() {
		aguardarElementoVisivel(categoriaProdutividade);
		moverCursorPara(categoriaProdutividade);
		click(categoriaProdutividade);
	}
	
	public void moverCursorParaCategoriaProdutividade() {
		aguardarElementoVisivel(categoriaProdutividade);
		moverCursorPara(categoriaProdutividade);
	}
	
	public void acessarCategoriaDesenvolviementoPessoal() {
		aguardarElementoVisivel(categoriaDesenvolvimentoPessoal);
		moverCursorPara(categoriaDesenvolvimentoPessoal);
		click(categoriaDesenvolvimentoPessoal);
	}
	
	public void moverCursorParaCategoriaDesenvolviementoPessoal() {
		aguardarElementoVisivel(categoriaDesenvolvimentoPessoal);
		moverCursorPara(categoriaDesenvolvimentoPessoal);
	}
	
	public void acessarCategoriaDesign() {
		aguardarElementoVisivel(categoriaDesign);
		moverCursorPara(categoriaDesign);
		click(categoriaDesign);
	}
	
	public void moverCursorParaCategoriaDesign() {
		aguardarElementoVisivel(categoriaDesign);
		moverCursorPara(categoriaDesign);
	}
	
	public void acessarCategoriaMarketing() {
		aguardarElementoVisivel(categoriaMarketing);
		moverCursorPara(categoriaMarketing);
		click(categoriaMarketing);
	}
	
	public void moverCursorParaCategoriaMarketing() {
		aguardarElementoVisivel(categoriaMarketing);
		moverCursorPara(categoriaMarketing);
	}
	
	public void acessarCategoriaEstiloVida() {
		aguardarElementoVisivel(categoriaEstiloVida);
		moverCursorPara(categoriaEstiloVida);
		click(categoriaEstiloVida);
	}
	
	public void moverCursorParaCategoriaEstiloVida() {
		aguardarElementoVisivel(categoriaEstiloVida);
		moverCursorPara(categoriaEstiloVida);
	}
	
	public void acessarCategoriaFotografia() {
		aguardarElementoVisivel(categoriaFotografia);
		moverCursorPara(categoriaFotografia);
		click(categoriaFotografia);
	}
	
	public void moverCursorParaCategoriaFotografia() {
		aguardarElementoVisivel(categoriaFotografia);
		moverCursorPara(categoriaFotografia);
	}
	
	public void acessarCategoriaSaudeFitness() {
		aguardarElementoVisivel(categoriaSaudeFitness);
		moverCursorPara(categoriaSaudeFitness);
		click(categoriaSaudeFitness);
	}
	
	public void moverCursorParaCategoriaSaudeFitness() {
		aguardarElementoVisivel(categoriaSaudeFitness);
		moverCursorPara(categoriaSaudeFitness);
	}
	
	public void acessarCategoriaMusica() {
		aguardarElementoVisivel(categoriaMusica);
		moverCursorPara(categoriaMusica);
		click(categoriaMusica);
	}
	
	public void moverCursorParaCategoriaMusica() {
		aguardarElementoVisivel(categoriaMusica);
		moverCursorPara(categoriaMusica);
	}
	
	public void acessarCategoriaEnsinoEstudoAcademico() {
		aguardarElementoVisivel(categoriaEnsinoEstudoAcademico);
		moverCursorPara(categoriaEnsinoEstudoAcademico);
		click(categoriaEnsinoEstudoAcademico);
	}	
	
	public void moverCursorParaCategoriaEnsinoEstudoAcademico() {
		aguardarElementoVisivel(categoriaEnsinoEstudoAcademico);
		moverCursorPara(categoriaEnsinoEstudoAcademico);
	}	

}
