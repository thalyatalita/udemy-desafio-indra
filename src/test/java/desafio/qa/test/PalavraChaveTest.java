package desafio.qa.test;

import org.junit.Test;
import desafio.qa.core.CoreBaseTest;
import desafio.qa.page.CategoriaPage;
import desafio.qa.util.Property;
import desafio.qa.util.Utils;

/**
 * <h1>Classe de teste contendo os casos de teste por palavra chave.</h1>
 * @author Thalya
 */
public class PalavraChaveTest extends CoreBaseTest {

	/**
	 * Caso de teste responsável por realiza buscar por palavra chave.
	 * 
	 * <pre>
	 * 1  - Acessa o plataforma Udemy
	 * 2  - Prenche campo 
	 * 3  - Pressiona tecla Enter 
	 * 4  - Coleta Evidencia 
	 * </pre>
	 */
	@Test
	public void buscaPorResultadoValido() {

		CategoriaPage categoriaPage = new CategoriaPage();

		driver.navigate().to(Property.URL);
		
		categoriaPage.buscarPorPalavraChave();
		
		Utils.takeScreenshot(driver, "buscaPorPalavraChave", "buscaComSucesso");

	}
	
	/**
	 * Caso de teste responsável por realiza buscar por palavra chave sem resultado.
	 * 
	 * <pre>
	 * 1  - Acessa o plataforma Udemy
	 * 2  - Prenche campo 
	 * 3  - Pressiona tecla Enter
	 * 4  - Valida mensagem 
	 * 5  - Coleta Evidencia 
	 * </pre>
	 */
	@Test
	public void resultadoNaoEncontrado() {

		CategoriaPage categoriaPage = new CategoriaPage();

		driver.navigate().to(Property.URL);
		
		categoriaPage.resultadoNaoEncontrado("Infelizmente, não encontramos resultados para asdjkl");
		Utils.takeScreenshot(driver, "buscaPorPalavraChave", "buscaNaoRetornouResultado");

	}

}
