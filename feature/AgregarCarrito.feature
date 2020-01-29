#Author: your.email@your.domain.com

@AgregarCarrito
Feature: add a product to the shopping cart
I want to add a product to the cart of the plazavea page

  @Compraexitosa
  Scenario: successful purchase
    Given that I go to Plazavea home page
		And I click on electro and home		
    When I write the name of the product I need
    And click on the product
    And click add
    Then verify purchase
    


