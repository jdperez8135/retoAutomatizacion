package pe.com.plazavea.www.plazavea.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;





@DefaultUrl("https://www.plazavea.com.pe/")
public class PlazaveaPagPrincipal extends PageObject {


	
	//con la linea de abajo se crea la pripiedad con el localizador que necesito
	@FindBy(xpath="//*[@id=\"search_box\"]")
	WebElement txtBuscar;
	
	@FindBy(xpath="//*[@id=\"search\"]/div/div[2]/div/div/div[1]/div[2]/div/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/a")
	WebElement btnClicProducto;
	
	@FindBy(xpath="//*[@id=\"ProductCard__add-to-cart\"]")
	WebElement btnAgregar;
	
	@FindBy(xpath="/html/body/div[3]/header/div[1]/section[3]/div/div[1]/div[1]")
	WebElement btnVerificarCompra;
	
	//con la linea de abajo le indico que accion realizar con la propiedad ya creada 	
	public void clicDesplegable() {
		txtBuscar.click();
	}
	
	public void writeData(String producto) {
		txtBuscar.sendKeys(producto);
	
	}
	
public void clicProducto() {
		
	btnClicProducto.click();
	
	}
	
	public void clicAgregar() {
		
		btnAgregar.click();
	
	}
	
public void clicVerificarCompra() {
		
	btnVerificarCompra.click();
	
	}
	

	
	
	
}
