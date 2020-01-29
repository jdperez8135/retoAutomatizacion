package pe.com.plazavea.www.plazavea.pages;

import net.thucydides.core.annotations.Step;

public class BuscarProducto {

//aca se crea un objeto que va a llamar los metodos de la clase PlazaVeaPagPrincipal
PlazaveaPagPrincipal plazavea = new PlazaveaPagPrincipal();
	
String producto ="huawei p20";


@Step("that I go to Plazavea home page")
public void openApplication() {
	// .open() is a Page Object method. I will use it to open the
	// webpage specified in the @DefaultUrl of PlazaveaPagPrincipal
	plazavea.open();
	
}

//aca se llama la funcion o el metodo que necesito
@Step("I click on electro and home")
public void clicDesplegable() {
	// Click on log in button.
	plazavea.clicDesplegable();
	
	
	// Write data in the text fields
	
}

@Step("I write the name of the product I need")
public void sendData() {
	// Write data in the text fields
	
	
	 try {
		 plazavea.writeData(producto);
     } catch (Exception ex) {
         System.out.print("error de compra");
     }

	
	
	

	// Click on log in button.
	//loginPOM.clickOnLoginButton();
}

@Step("click on the product")
public void clicProducto() {
	// Write data in the text fields
	plazavea.clicProducto();

	// Click on log in button.
	//loginPOM.clickOnLoginButton();
}

@Step("click add")
public void agregarCarrito() {
	// Write data in the text fields
	plazavea.clicAgregar();


	// Click on log in button.
	//loginPOM.clickOnLoginButton();
}

@Step("verify purchase")
public void verificarCompra() {
	// Write data in the text fields
	plazavea.clicVerificarCompra();


	// Click on log in button.
	//loginPOM.clickOnLoginButton();
}


}
