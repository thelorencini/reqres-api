package gherkin.stepdefs;

import br.com.core.pojos.Users;
import br.com.core.setup.SetupManager;
import com.google.gson.Gson;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

import java.util.HashMap;

public class PutSteps extends SetupManager {


    @Quando("^eu realizar o PUT$")
    public void euRealizarOPATCH() {
        response = serviceFactory.ExecuteAPIWithPathParamsAndBody(user, parameters);
    }

}

