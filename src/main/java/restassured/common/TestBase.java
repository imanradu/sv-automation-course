package restassured.common;

import io.restassured.specification.RequestSpecification;

public class TestBase {
    public static final String X_VIOLET_APP_SECRET = "X-Violet-App-Secret";
    public static final String X_VIOLET_APP_ID = "X-Violet-App-Id";

    protected RequestSpecification requestSpecification;
    protected String token;

    public void setupTest() {
        this.requestSpecification = BaseRequestsConfiguration.getRequestSpecification();
        this.token = GenerateToken.generateToken();

    }
}
