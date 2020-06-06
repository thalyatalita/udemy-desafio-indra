package desafio.qa.test;

import org.junit.Test;
import desafio.qa.core.CoreBaseTest;
import desafio.qa.page.MenuCategoriaPage;
import desafio.qa.page.MenuTiSoftwarePage;
import desafio.qa.util.Property;
import desafio.qa.util.Utils;

/**
 * <h1>Classe de teste contendo os casos de teste da subCategoria TI e Software.</h1>
 * @author Thalya
 */
public class CategoriaTISoftwareTest extends CoreBaseTest {
	
	/**
	 * Caso de teste responsável por acessar a tela da categoria TI e Software.
	 * 
	 * <pre>
	 * 1  - Acessa o plataforma Udemy
	 * 2  - Acessa Menu Categoria
	 * 3  - Clicar em TI e Software 
	 * 4  - Valida o titulo encontrado na tela com titulo esperado
	 * 5  - Coleta Evidencia 
	 * </pre>
	 */
	@Test
	public void acessarCategoriaTISoftware() {
		
		MenuCategoriaPage categoriaPage = new MenuCategoriaPage();
		
		driver.navigate().to(Property.URL);
		
		categoriaPage.menuCategoria();
		categoriaPage.acessarCategoriaTI();
		categoriaPage.validarTitulo("Cursos de TI e software");
		Utils.takeScreenshot(driver, "CategoriaTISoftware", "telaCategoriaTISoftware");
	}
	
	/**
	 * Caso de teste responsável por acessar a tela da subCategoria Hardware.
	 * 
	 * <pre>
	 * 1  - Acessa a plataforma Udemy
	 * 2  - Acessa Menu Categoria
	 * 3  - Acessa subMenu TI e Software 
	 * 4  - Clica em Hardware
	 * 5  - Valida o titulo encontrado na tela com o esperado
	 * 6  - Coleta Evidencia 
	 * </pre>
	 */
	@Test
	public void acessarSubCategoriaHardware() {
		
		MenuCategoriaPage categoriaPage = new MenuCategoriaPage();
		MenuTiSoftwarePage subCategoriaTI = new MenuTiSoftwarePage();
		
		driver.navigate().to(Property.URL);
		
		categoriaPage.menuCategoria();
		categoriaPage.moverCursorParaCategoriaTI();
		subCategoriaTI.acessarSubCategoriaHardware();
		subCategoriaTI.validarTitulo("Cursos de Hardware");
		Utils.takeScreenshot(driver, "CategoriaTISoftware", "telaCursoHardware");
	}
	
	/**
	 * Caso de teste responsável por acessar um dos topidos da SubCategoria Hardware, a tela dos Cursos Arduino.
	 * 
	 * <pre>
	 * 1  - Acessa a plataforma Udemy
	 * 2  - Acessa Menu Categoria
	 * 3  - Acessa subMenu TI e Software 
	 * 4  - Acessa subCategoria Hardware
	 * 5  - Clica em Arduino
	 * 6  - Valida o titulo encontrado na tela com o esperado
	 * 7  - Coleta Evidencia 
	 * </pre>
	 */
	@Test
	public void acessarTopicoDaSubCategoria() {
		
		MenuCategoriaPage categoriaPage = new MenuCategoriaPage();
		MenuTiSoftwarePage subCategoriaTI = new MenuTiSoftwarePage();
		
		driver.navigate().to(Property.URL);
		
		categoriaPage.menuCategoria();
		categoriaPage.moverCursorParaCategoriaTI();
		subCategoriaTI.moverCursorSubCategoriaHardware();
		subCategoriaTI.acessarTopicoCurso();
		subCategoriaTI.validarTituloDois("Cursos de Arduino");
		Utils.takeScreenshot(driver, "CategoriaTISoftware", "telaCursoArduino");
	}
	
}
