package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import utils.Specifications;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserIT extends Specifications {

    public static final String USER_ENDPOINT = "users/1";
    public static final String ADD_USER_ENDPOINT = "users/add";
    public static final String ADD_USER_BODY_REQUEST = "{\"firstName\":\"Muhammad\",\"lastName\":\"Ovi\",\"age\":250}";

    @Test
    public void shouldGetSingleUser(){

        given()
                .spec(headerSpecification)
                .log().all()
        .when()
                .get(USER_ENDPOINT)
        .then()
                .spec(responseSpecification)
                .body("firstName", equalTo("Emily"))
                .log().all();
    }

    @Test
    public void shouldAddNewUser(){

        given()
                .spec(headerSpecification)
                .body(ADD_USER_BODY_REQUEST)
                .log().all()
        .when()
                .post(ADD_USER_ENDPOINT)
        .then()
                .spec(responseSpecificationCreated)
                .body("lastName", equalTo("Ovi"))
                .log().all();
    }

    @Test
    public void shouldUpdateUser(){

        given()
                .spec(headerSpecification)
                .log().all()
        .when()
                .put(USER_ENDPOINT)
        .then()
                .spec(responseSpecification)
                .body("maidenName", is("Smith"))
                .log().all();

    }

    @Test
    public void shouldDeleteUser(){

        given()
                .spec(headerSpecification)
                .log().all()
        .when()
                .delete(USER_ENDPOINT)
        .then()
                .spec(responseSpecification)
                .body("birthDate", is("1996-5-30"))
                .log().all();
    }

}
