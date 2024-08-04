package cat.itacademy.barcelonactiva.augustin.nae.s04.t02.n01.S04T02N01AugustinNae;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import cat.itacademy.barcelonactiva.augustin.nae.s04.t02.n01.S04T02N01AugustinNae.model.domain.Fruit;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FruitControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void addFruitShouldReturnCreatedStatus() {
        Fruit newFruit = new Fruit("Banana", 5);
        ResponseEntity<Fruit> response = restTemplate.postForEntity("/fruits/add", newFruit, Fruit.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
    }
}
