package gherkin.stepdefs;

import br.com.core.pojos.Users;
import br.com.core.setup.SetupManager;
import com.google.gson.Gson;
import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

import java.util.HashMap;

public class PostSteps extends SetupManager {


    @Quando("^eu realizar o POST$")
    public void euRealizarOPOST() {
        response = serviceFactory.ExecuteAPIWithBody(user);
    }

    @E("^eu tenha o nome \"([^\"]*)\" e o job \"([^\"]*)\"$")
    public void euTenhaONomeEOJob(String name, String job) throws Throwable {
        Gson gson = new Gson();
        user.setName(name);
        user.setJob(job);
        String json = gson.toJson(user);
    }


    @E("^eu tenha o email \"([^\"]*)\" e o password \"([^\"]*)\"$")
    public void euTenhaOEmailEOPassword(String email, String password) throws Throwable {
        Gson gson = new Gson();
        register.setEmail(email);
        register.setPassword(password);
        String json = gson.toJson(register);
    }

    @Quando("^eu realizar o registro$")
    public void euRealizarORegistro() {
        response = serviceFactory.ExecuteAPIWithBody(register);
    }

    @Quando("^eu realizar o login$")
    public void euRealizarOLogin() {
        response = serviceFactory.ExecuteAPIWithBody(register);
    }
}

