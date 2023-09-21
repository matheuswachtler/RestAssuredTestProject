package api;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.jupiter.api.Test;
import utils.Specifications;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CartIT extends Specifications {

    public static final String CART_ENDPOINT = "carts/1";
    public static final String ADD_CART_ENDPOINT = "carts/add";
    public static final String BODY_REQUEST = "{\"products\": [{\"id\": 1, \"quantity\": 1}]}";
    public static final String ADD_CART_BODY_REQUEST = "{\"userId\": 1, \"products\": [{\"id\": 1, \"quantity\": 1}, {\"id\": 50, \"quantity\": 2}]}";

    @Test
    public void shouldFindSingleCart(){

        given()
                .spec(headerSpecification)
                .log().all()
        .when()
                .get(CART_ENDPOINT)
        .then()
                .spec(responseSpecification)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/cart/getSingleCartSchema.json"))
                .body("products[0].title", is("Spring and summershoes"))
                .body("products[1].price", is(29))
                .body("products[2].total", is(80))
                .log().all();
    }

    @Test
    public void shouldUpdateCart(){

        given()
                .spec(headerSpecification)
                .body(BODY_REQUEST)
                .log().all()
        .when()
                .put(CART_ENDPOINT)
        .then()
                .spec(responseSpecification)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/cart/updateCartSchema.json"))
                .body("products[0].quantity", is(1))
                .log().all();

    }

    @Test
    public void shouldAddNewCart(){

        given()
                .spec(headerSpecification)
                .body(ADD_CART_BODY_REQUEST)
                .log().all()
        .when()
                .post(ADD_CART_ENDPOINT)
        .then()
                .spec(responseSpecification)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/cart/addCartSchema.json"))
                .body("products[1].id",is(50))
                .log().all();

    }

    @Test
    public void shouldDeleteCart(){

        given()
                .spec(headerSpecification)
                .log().all()
        .when()
                .delete(CART_ENDPOINT)
        .then()
                .spec(responseSpecification)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/cart/deleteCartSchema.json"))
                .body("products[2].title", is("Oil Free Moisturizer 100ml"))
                .log().all();
    }
}
