package go.livespring.livespring1;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.web.servlet.MockMvc;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class TransactionControllerComponentTest {

    @LocalServerPort
    private int port;


    TransactionController transactionController;

    @BeforeEach
    void setUp() {
        System.out.println("TransactionControllerTest");
    }

    @Test
    void getTransactions() throws Exception {
        String GETURL= "/transactions?accountNumber=1";
        given().port(port).when().get(GETURL).then().assertThat().statusCode(200);
    }

    @Test
    void raConfigTest() {
        assertThat(RestAssured.config(), instanceOf(RestAssuredConfig.class));
    }
}