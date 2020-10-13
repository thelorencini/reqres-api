package gherkin.stepdefs;

import br.com.core.setup.SetupManager;
import cucumber.api.java.pt.Quando;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

public class DeleteSteps extends SetupManager {


    @Quando("^eu realizar o DELETE$")
    public void euRealizarOPATCH() {
        if(parameters == null || parameters.isEmpty()){
            response = serviceFactory.ExecuteAPIWithoutParameters();
        }else {
            response = serviceFactory.ExecuteAPIWithPathParams(parameters);
        }
    }

}

