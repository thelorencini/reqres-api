package br.com.core.setup;

import br.com.core.pojos.Register;
import br.com.core.pojos.Users;
import br.com.core.rest.ServiceFactory;
import cucumber.api.Scenario;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

import java.util.HashMap;


public class SetupManager {
    public static Scenario testScenario;
    public static ServiceFactory serviceFactory;
    public static HashMap<String, String> parameters;
    public static Users user = new Users();
    public static Register register = new Register();
    public static ResponseOptions<Response> response;
}
