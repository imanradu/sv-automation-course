package restassured.common;

import io.restassured.specification.RequestSpecification;
import restassured.model.LoginRequest;
import restassured.model.LoginResponse;
import restassured.util.GetProperty;

import static io.restassured.RestAssured.given;

public class GenerateToken {
    private static LoginRequest loginRequest = LoginRequest.create(
            GetProperty.fromConfigProp("apiUser"),
            GetProperty.fromConfigProp("apiPassword")
    );

    static String generateToken() {
        RequestSpecification requestSpecification = BaseRequestsConfiguration.getRequestSpecification();

        return given().spec(requestSpecification)
                .body(loginRequest)
                .post(GetProperty.fromConfigProp("LOGIN"))
                .as(LoginResponse.class)
                .getToken();
    }
}
