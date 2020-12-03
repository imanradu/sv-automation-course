package restassured.test.catalog.skus;

import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import restassured.common.TestBase;
import restassured.common.TestGroup;
import restassured.model.SkusResponse;
import restassured.util.GetProperty;
import restassured.util.Utils;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static restassured.model.SkusResponseModel.skusResponseModel;

public class GetSkuById extends TestBase {

    private int skuId = 10000;

    @BeforeMethod
    public void beforeMethod() {
        setupTest();
    }

    @Test(groups = TestGroup.SANITY_TESTS)
    public void validationGetSkus() {
        Response response = given().spec(this.requestSpecification)
                                   .header("X-Violet-Token", this.token)
                                   .get(String.format(GetProperty.fromConfigProp("SKUS"), skuId));
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
    }

    @Test(groups = TestGroup.POSITIVE_TESTS)
    public void idValueAssertion() {
        SkusResponse response = given().spec(this.requestSpecification)
                                       .header("X-Violet-Token", this.token)
                                       .get(String.format(GetProperty.fromConfigProp("SKUS"), skuId))
                                       .as(SkusResponse.class);
        Assert.assertEquals(response.getId(), skuId,
                            "The received skuId: " + response.getId() +
                                    " is not matching the requested one: " + skuId);
    }

    @Test(groups = TestGroup.POSITIVE_TESTS)
    public void responseModelAssertion() {
        String response = given().spec(this.requestSpecification)
                                   .header("X-Violet-Token", this.token)
                                   .get(String.format(GetProperty.fromConfigProp("SKUS"), skuId)).asString();
        StringBuilder missingFields = Utils.missingFields(response, skusResponseModel);
        assertEquals(missingFields.length(), 0, "The following fields are missing: " + missingFields);
    }
}
