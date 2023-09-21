package utils;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class TokenManager {
    private static final String GET_TOKEN_ENDPOINT = "https://dummyjson.com/auth/login";
    private static final String REQUEST_BODY = "{ \"username\": \"kminchelle\", \"password\": \"0lelplR\" }";
    public static String getAuthToken(){

        return "Bearer " +

                given()
                        .contentType(ContentType.JSON)
                        .body(REQUEST_BODY)
                        .when()
                        .post(GET_TOKEN_ENDPOINT)
                        .then()
                        .extract()
                        .path("token");
    }
}