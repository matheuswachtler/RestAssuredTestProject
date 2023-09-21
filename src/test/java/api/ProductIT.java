package api;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.jupiter.api.Test;
import utils.Specifications;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ProductIT extends Specifications {

    private static final String BODY_REQUEST = "{\"title\":\"Galaxy S3 Plus\"}";
    public static final String PRODUCT_ENDPOINT = "products/1";
    public static final String ADD_PRODUCT_ENDPOINT = "products/add";

    @Test
    public void shouldUpdateProduct(){

        given()
                .spec(headerSpecification)
                .body(BODY_REQUEST)
                .log().all()
        .when()
                .put(PRODUCT_ENDPOINT)
        .then()
                .spec(responseSpecification)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/product/updateProductSchema.json"))
                .body("title", is("Galaxy S3 Plus"))
                .log().all();
    }

    @Test
    public void shouldDeleteProduct(){

        given()
                .spec(headerSpecification)
                .log().all()
        .when()
                .delete(PRODUCT_ENDPOINT)
        .then()
                .spec(responseSpecification)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/product/deleteProductSchema.json"))
                .body("isDeleted", equalTo(true))
                .log().all();
    }

    @Test
    public void shouldFindSingleProduct(){

        given()
                .spec(headerSpecification)
                .log().all()
        .when()
                .get(PRODUCT_ENDPOINT)
        .then()
                .spec(responseSpecification)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/product/getSingleProductSchema.json"))
                .body("title", is("iPhone 9"))
                .log().all();
    }

    @Test
    public void shouldAddNewItem(){

        given()
                .spec(headerSpecification)
                .body(BODY_REQUEST)
                .log().all()
        .when()
                .post(ADD_PRODUCT_ENDPOINT)
        .then()
                .spec(responseSpecification)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/product/addProductSchema.json"))
                .body("id", notNullValue())
                .body("title", is("Galaxy S3 Plus"))
                .log().all();
    }
}