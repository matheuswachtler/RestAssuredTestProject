package utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;

public class Specifications {

    public static RequestSpecification headerSpecification;

    public static ResponseSpecification responseSpecification;

    public static final String BASE_ENDPOINT = "https://dummyjson.com/";

    @BeforeAll
    public static void setUp() {

        headerSpecification = new RequestSpecBuilder()
                        .setBaseUri(BASE_ENDPOINT)
                        .setContentType(ContentType.JSON)
                        .addHeader("Authorization", TokenManager.getAuthToken())
                        .build();

        responseSpecification = new ResponseSpecBuilder()
                        .expectStatusCode(200)
                        .expectContentType(ContentType.JSON)
                        .build();
    }
}



