package api;

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
                .body("products[0].title", is("Charger SXT RWD"))
                .body("products[1].price", is(1999.99F))
                .body("products[2].total", is(124.95F))
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
                .spec(responseSpecificationCreated)
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
                .body("products[2].title", is("Green Oval Earring"))
                .log().all();
    }
}
