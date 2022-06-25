package tw.com.redhat;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.containsString;

@QuarkusTest
public class CustomerTest {

    @Test
    public void testCustomerEndpoint() {
        given()
                .when().get("/customer")
                .then()
                .statusCode(200)
                .body(containsString("Customer"));
    }

}