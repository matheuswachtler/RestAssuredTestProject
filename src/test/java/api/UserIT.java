package api;


import io.restassured.module.jsv.JsonSchemaValidator;
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
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/user/getSingleUserSchema.json"))
                .body("firstName", equalTo("Terry"))
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
                .spec(responseSpecification)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/user/addUserSchema.json"))
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
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/user/updateUserSchema.json"))
                .body("maidenName", is("Smitham"))
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
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/user/deleteUserSchema.json"))
                .body("birthDate", is("2000-12-25"))
                .log().all();
    }

}
