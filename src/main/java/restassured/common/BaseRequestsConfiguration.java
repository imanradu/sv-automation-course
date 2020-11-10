package restassured.common;

import org.apache.http.HttpHeaders;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.specification.RequestSpecification;
import restassured.util.GetProperty;

public class BaseRequestsConfiguration {

    public static RequestSpecification getRequestSpecification() {
        HeaderConfig headerConfig = HeaderConfig.headerConfig().overwriteHeadersWithName(TestBase.X_VIOLET_APP_ID,
                                                                                         TestBase.X_VIOLET_APP_SECRET);

        return RestAssured.given()
                .config(RestAssured.config().headerConfig(headerConfig))
                .baseUri(GetProperty.fromConfigProp("baseUrl"))
                .basePath(GetProperty.fromConfigProp("basePath"))
                .header(TestBase.X_VIOLET_APP_ID, GetProperty.fromConfigProp("X-Violet-App-Id"))
                .header(TestBase.X_VIOLET_APP_SECRET, GetProperty.fromConfigProp("X-Violet-App-Secret"))
                .header(HttpHeaders.CONTENT_TYPE, "application/json");
    }
}
