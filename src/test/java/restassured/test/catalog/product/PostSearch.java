package restassured.test.catalog.product;

import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import restassured.common.TestBase;
import restassured.model.SearchRequest;
import restassured.util.GetProperty;

import static io.restassured.RestAssured.given;
import static restassured.common.TestGroup.SANITY_TESTS;

public class PostSearch extends TestBase {
    private String page = "1";
    private String size = "20";
    private String excludePublic = "true";

    @BeforeMethod
    public void beforeMethod() {
        setupTest();
    }

    @Test(groups = SANITY_TESTS)
    public void validationGetProducts() {
        SearchRequest searchRequest = new SearchRequest.SearchRequestBuilder()
                .withMerchantId(0)
                .build();
        Response response = given().spec(this.requestSpecification)
                .header("X-Violet-Token", this.token)
                .header("page", page)
                .header("size", size)
                .header("exclude_public", excludePublic)
                .body(searchRequest)
                .post(GetProperty.fromConfigProp("SEARCH"));
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
    }
}
