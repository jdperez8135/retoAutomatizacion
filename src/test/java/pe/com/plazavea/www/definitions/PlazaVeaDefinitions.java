package pe.com.plazavea.www.definitions;

import pe.com.plazavea.www.plazavea.pages.BuscarProducto;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PlazaVeaDefinitions {

	String producto = "huawei p20";
	
	
	@Steps // The @Steps annotation marks a Serenity step library
	BuscarProducto buscar;
	
	
	// These methods speak by themselves. 
	@Given("^that I go to Plazavea home page$")
	public void that_I_go_to_Plazavea_home_page() {
	    buscar.openApplication();
	}
	
	@When("^I click on electro and home$")
	public void I_click_on_electro_and_home() {
	   
		buscar.clicDesplegable();
	}
	
	@When("^I write the name of the product I need$")
	public void I_write_the_name_of_the_product_I_need() {
	   
		buscar.sendData();
	}
	
	@When("^click on the product$")
	public void click_on_the_product() {
	   
		
		buscar.clicProducto();
	}
	
	@When("^click add$")
	public void click_add() {
	   
		
		buscar.agregarCarrito();
	}
	
	@When("^verify purchase$")
	public void verify_purchase() {
	   
		
		buscar.verificarCompra();
	}


}
