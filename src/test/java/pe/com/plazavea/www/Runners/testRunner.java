package pe.com.plazavea.www.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="feature/AgregarCarrito.feature",
glue="pe.com.plazavea.www.definitions",
plugin={"pretty","html:C:\\Users\\SQA\\Pictures2\\Saved Pictures"
		})

public class testRunner {

}
