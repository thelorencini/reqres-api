package gherkin.stepdefs;

import br.com.core.rest.ServiceFactory;
import br.com.core.setup.SetupManager;
import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import org.junit.Assert;

import java.util.HashMap;

import static br.com.core.report.ExtentReports.appendToReport;
import static org.hamcrest.core.IsEqual.equalTo;

public class GetSteps extends SetupManager {


    @Então("^o status code deverá ser \"([^\"]*)\"$")
    public void oStatusCodeDeveráSer(int statusCode) throws Throwable {
        Assert.assertThat(response.statusCode(), equalTo(statusCode));
        appendToReport(response.getBody().prettyPrint());
    }


    @Quando("^eu executar a operacao GET$")
    public void euFizerARequestComOsDados() {
        if(parameters == null || parameters.isEmpty()){
            response = serviceFactory.ExecuteAPIWithoutParameters();
        }else {
            response = serviceFactory.ExecuteAPIWithPathParams(parameters);
        }

    }


    @E("^eu tenha o id de user \"([^\"]*)\"$")
    public void euTenhaOIdDeUser(String id) throws Throwable {
        parameters = new HashMap<>();
        parameters.put("id", id);
    }

    @E("^eu tenha o id de resource \"([^\"]*)\"$")
    public void euTenhaOIdDeResource(String id) throws Throwable {
        parameters = new HashMap<>();
        parameters.put("id", id);
    }
}
