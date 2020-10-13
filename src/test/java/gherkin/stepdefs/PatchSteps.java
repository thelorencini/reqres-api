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

public class PatchSteps extends SetupManager {

    @E("^eu tenha o nome \"([^\"]*)\" e o job \"([^\"]*)\" e o id \"([^\"]*)\"$")
    public void euTenhaONomeEOJobEOId(String name, String job, String id) throws Throwable {
        parameters = new HashMap<>();
        parameters.put("id", id);
        Gson gson = new Gson();
        user.setName(name);
        user.setJob(job);
        String json = gson.toJson(user);
    }

    @Quando("^eu realizar o PATCH$")
    public void euRealizarOPATCH() {
        response = serviceFactory.ExecuteAPIWithPathParamsAndBody(user, parameters);
    }

}

