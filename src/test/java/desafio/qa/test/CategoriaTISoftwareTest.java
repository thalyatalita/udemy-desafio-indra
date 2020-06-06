package desafio.qa.test;

import org.junit.Test;
import desafio.qa.core.CoreBaseTest;
import desafio.qa.menu.page.MenuCategoriaPage;
import desafio.qa.menu.page.MenuTiSoftwarePage;
import desafio.qa.util.Property;
import desafio.qa.util.Utils;

/**
 * <h1>Classe de teste contendo os casos de teste da subCategoria TI e Software.</h1>
 * 
 * <pre>
 * Preconditions: 
 * </pre>
 *
 *@author Thalya
 */
public class CategoriaTISoftwareTest extends CoreBaseTest {
	
	/**
	 * Caso de teste responsável por realizar consulta por categoria TI e Software.
	 * 
	 * <pre>
	 * 1  - Acessa o plataforma Udemy
	 * 2  - Acessa Menu Categoria
	 * 3  - Acessa o subMenu TI e Software 
	 * 4  - Clica na subCategoria Hardware
	 * 5  - Realiza a validacao do texto na tela
	 * 6  - Coleta Evidencia 
	 * </pre>
	 */
	@Test
	public void consultarCategoriaTISoftware() {
		
		MenuCategoriaPage menuCategoriaPage = new MenuCategoriaPage();
		MenuTiSoftwarePage menu = new MenuTiSoftwarePage();
		
		driver.navigate().to(Property.URL);
		
		menuCategoriaPage.acessarMenuCategoria();
		menuCategoriaPage.moverCursorParaCategoriaTI();
		menu.acessarSubCategoriaHardware();
		menu.validarTitulo("Cursos de Hardware");
		Utils.takeScreenshot(driver, "consultarCategoriaTISoftware", "1-consultarCategoriaTISoftware");
	}
	

}
